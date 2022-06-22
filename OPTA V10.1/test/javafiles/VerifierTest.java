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
 * @author TaqiEldeen
 */
public class VerifierTest {  
    public VerifierTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("STARTING TEST!");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("DONE!");
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
        
    }

    /**
     * Test of emailVerify method, of class Verifier.
     */
    @Test //valid test case 
    public void testEmailVerify() {
        System.out.println("emailVerify");
        String email = "Pass@test.com";
        Verifier instance = new Verifier();
        boolean expResult = true;
        boolean result = instance.emailVerify(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test //failed test case 
    public void testEmailVerify_1() {
        System.out.println("emailVerify");
        String email = "failed@testcom";
        Verifier instance = new Verifier();
        boolean expResult = false;
        boolean result = instance.emailVerify(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test //failed test case 
    public void testEmailVerify_2() {
        System.out.println("emailVerify");
        String email = "failedtest.com";
        Verifier instance = new Verifier();
        boolean expResult = false;
        boolean result = instance.emailVerify(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test  //failed test case 
    public void testEmailVerify_3() {
        System.out.println("emailVerify");
        String email = "@test.com";
        Verifier instance = new Verifier();
        boolean expResult = false;
        boolean result = instance.emailVerify(email);
        assertEquals(expResult, result);
       
    }
    @Test  //failed test case 
    public void testEmailVerify_4() {
        System.out.println("emailVerify");
        String email = "";
        Verifier instance = new Verifier();
        boolean expResult = false;
        boolean result = instance.emailVerify(email);
        assertEquals(expResult, result);
    }
        @Test  //failed test case 
    public void testEmailVerify_5() {
        System.out.println("emailVerify");
        String email = "@.com";
        Verifier instance = new Verifier();
        boolean expResult = false;
        boolean result = instance.emailVerify(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
            @Test  //failed test case 
    public void testEmailVerify_6() {
        System.out.println("emailVerify");
        String email = "@.";
        Verifier instance = new Verifier();
        boolean expResult = false;
        boolean result = instance.emailVerify(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test  //failed test case 
    public void testEmailVerify_7() {
        System.out.println("emailVerify");
        String email = "TT@ .com";
        Verifier instance = new Verifier();
        boolean expResult = false;
        boolean result = instance.emailVerify(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    /**
     * Test of passwordVerify method, of class Verifier.
     */
    @Test //valid test case
    public void testPasswordVerify() {
        System.out.println("passwordVerify");
        String password = "Valid123";
        Verifier instance = new Verifier();
        boolean expResult = true;
        boolean result = instance.passwordVerify(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test //failed test case
    public void testPasswordVerify_1() {
    System.out.println("passwordVerify1");
    String password = "failed";
    Verifier instance = new Verifier();
    boolean expResult = false;
    boolean result = instance.passwordVerify(password);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    }
    @Test //failed test case
    public void testPasswordVerify_2() {
    System.out.println("passwordVerify2");
    String password = "FAILED1";
    Verifier instance = new Verifier();
    boolean expResult = false;
    boolean result = instance.passwordVerify(password);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    }
    @Test //failed test case
    public void testPasswordVerify_3() {
    System.out.println("passwordVerify2");
    String password = "failed12";
    Verifier instance = new Verifier();
    boolean expResult = false;
    boolean result = instance.passwordVerify(password);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    }
    @Test //failed test case
    public void testPasswordVerify_4() {
    System.out.println("passwordVerify2");
    String password = "Fail1";
    Verifier instance = new Verifier();
    boolean expResult = false;
    boolean result = instance.passwordVerify(password);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of idVerify method, of class Verifier.
     */
    @Test // valid test case
    public void testIdVerify() {
        System.out.println("idVerify");
        String id = "10101010101010";
        Verifier instance = new Verifier();
        boolean expResult = true;
        boolean result = instance.idVerify(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test // failed test case
    public void testIdVerify_1() {
        System.out.println("idVerify1");
        String id = "101010101";
        Verifier instance = new Verifier();
        boolean expResult = false;
        boolean result = instance.idVerify(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test // failed test case
    public void testIdVerify_2() {
        System.out.println("idVerify2");
        String id = "";
        Verifier instance = new Verifier();
        boolean expResult = false;
        boolean result = instance.idVerify(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }  
    @Test // failed test case
    public void testIdVerify_3() {
        System.out.println("idVerify3");
        String id = "ABCDEFGHIJKLMN";
        Verifier instance = new Verifier();
        boolean expResult = false;
        boolean result = instance.idVerify(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test // failed test case
    public void testIdVerify_4() {
        System.out.println("idVerify3");
        String id = "1414141414141.";
        Verifier instance = new Verifier();
        boolean expResult = false;
        boolean result = instance.idVerify(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
