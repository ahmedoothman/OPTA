package javafiles;


/**
 *
 * @author 20109
 */
public class Account {
    // we determine the role from the first number in the accID if 0 then admin else customer
    protected String accID, email, password, role, address, phone, fname, lname;
    protected char gender;
    protected static final DBConnect db= new DBConnect();

    public Account(String accID, String email, String password, String role, String address, String phone, String fname, String lname,char gender) {
        this.accID = accID;
        this.email = email;
        this.password = password;
        this.role = role;
        this.address = address;
        this.phone = phone;
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
    }
 
    public Account() {
    }
    
   //login()
   //register()
   //editAccount()
    public String getAccID() {
        return accID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    
    public void setAccID(String accID) {
        this.accID = accID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    /*
    public boolean addAccount(String accId,String email, String password,String role){
            this.accID=accId;
            this.email=email;
            this.password=password;
            this.role=role;
            return db.addAccount(this);
    }*/
    
    public static boolean login (String email, String password){
       return db.login(email, password);
    }
    public boolean getAccInfo(String email){
        this.email = email;
        return db.getAccountInfoUsingEmail(this);
    }
}
