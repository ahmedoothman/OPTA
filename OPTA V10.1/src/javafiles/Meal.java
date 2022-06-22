/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafiles;

/**
 *
 * @author 20109
 */
public class Meal {
    private String  name;
    private int mealID;
    private double price;
    private int resID;
    private static final DBConnect db= new DBConnect();
    public int getMealID() {
        return mealID;
    }

    public Meal(String name, int mealID, double price, int resID) {
        this.name = name;
        this.mealID = mealID;
        this.price = price;
        this.resID = resID;
    }
    public Meal(String name, double price, int resID) {
        this.name = name;
        this.price = price;
        this.resID = resID;
    }

    public Meal() {
    }
    
    public void setMealID(int mealID) {
        this.mealID = mealID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public boolean addMeal(){
        return db.addMeal(this);
    }

    public int getResID() {
        return resID;
    }
    public static Meal[] viewMeal(int resID){
        return db.viewMeal(resID);
    }
    
    public void setResID(int resID) {
        this.resID = resID;
    }
    public boolean fillMealInfo(int mealID){
        this.mealID = mealID;
        return db.getMealInfo(this);
    }
}