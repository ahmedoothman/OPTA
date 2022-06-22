/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafiles;

/**
 *
 * @author 20109
 */
public class Rooms {
    private int numberOfBeds;
    private int availableRooms;
    private double price;
    private int roomID ;
    private int hotelID;
    private int numberOfRooms;

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
    public int getHotelID() {
        return hotelID;
    }

    public void setHotelID(int hotelID) {
        this.hotelID = hotelID;
    }
    private static final DBConnect db= new DBConnect();

    public Rooms(int nOrooms, int numberOfBeds, int available, double price, int roomID) {
        this.numberOfRooms = nOrooms;
        this.numberOfBeds = numberOfBeds;
        this.availableRooms = available;
        this.price = price;
        this.roomID = roomID;
    }
    
    public Rooms(){
        
    }

    public int getAvailableRooms() {
        return availableRooms;
    }

    public void setAvailableRooms(int availableRooms) {
        this.availableRooms = availableRooms;
    }
    

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isAvailable() {
        return availableRooms>0;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }
    public static Rooms[] viewRooms(int hotelId){
        return db.viewRooms(hotelId);
    }
    
   public static boolean isRoomAvailalbe(int roomID){
        return db.getAvailableRooms(roomID)>0;
    }
   //removed boolean exp ! (does the project need it ?) 14/6/2022
    public int isRoomAvailalbe(){
        this.availableRooms=db.getAvailableRooms(this.roomID);
        return this.availableRooms;
    }

    public static boolean updateRoomAvailablity(int Available, int roomID){
        return db.updateRoomAvailablity(Available, roomID);
    }
}
