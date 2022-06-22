/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafiles;
//import java.util.Date;
import java.sql.Date;

/**
 *
 * @author 20109
 */
public class ReservationRooms {
    String email, paymentType, amenties;
    Date arrivalDate, endDate;
    double totalPrice;
    int numberOfRooms, roomID;
    private static final DBConnect db= new DBConnect();
    public ReservationRooms(){}
    public ReservationRooms(String email, String paymentType, String amenties, Date arrivalDate, Date endDate, double totalPrice, int numberOfRooms, int roomID) {
        this.email = email;
        this.paymentType = paymentType;
        this.amenties = amenties;
        this.arrivalDate = arrivalDate;
        this.endDate = endDate;
        this.totalPrice = totalPrice;
        this.numberOfRooms = numberOfRooms;
        this.roomID = roomID;
    }
    
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getAmenties() {
        return amenties;
    }

    public void setAmenties(String amenties) {
        this.amenties = amenties;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }
    
    
        public static boolean deleteRoomReservation(String email, int roomID){
        if(roomID == 0){
            return false;
        }
            return db.deleteRoomReservation(email, roomID);
        }
        
        public static ReservationRooms[] viewReservations(String email) {
            return db.viewReservationsRooms(email);
        }
        
        public boolean addReservationRoom(){
            return db.createReservationRoomOnly(this);
        }
}
