/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafiles;

import static javafiles.Account.db;

/**
 *
 * @author 20109
 */
public class Staff extends Account{
    private String salary, position;
    private int staffID, hotelID;

    public Staff(String fname, String lname, char gender, String address, String position, String salary, String phone, String accID, String email, String password, String role, int staffID) {
        super(accID, email, password, "staff", address, phone, fname, lname, gender);
        this.position = position;
        this.salary = salary;
        this.staffID = staffID;
        
    }
    public Staff(){
        
    }

    public String getAccID() {
        return accID;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public int getHotelID() {
        return hotelID;
    }

    public void setHotelID(int hotelID) {
        this.hotelID = hotelID;
    }
    
    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
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

    
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    public boolean addStaff()
    {
        return db.addStaff(this);
    }
    public boolean getStaffInfo(String accID){
        this.setAccID(accID);
        return db.getStaffInfo(this);
    }
}
