package javafiles;
import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnect {  
    private Connection con;
    private String query;
    private Statement stmt;
    private PreparedStatement pstmt;
    private ResultSet rs;
    final static int ACCOUNT_TABLE=0;
    final static int STAFF_TABLE = 1;
    final static int CUSTOMER_TABLE=2;
    final static int HOTEL_TABLE=3;
    final static int ROOM_TABLE=4;
    final static int RESTAURANT_TABLE=5;
    final static int MEAL_TABLE=6;
    final static int ACC_ROOMS_TABLE= 7;
    final static int ACC_MEAL_TABLE= 8;

    public DBConnect() {
        String url ="jdbc:derby://localhost:1527/OPTA v5";
        String user = "OPTA";
        String password = "OPTA";
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            
             Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     // 10/6
    public  boolean login(String email,String password) { 
        query = "select * from account where email = ? and password = ? ";
        //DBConnect
        try{
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, email);
            pstmt.setString(2, password);
            rs = pstmt.executeQuery();
            return rs.next(); 

        }catch(SQLException ex){
            System.out.println("error query login");
        }
        return false;
    }
    
    // 10/6
    public boolean addStaff(Staff stf) {
        try {
            addAccount(stf);
            InsertIntoTable(STAFF_TABLE);
            pstmt=con.prepareStatement(query+ " Values(?,?,?,?,?)");
            pstmt.setInt(1,stf.getStaffID());
            pstmt.setString(2,stf.getSalary());
            pstmt.setString(3,stf.getPosition());
            pstmt.setString(4,stf.getEmail());
            pstmt.setInt(5,stf.getHotelID());
            pstmt.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    // 10/6
    public boolean addCustomer(Customer cust) {
        try {
            addAccount(cust);
            InsertIntoTable(CUSTOMER_TABLE);
            pstmt = con.prepareStatement( query + " Values(?)");
            pstmt.setString(1,cust.getEmail());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean addAccount(Account acc) throws SQLException{
        InsertIntoTable(ACCOUNT_TABLE);
        pstmt = con.prepareStatement( query + "(EMAIL, FNAME, LNAME, GENDER, ACCID, PASSWORD, ROLE, STREETNAME, PHONE) Values(?,?,?,?,?,?,?,?,?)");
        pstmt.setString(1, acc.getEmail());
        pstmt.setString(2, acc.getFname());
        pstmt.setString(3, acc.getLname());
        pstmt.setString(4, String.valueOf(acc.getGender()));
        pstmt.setString(5, acc.getAccID());
        pstmt.setString(6, acc.getPassword());
        pstmt.setString(7, acc.getRole());
        pstmt.setString(8, acc.getAddress());
        pstmt.setString(9, acc.getPhone());
        pstmt.executeUpdate();
        return true;
    }
    /*
    public boolean createReservation(Reservation resv)  
    {
        try {
            InsertIntoTable(RESERVATION_TABLE);
            pstmt=con.prepareStatement(query + " Values(?,?,?,?,?,?,?,?)");//8 Parameters
            pstmt.setDouble(1,resv.getTotalPrice());
            pstmt.setInt   (2,resv.getNumberOfMeal());
            pstmt.setInt   (3,resv.getMealID());
            pstmt.setInt   (4,resv.getRoomID());
            pstmt.setString(5,resv.getAccID() );
            pstmt.setString(6,resv.getEndDate());
            pstmt.setString(7,resv.getArrivalDate());
            pstmt.setString(8,resv.getPaymentType());
            pstmt.executeUpdate();
            //always remember to close database connections
            //con.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    */
    // 10/6
    public boolean createReservationMealsOnly(ReservationMeal resv)
    {
        try {
            InsertIntoTable(ACC_MEAL_TABLE);
            pstmt=con.prepareStatement(query + " (NUMBEROFMEALS, MEALID, ACCOUNTEMAIL, PaymentType) "
                                             + " values (?,?,?,?)");
            pstmt.setInt   (1,resv.getNumberOfMeal());
            pstmt.setInt   (2,resv.getMealID());
            pstmt.setString(3,resv.getEmail());
            pstmt.setString(4,resv.getPaymentType());
            pstmt.executeUpdate();
            //always remember to close database connections
            //con.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    double calcTotalPriceRooms(int numberOfRooms, int roomID){
        double totalPrice = 0.0;
        String query2 = "SELECT PRICE FROM ROOMS WHERE ROOMID =?";
        PreparedStatement pstmt2;
        try {
            
            pstmt2 = con.prepareStatement(query2);
            pstmt2.setInt(1, roomID);
            ResultSet rs2 = pstmt2.executeQuery();
            rs2.next();
            totalPrice = rs2.getDouble("PRICE");
            totalPrice *= numberOfRooms;
        } catch (SQLException ex) {
            System.out.println("ERROR IN CALCTOTALPRICE ROOOOOOOOOOOMSSSSSSSSSSSSSSSSSS!!!!!!!!!!Q");
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalPrice;
    }
    
    // 10/6
    public boolean createReservationRoomOnly(ReservationRooms resv)
    {   
        
        try {
           // pstmt.executeQuery("update ROOMS set AVAILABLEROOMS = (select AVAILABLEROOMS from ROOMS where ID = ?)-1 where ID = ?");
            pstmt=con.prepareStatement("update ROOMS set AVAILABLEROOMS = (select AVAILABLEROOMS from ROOMS where ROOMID = ?)- ? where ROOMID = ?");
            pstmt.setInt(1, resv.getRoomID());
            pstmt.setInt(2, resv.getNumberOfRooms());
            pstmt.setInt(3, resv.getRoomID());
            pstmt.executeUpdate();
            InsertIntoTable(ACC_ROOMS_TABLE);
            
            pstmt=con.prepareStatement(query + " (RoomID, ACCOUNTEMAIL, ArrivalDate, EndDate, PAYMENTYPE, NumberofRooms,Amenties) "
                                             + " values (?,?,?,?,?,?,?)");
            
            //pstmt.setDouble(1,resv.getTotalPrice() );
            pstmt.setInt   (1,resv.getRoomID()     );
            pstmt.setString(2,resv.getEmail()      );
            pstmt.setDate(3,resv.getArrivalDate());
            pstmt.setDate(4,resv.getEndDate()    );
            pstmt.setString(5,resv.getPaymentType());
            pstmt.setInt   (6,resv.getNumberOfRooms());
             pstmt.setString   (7,resv.getAmenties());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    // 10/6
    public boolean getMealInfo(Meal m){//Can be used for searching, requires only ID
        try {
            selectTable(MEAL_TABLE);
            pstmt = con.prepareStatement(query + " Where MealID = ? ");
            pstmt.setInt(1, m.getMealID());
            rs = pstmt.executeQuery();
            rs.next(); 
            m.setName(rs.getString("Name"));
            m.setPrice(rs.getDouble("Price"));
            m.setResID(rs.getInt("RESID"));
            return true;
        }

        catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    double calcTotalPriceMeals(int mealID, int numberOfMeals){
        double totalPrice=0.0;
        String query2 = "SELECT price FROM MEAL WHERE MEALID=?";
        try {
            PreparedStatement pstmt2 = con.prepareStatement(query2);
            pstmt2.setInt(1, mealID);
            ResultSet rs2 = pstmt2.executeQuery();
            rs2.next();
            totalPrice = rs2.getDouble("PRICE");
            totalPrice *= numberOfMeals;
        } catch (SQLException ex) {
            System.out.println("ERROR IN CALC TOTAL PRICE FUNCTION!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalPrice;
    }
    
    
    // 10/6
    public boolean viewReservationsMeals(ReservationMeal res) // for future need
    {
        try{
            int mealID=0,numberOfMeals;
            selectTable(ACC_MEAL_TABLE);
            pstmt=con.prepareStatement(query+" WHERE ACCOUNTEMAIL = ? ");
            pstmt.setString(1, res.getEmail());
            rs=pstmt.executeQuery();
            rs.next();
            mealID = rs.getInt("MEALID");
            numberOfMeals = rs.getInt("NUMBEROFMEALS");
            res.setMealID      (mealID);
            res.setNumberOfMeal(numberOfMeals);
            res.setTotalPrice  (calcTotalPriceMeals(mealID,numberOfMeals));
            res.setPaymentType (rs.getString("PaymentType"));
            return true;
        }
        catch(SQLException ex){
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
        public ReservationRooms[] viewReservationsRooms(String email)
    {
        ReservationRooms reses[]= null;
        try{
            pstmt = con.prepareStatement("SELECT COUNT (*) FROM ACCOUNT_ROOMS WHERE ACCOUNTEMAIL= ?");
            pstmt.setString(1, email);
            rs = pstmt.executeQuery();
            rs.next();       
            reses = new ReservationRooms[rs.getInt(1)];
            selectTable(ACC_ROOMS_TABLE);
            pstmt=con.prepareStatement(query+" WHERE ACCOUNTEMAIL = ? ");
            pstmt.setString(1, email);
            rs=pstmt.executeQuery();
            int i=0;
            while(rs.next())
            {
                reses[i]=new ReservationRooms();
                reses[i].setEmail(email);
                reses[i].setRoomID(rs.getInt("ROOMID"));
                reses[i].setArrivalDate(rs.getDate("ARRIVALDATE"));
                reses[i].setEndDate(rs.getDate("ENDDATE"));
                reses[i].setNumberOfRooms(rs.getInt("NUMBEROFROOMS"));
                reses[i].setPaymentType(rs.getString("PAYMENTYPE"));
                reses[i].setTotalPrice(calcTotalPriceRooms(reses[i].getNumberOfRooms(),reses[i].getRoomID()));
                i++;
            }
            return reses;
        }
        catch(SQLException ex){
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return reses;
        }
    }
    //updated 10/6/2022
    public ReservationMeal[] viewReservationsMeals(String email)
    {
        ReservationMeal reses[]= null;
        try{
            pstmt = con.prepareStatement("SELECT COUNT (*) FROM ACCOUNT_MEAL WHERE ACCOUNTEMAIL= ?");
            pstmt.setString(1, email);
            rs = pstmt.executeQuery();
            rs.next();       
            reses = new ReservationMeal[rs.getInt(1)];
            selectTable(ACC_MEAL_TABLE);
            pstmt=con.prepareStatement(query+" WHERE ACCOUNTEMAIL = ? ");
            pstmt.setString(1, email);
            rs=pstmt.executeQuery();
            int i=0;
            while(rs.next())
            {
                reses[i]=new ReservationMeal();
                reses[i].setEmail(email);
                reses[i].setMealID(rs.getInt("MEALID"));
                reses[i].setNumberOfMeal(rs.getInt("NUMBEROFMEALS"));
                reses[i].setTotalPrice(calcTotalPriceMeals(reses[i].getMealID(),reses[i].getNumberOfMeal()));
                i++;
            }
            return reses;
        }
        catch(SQLException ex){
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return reses;
        }
    }
    //updated 10/6/2022
    public boolean deleteReservationMeal (String email) //delete all
    {
        deleteTable(ACC_MEAL_TABLE);
        try{
            pstmt=con.prepareStatement(query + "WHERE ACCOUNTEMAIL = ?");
            pstmt.setString(1, email);
            pstmt.executeUpdate();
            return true;
        }
         catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
    //updated 10/6
    public boolean deleteMealReservation (String email ,int MealID)
    {
        deleteTable(ACC_MEAL_TABLE);
        try{
            pstmt=con.prepareStatement(query+" Where ACCOUNTEMAIL=? and MEALID = ? ");
            pstmt.setString(1, email);
            pstmt.setInt(2, MealID);
            pstmt.executeUpdate();
            return true;
        }
         catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
    
    //10/6
public boolean deleteRoomReservation (String email ,int RoomID)
    {
        try{
           //System.out.println(getNumberofReservationRooms(ACCID, RoomID)+ "db conn "); 
            int number = getNumberofReservationRooms(email, RoomID);
            pstmt=con.prepareStatement("update ROOMS set AVAILABLEROOMS = (select AVAILABLEROOMS from ROOMS where ROOMID = ?) + ? where ROOMID = ?");
            pstmt.setInt(1, RoomID);
            pstmt.setInt(2, number);
            pstmt.setInt(3, RoomID);
            pstmt.executeUpdate();
            
            deleteTable(ACC_ROOMS_TABLE);
            
            pstmt=con.prepareStatement(query+" WHERE ACCOUNTEMAIL =? and roomID = ?");
            pstmt.setString(1, email);
            pstmt.setInt(2, RoomID);
            pstmt.executeUpdate();
            return true;
        }
        catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
// updated 14/6/2022
    public int getNumberofReservationRooms(String email, int roomID){
    
        try {
            //selectTable(ACC_ROOMS_TABLE);
            pstmt = con.prepareStatement("SELECT sum(NUMBEROFROOMS) as numbers FROM ACCOUNT_ROOMS" + " Where ACCOUNTEMAIL = ? and ROOMID = ?");
            pstmt.setString(1, email);
            pstmt.setInt(2, roomID);
            rs = pstmt.executeQuery();
            rs.next();
            return rs.getInt("numbers");
        }

        catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
    public boolean deleteStaff (String ACCID)
    {
        deleteTable(STAFF_TABLE);
        try{
            pstmt=con.prepareStatement(query);
            pstmt.setString(1, ACCID);
            pstmt.executeUpdate();
            deleteAccount(ACCID);
            return true;
        }
         catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public boolean deleteCustomer(String ACCID)
    {
        deleteTable(CUSTOMER_TABLE);
        try{
            pstmt=con.prepareStatement(query);
            pstmt.setString(1, ACCID);
            pstmt.executeUpdate();
            deleteAccount(ACCID);
            return true;
        }
         catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    private boolean deleteAccount (String ACCID) throws SQLException
    {
        deleteTable(ACCOUNT_TABLE);
        pstmt=con.prepareStatement(query);
        pstmt.setString(1, ACCID);
        pstmt.execute();
        System.out.println("ok!");
        return true;
    }
    
    private boolean deleteRoom (int roomID)
    {
        try {
            deleteTable(ROOM_TABLE);
            pstmt=con.prepareStatement(query);
            pstmt.setInt(1, roomID);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    private boolean deleteMealUsingMealID (int mealID)
    {
        try {
            deleteTable(MEAL_TABLE);
            pstmt=con.prepareStatement(query + " WHERE MEALID = ?");
            pstmt.setInt(1, mealID);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    private boolean deleteMealUsingRestaurantID (int restaurantID)
    {
        try {
            deleteTable(MEAL_TABLE);
            pstmt=con.prepareStatement(query + " WHERE RESTURANTID = ?");
            pstmt.setInt(1, restaurantID);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    private boolean deleteRestaurant (int restaurantID)
    {
        deleteMealUsingRestaurantID(restaurantID);
        try {
            deleteTable(RESTAURANT_TABLE);
            pstmt=con.prepareStatement(query + " WHERE RESTURANID =?");
            pstmt.setInt(1, restaurantID);
            pstmt.executeUpdate();
            //System.out.println("ok!");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    /*
    public boolean updateReservation(Reservation res)
    {
        updateTable(ACC_ROOMS_TABLE);
        try {
            pstmt=con.prepareStatement(query+" ARRIVALDATE = ? , NUMBEROFMEALS = ? and ACCID = ? and ROOMID = ? and MEALID = ?" );
            pstmt.setString(1,res.getArrivalDate() );
            pstmt.setInt   (2,res.getNumberOfMeal());
            pstmt.setString(3, res.getAccID() );
            pstmt.setInt   (4, res.getRoomID());
            pstmt.setInt   (5, res.getMealID());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }     
    }
    */
       //updated 14/5/2022
    public boolean updateRoomAvailablity(int availablity, int roomID)
    {
        try {
            updateTable(ROOM_TABLE);
            pstmt=con.prepareStatement(query+ " AvailableRooms = ? WHERE roomID=? ");
            pstmt.setInt(1, availablity);
            pstmt.setInt(2, roomID);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    //updated 14/5/2022
    public int getAvailableRooms(int roomID)
    {
        try {
            selectTable(ROOM_TABLE);
            pstmt=con.prepareStatement(query+ "WHERE roomID=? ");
            pstmt.setInt(1,roomID);
            rs=pstmt.executeQuery();
            rs.next();
            return rs.getInt("AVAILABLEROOMS");
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }           
    }
    public boolean getCustomerInfo(Customer s){//Can be used for searching, requires only ID
        try {
            selectTable(ACCOUNT_TABLE);
            pstmt = con.prepareStatement(query + " Where ACCID = ?");
            pstmt.setString(1, s.getAccID());
            rs = pstmt.executeQuery();
            rs.next(); 
            s.setFname(rs.getString("FNAME"));
            s.setLname(rs.getString("LNAME"));
            s.setGender(rs.getString("GENDER").charAt(0));
            s.setPhone(rs.getString("PHONE"));
            return getAccountInfoUsingAccID(s);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean getStaffInfo(Staff s){//Can be used for searching, requires only ID
        try {
            selectTable(STAFF_TABLE);
            pstmt = con.prepareStatement(query + " Where STAFF_ID = ?");
            pstmt.setString(1, s.getAccID());
            rs = pstmt.executeQuery();
            rs.next(); 
            s.setFname(rs.getString("FNAME"));
            s.setLname(rs.getString("LNAME"));
            s.setGender(rs.getString("GENDER").charAt(0));
            s.setPhone(rs.getString("PHONE"));
            s.setPosition(rs.getString("POSITION"));
            s.setSalary(rs.getString("SALARY"));
            return getAccountInfoUsingAccID(s);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
 
    private boolean getAccountInfoUsingAccID(Account s)
    {
        try {
            selectTable(ACCOUNT_TABLE);
            pstmt = con.prepareStatement(query + " Where ACCID = ?");
            pstmt.setString(1, s.getAccID());
            rs = pstmt.executeQuery();
            rs.next(); 
            s.setEmail(rs.getString("EMAIL"));
            s.setRole(rs.getString("ROLE"));
            s.setPassword(rs.getString("PASSWORD"));           
            return true;
        } 
        catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

     public boolean getAccountInfoUsingEmail(Account s)
    {
        try {
            selectTable(ACCOUNT_TABLE);
            pstmt = con.prepareStatement(query + " Where Email = ?");
            pstmt.setString(1, s.getEmail());
            rs = pstmt.executeQuery();
            rs.next(); 
            s.setAccID(rs.getString("ACCID"));
            s.setRole(rs.getString("ROLE"));
            s.setPassword(rs.getString("PASSWORD")); 
            s.setFname(rs.getString("FNAME"));
            s.setLname(rs.getString("LNAME"));
            return true;
        } 
        catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
         //updated 14/5/2022
    private void updateTable(int tableType){
        switch (tableType) {
            case ACCOUNT_TABLE:
                query="UPDATE  Account set ";
                break;
            case STAFF_TABLE:
                query="UPDATE Staff set ";
                break;
            case CUSTOMER_TABLE:
                query="UPDATE Customer set ";
                break;
            case HOTEL_TABLE:
                query="UPDATE Hotel set ";
                break;
            case ROOM_TABLE:
                query="UPDATE Rooms  set ";
                break;
            case RESTAURANT_TABLE:
                query="UPDATE Restaurant set";
                break;    
            case MEAL_TABLE:
                query="UPDATE Meal set";
                break;
            case ACC_MEAL_TABLE:
                query="UPDATE ACCOUNT_MEAL set ";
                break;
            case ACC_ROOMS_TABLE:
                query="UPDATE ACCOUNT_ROOMS set";
                break;
            default:
                break;
        }
    }   
    
    //updated 14/5/2022
private void deleteTable(int tableType){
        switch (tableType) {
        case ACCOUNT_TABLE:
            query="DELETE FROM Account WHERE EMAIL = ? ";
            break;
        case STAFF_TABLE:
            query="DELETE FROM Staff WHERE ACCOUNTEMAIL = ?  ";
            break;
        case CUSTOMER_TABLE:
            query="DELETE from Customer WHERE ACCOUNTEMAIL= ? ";
            break;
        case HOTEL_TABLE:
            query="DELETE from Hotel WHERE HOTELID= ? ";
            break;
        case ROOM_TABLE:
            query="DELETE from Rooms WHERE ROOMID= ? ";
            break;
        case RESTAURANT_TABLE:
            query="DELETE from Restaurant WHERE RESTURANTID= ?";
            break;
        case MEAL_TABLE:
            query="DELETE from Meal WHERE MEALID= ?" ;
            break;
         case ACC_ROOMS_TABLE:
            query="DELETE from ACCOUNT_ROOMS " ;
            break;
           case ACC_MEAL_TABLE:
            query="DELETE from ACCOUNT_MEAL " ;
            break;
        default:
            break;

        }
} 
    //updated 14/5/2022
     private void selectTable(int tableType){
        switch (tableType) {
            case ACCOUNT_TABLE:
                query="select* from  Account ";//Page 26
                break;
            case STAFF_TABLE:
                query="select* from  Staff ";//Page 26
                break;
            case CUSTOMER_TABLE:
                query="select* from Customer ";
                break;
            case HOTEL_TABLE:
                query="select* from Hotel ";
                break;
            case ROOM_TABLE:
                query="select* from Rooms ";
                break;
            case RESTAURANT_TABLE:
                query="select* from Restaurant ";
                break;    
            case MEAL_TABLE:
                query="select* from Meal ";
                break;
            case ACC_MEAL_TABLE:
                query="select* from ACCOUNT_MEAL ";
                break;
            case ACC_ROOMS_TABLE:
                query="select* from ACCOUNT_ROOMS";
                break;
            default:
                break;
         }
        
    }
       //updated 14/5/2022
    private void InsertIntoTable(int tableType){
         switch (tableType) {
            case ACCOUNT_TABLE:
                query="insert into  Account ";//Page 26
                break;
            case STAFF_TABLE:
                query="insert into  Staff ";//Page 26
                break;
            case CUSTOMER_TABLE:
                query="insert into Customer ";
                break;
            case HOTEL_TABLE:
                query="insert into  Hotel ";
                break;     
            case ROOM_TABLE:
                query="insert into  Rooms ";
                break;
            case RESTAURANT_TABLE:
                query="insert into  Restaurant ";
                break;
            case MEAL_TABLE:
                query="insert into  Meal ";
                break;
            case ACC_MEAL_TABLE:
                query="insert into  ACCOUNT_MEAL ";
                break;
            case ACC_ROOMS_TABLE:
                query="INSERT INTO ACCOUNT_ROOMS ";
                break;
            default:
                break;
            }
    }   
    public int IDGenerator(int tableType)throws SQLException{
        switch (tableType) {
            case MEAL_TABLE:
                pstmt = con.prepareStatement("SELECT MAX(ID+1) FROM MEAL ");
                break;
            case RESTAURANT_TABLE:
                pstmt = con.prepareStatement("SELECT MAX(ID+1) FROM RESTURANT ");
                break;
            case HOTEL_TABLE:
                pstmt = con.prepareStatement("SELECT MAX(ID+1) FROM HOTEL ");
                break;
            case ROOM_TABLE:
                pstmt = con.prepareStatement("SELECT MAX(ID+1) FROM ROOMS ");
                break;
        }
        rs = pstmt.executeQuery();
        rs.next();
        return rs.getInt(1);
    }
    
    public int CountRowsIn(int tableType)throws SQLException{
        switch (tableType) {
            case MEAL_TABLE:
                pstmt = con.prepareStatement("SELECT COUNT (*) FROM MEAL ");
                break;
            case RESTAURANT_TABLE:
                pstmt = con.prepareStatement("SELECT COUNT (*) FROM RESTURANT ");
                break;
            case HOTEL_TABLE:
                pstmt = con.prepareStatement("SELECT COUNT (*) FROM HOTEL ");
                break;
            case ROOM_TABLE:
                pstmt = con.prepareStatement("SELECT COUNT (*) FROM ROOM ");
                break;
        }
        rs = pstmt.executeQuery();
        rs.next();
        return rs.getInt(1);
    }
     //updated 14/5/2022
    boolean addMeal(Meal meal) {
        try {
            //meal.setMealID(IDGenerator(MEAL_TABLE));
            InsertIntoTable(MEAL_TABLE);
            pstmt = con.prepareStatement(query + "values(?,?,?,?)");
            pstmt.setInt(1, meal.getMealID());
            pstmt.setDouble(2, meal.getPrice());
            pstmt.setString(3, meal.getName());
            pstmt.setInt(4, meal.getResID());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    //updated 14/5/2022
    public Meal[] viewMeal(int resID)
    {
        
        Meal reses[] = null;
        try{
            pstmt = con.prepareStatement("SELECT COUNT (*) FROM MEAL WHERE RESID =?");
            pstmt.setInt(1, resID);
            rs = pstmt.executeQuery();
            rs.next();
            reses = new Meal[rs.getInt(1)];
            
       
            selectTable(MEAL_TABLE);
            pstmt=con.prepareStatement(query+" WHERE RESID = ? ");
            pstmt.setInt(1, resID);
            rs=pstmt.executeQuery();
            int i=0;
            while(rs.next())
                reses[i++]=new Meal(rs.getString("NAME"), rs.getInt("MEALID"), rs.getDouble("PRICE"), resID);
            return reses;
        }
        catch(SQLException ex){
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return reses;
        }
    }
        //updated 14/5/2022
    //maybe make query that gets only the top 5 rows instead of the var i ?
    
 public Rooms[] viewRooms(int hotelID)
    {
        Rooms reses[]=null;
        try{
            pstmt = con.prepareStatement("SELECT COUNT (*) FROM ROOMS WHERE HOTELID =?");
            pstmt.setInt(1, hotelID);
            rs = pstmt.executeQuery();
            rs.next();
            reses = new Rooms[rs.getInt(1)];
            selectTable(ROOM_TABLE);
            pstmt=con.prepareStatement(query+" WHERE HOTELID = ? ");
            pstmt.setInt(1, hotelID);
            rs=pstmt.executeQuery();
            int i=0;
            while(i<5 && rs.next())
            {
                reses[i]=new Rooms();
                reses[i].setHotelID(rs.getInt("HOTELID"));
                reses[i].setNumberOfRooms(rs.getInt("NUMBEROFROOMS"));
                reses[i].setPrice(rs.getDouble("PRICE"));
                reses[i].setAvailableRooms(rs.getInt("AVAILABLEROOMS"));
                reses[i].setRoomID(rs.getInt("ROOMID"));
                i++;
            }
            return reses;
        }
        catch(SQLException ex){
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return reses;
        }
        
    }
 public int ReservedCustomers()
    {
        int x=0;
        try{
            pstmt = con.prepareStatement("SELECT COUNT(*) AS CC FROM CUSTOMER, ACCOUNT_ROOMS WHERE CUSTOMER.ACCOUNTEMAIL = ACCOUNT_ROOMS.ACCOUNTEMAIL");
            rs = pstmt.executeQuery();
            rs.next();
            x= rs.getInt("cc");
            return x;
        }catch(SQLException ex){
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return x;
        }
    }
 public Results[] AvailableRooms()
    {

        Results x[]=null;
        try{
            pstmt = con.prepareStatement("SELECT COUNT(*) as DD FROM ROOMS ");
            rs = pstmt.executeQuery();
            rs.next();
            int num=rs.getInt("DD");
            pstmt = con.prepareStatement("SELECT \"TYPE\" as DD,AVAILABLEROOMS AS CC,HOTELID AS GG FROM ROOMS ");
            rs = pstmt.executeQuery();
            int i=0;
            x=new Results[num];
            while(rs.next())
            {
                x[i]=new Results();
                x[i].setType(rs.getString("DD"));
                x[i].setNumberofsales(rs.getInt("CC"));
                x[i].setMealID(rs.getInt("GG"));
                i++;
            }
            return x;
        }catch(SQLException ex){
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return x;
        }
    }
 public double AvrMealPrice()
    {
        double x=0.0;
        try{
            pstmt = con.prepareStatement("SELECT AVG(PRICE) AS DD FROM MEAL,ACCOUNT_MEAL WHERE MEAL.MEALID = ACCOUNT_MEAL.MEALID GROUP BY ACCOUNT_MEAL.ACCOUNTEMAIL");
            rs = pstmt.executeQuery();
            rs.next();
            x=rs.getDouble("DD");
            return x;
        }catch(SQLException ex){
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return x;
        }
    }
 public double AvrRoomPrice()
    {
        double x=0.0;
        try{
            pstmt = con.prepareStatement("SELECT AVG(PRICE) AS DD FROM ROOMS,ACCOUNT_ROOMS WHERE ROOMS.ROOMID= ACCOUNT_ROOMS.ROOMID GROUP BY ACCOUNT_ROOMS.ACCOUNTEMAIL");
            rs = pstmt.executeQuery();
            rs.next();
            x=rs.getDouble("DD");
            return x;
        }catch(SQLException ex){
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return x;
        }
    }
 public int NoOfCustomers()
    {
        int x=0;
        try{
            pstmt = con.prepareStatement("SELECT COUNT(*) AS CC FROM ACCOUNT,CUSTOMER WHERE ACCOUNT.EMAIL=CUSTOMER.ACCOUNTEMAIL");
            rs = pstmt.executeQuery();
            rs.next();
            x= rs.getInt("CC");
            return x;
        }catch(SQLException ex){
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return x;
        }
    }

 public Results[] MealSold()
    {
        Results x[]=null;
        try{
            pstmt = con.prepareStatement("SELECT count(*) FROM (SELECT COUNT(*)AS MYCOUNT,MEAL.MEALID FROM MEAL,ACCOUNT_MEAL WHERE ACCOUNT_MEAL.MEALID=MEAL.MEALID GROUP BY MEAL.MEALID) AS Y");
            rs = pstmt.executeQuery();
            rs.next();
            int num=rs.getInt(1);
            pstmt = con.prepareStatement("SELECT * FROM \n" +
"(SELECT COUNT(*)AS MYCOUNT,MEAL.MEALID AS DD FROM MEAL,ACCOUNT_MEAL WHERE ACCOUNT_MEAL.MEALID=MEAL.MEALID GROUP BY MEAL.MEALID) AS Y ORDER BY MYCOUNT ");
            rs = pstmt.executeQuery();
            int i=0;
            x= new Results[num];
            while(rs.next())
            {
                x[i]=new Results();
                x[i].setMealID(rs.getInt("DD"));
                x[i].setNumberofsales(rs.getInt("MYCOUNT"));
                i++;
            }
            return x;
        }catch(SQLException ex){
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return x;
        }
    }
}
//this 
//is
//nice