/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafiles;

import java.sql.SQLException;

/**
 *
 * @author 3F3F
 */

public class Customer extends Account{
    public Customer(String fname, String lname, char gender, String address, String phone, String accID, String email, String password) {
        super(accID, email, password, "customer", address, phone, fname, lname, gender);
    }
    public Customer(){
        
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
    public static boolean deleteCustomer(String id){
       return db.deleteCustomer(id);
    }
    
    public boolean addCustomer() 
    {
        return db.addCustomer(this);
    }
    
    public boolean getCustomerInfo (String accID){
        this.setAccID(accID);
        return db.getCustomerInfo(this);
    }
}
