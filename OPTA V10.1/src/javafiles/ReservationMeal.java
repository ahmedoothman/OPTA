/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafiles;
/**
 *
 * @author 20109
 */
public class ReservationMeal  {
    
    private String  email; //combination of foreign keys
    private int MealID;
    private double totalPrice;
    private int numberOfMeal;
    private String paymentType;
    
    private static final DBConnect db= new DBConnect();
    
    public ReservationMeal(String email, int MealID, double totalPrice, int numberOfMeal, String paymentType) {
        this.email = email;
        this.MealID = MealID;
        this.totalPrice = totalPrice;
        this.numberOfMeal = numberOfMeal;
        this.paymentType=paymentType;
    }
    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
    
    public ReservationMeal() {
        
    }

    public int getMealID() {
        return MealID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setMealID(int MealID) {
        this.MealID = MealID;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getNumberOfMeal() {
        return numberOfMeal;
    }

    public void setNumberOfMeal(int numberOfMeal) {
        this.numberOfMeal = numberOfMeal;
    }
    
    public static ReservationMeal[] viewReservations(String email) {
        return db.viewReservationsMeals(email);
    }
    public static boolean deleteReservation (String email){
        return db.deleteReservationMeal(email);
    }
    public static boolean deleteMealReservation (String accID, int mealID){
        if(mealID == 0){
            return false;
        }
        return db.deleteMealReservation(accID, mealID);
    }
    
/*
    public boolean addReservation(){
      return db.createReservation(this); 
    }
    public boolean updateReservation(){
        return db.updateReservation(this);
    
*/
    public boolean addReservationMeal(){
        return db.createReservationMealsOnly(this);
    }
    
}
