/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafiles;

/**
 *
 * @author DELL
 */
public class Results {
//    private String  name;
    private int mealID;
    private int numberofsales;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    private static final DBConnect db= new DBConnect();
    public Results(int mid,int no){
        this.mealID=mid;
        this.numberofsales=no;
    }
    public Results(){
        
    }

    public int getMealID() {
        return mealID;
    }

    public void setMealID(int mealID) {
        this.mealID = mealID;
    }

    public int getNumberofsales() {
        return numberofsales;
    }

    public void setNumberofsales(int numberofsales) {
        this.numberofsales = numberofsales;
    }
}
