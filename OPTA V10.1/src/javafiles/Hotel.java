/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafiles;

/**
 *
 * @author 20109
 */
public class Hotel {
    private String name, address, rating;
    private int id;
    private static final DBConnect db= new DBConnect();
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public boolean addHotel(String name, String address,String rating, int id){
    this.name=name;
    this.address=address;
    this.rating=rating;
    this.id=id;
   //db.addHotel(this);
   return true;
    }
    
}
