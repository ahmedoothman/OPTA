/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package javafiles;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author OTHMAN
 */
public class AccountTest {
    
    public AccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        //for connection to DB
        DBConnect db = new DBConnect();
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
  

    /**
     * Test of login method, of class Account.
     */
    @Test
    public void testLogin_TC0() {
        System.out.println("login TC0");
        String email = "TEST@TEST.com";
        String password = "123";
        boolean expResult = true;
        boolean result = Account.login(email, password);
        assertEquals(expResult, result);
    }
    @Test
    public void testLogin_TC1() {
        System.out.println("login TC1");
        String email = "TEST@TEST.com";
        String password = "notApassword";
        boolean expResult = false;
        boolean result = Account.login(email, password);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLogin_TC2() {
        System.out.println("login TC2");
        String email = "notAnEmail";
        String password = "notApassword";
        boolean expResult = false;
        boolean result = Account.login(email, password);
        assertEquals(expResult, result);
    }
    @Test
    public void testLogin_TC3() {
        System.out.println("login TC3");
        String email = "TEST@TEST.com";
        String password = "";
        boolean expResult = false;
        boolean result = Account.login(email, password);
        assertEquals(expResult, result);
    }
    @Test
    public void testLogin_TC4() {
        System.out.println("login TC4");
        String email = "tttt@mmmm.com";
        String password = "Tt1234";
        boolean expResult = true;
        boolean result = Account.login(email, password);
        assertEquals(expResult, result);
    }
    /**
     * Test of getAccInfo method, of class Account.
     */
    @Test
    public void testGetAccInfo_TC5() {
        System.out.println("getAccInfo TC5");
        String email = "TEST@TEST.com";
        Account instance = new Account();

        boolean result = instance.getAccInfo(email);
        //just testing params of the object
        boolean expResult = getters(instance);
        
        assertEquals(expResult, result);
    }
    @Test
    public void testGetAccInfo_TC6() {
        System.out.println("getAccInfo TC6");
        String email = "notAnEmail";
        Account instance = new Account();
        boolean expResult = false;
        boolean result = instance.getAccInfo(email);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetAccInfo_TC7() {
        System.out.println("getAccInfo TC7");
        String email = "";
        Account instance = new Account();
        boolean expResult = false;
        boolean result = instance.getAccInfo(email);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetAccInfo_TC8() {
        System.out.println("getAccInfo TC8");
        String email = "notAnEmail";
        Account instance = new Account();
        boolean expResult = false;
        boolean result = instance.getAccInfo(email);
        assertEquals(expResult, result);
    }
    @Test
    public void paramsTestTC5_TC9() {
        System.out.println("params testing");
        String email = "notAnEmail";
        Account instance = new Account();
        boolean expResult = false;
        boolean result = instance.getAccInfo(email);
        assertEquals(expResult, result);
    }
    
    boolean getters(Account acc){
        String accID = "123", fname = "TAQI", lname= "ELDEEN", role = "admin";
        if(accID.equals(acc.getAccID()) && fname.equals(acc.getFname()) && lname.equals(acc.getLname()) && role.equals(acc.getRole()))
            return true;
        else 
            return false;
    }
}
