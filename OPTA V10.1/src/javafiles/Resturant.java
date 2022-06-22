/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafiles;

/**
 *
 * @author 20109
 */
public class Resturant {
    private int numberOfTables, avaliableTable, resturantID;
    private static final DBConnect db= new DBConnect();
    
    
    public int getNumberOfTables() {
        return numberOfTables;
    }

    public void setNumberOfTables(int numberOfTables) {
        this.numberOfTables = numberOfTables;
    }

    public int getAvaliableTable() {
        return avaliableTable;
    }

    public void setAvaliableTable(int avaliableTable) {
        this.avaliableTable = avaliableTable;
    }

    public int getResturantID() {
        return resturantID;
    }

    public void setResturantID(int resturantID) {
        this.resturantID = resturantID;
    }
    
    
}
