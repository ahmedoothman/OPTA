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
 * @author Ahmed
 */
public class ReservationMealTest {
    ReservationMeal instance;
    public ReservationMealTest() {
        DBConnect db = new DBConnect();
        instance = new ReservationMeal("ahmed.ayman1437@gmail.com",1,30,1,"At arrival");
    }
    
    @BeforeClass
    public static void setUpClass() {
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
     * Test of getPaymentType method, of class ReservationMeal.
     */
    @Test
    public void testGetPaymentType() {
        System.out.println("getPaymentType");
        //ReservationMeal instance = new ReservationMeal();
        String expResult = "At arrival";
        String result = instance.getPaymentType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPaymentType method, of class ReservationMeal.
     */
    /*@Test
    public void testSetPaymentType() {
        System.out.println("setPaymentType");
        String paymentType = "";
        ReservationMeal instance = new ReservationMeal();
        instance.setPaymentType(paymentType);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of getMealID method, of class ReservationMeal.
     */
    @Test
    public void testGetMealID() {
        System.out.println("getMealID");
        //ReservationMeal instance = new ReservationMeal();
        int expResult = 1;
        int result = instance.getMealID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class ReservationMeal.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        //ReservationMeal instance = new ReservationMeal();
        String expResult = "ahmed.ayman1437@gmail.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class ReservationMeal.
     */
    /*@Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        ReservationMeal instance = new ReservationMeal();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of setMealID method, of class ReservationMeal.
     */
    /*@Test
    public void testSetMealID() {
        System.out.println("setMealID");
        int MealID = 0;
        ReservationMeal instance = new ReservationMeal();
        instance.setMealID(MealID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of getTotalPrice method, of class ReservationMeal.
     */
    @Test
    public void testGetTotalPrice() {
        System.out.println("getTotalPrice");
        //ReservationMeal instance = new ReservationMeal();
        double expResult = 30;
        double result = instance.getTotalPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalPrice method, of class ReservationMeal.
     */
    /*@Test
    public void testSetTotalPrice() {
        System.out.println("setTotalPrice");
        double totalPrice = 0.0;
        ReservationMeal instance = new ReservationMeal();
        instance.setTotalPrice(totalPrice);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of getNumberOfMeal method, of class ReservationMeal.
     */
    @Test
    public void testGetNumberOfMeal() {
        System.out.println("getNumberOfMeal");
        //ReservationMeal instance = new ReservationMeal();
        int expResult = 1;
        int result = instance.getNumberOfMeal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberOfMeal method, of class ReservationMeal.
     */
    /*@Test
    public void testSetNumberOfMeal() {
        System.out.println("setNumberOfMeal");
        int numberOfMeal = 0;
        ReservationMeal instance = new ReservationMeal();
        instance.setNumberOfMeal(numberOfMeal);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of viewReservations method, of class ReservationMeal.
     */
    /*@Test
    public void testViewReservations() {
        System.out.println("viewReservations");
        String email = "ahmed.ayman1437@gmail.com";
        ReservationMeal[] expResult = null;
        ReservationMeal[] result = ReservationMeal.viewReservations(email);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of deleteReservation method, of class ReservationMeal.
     */
    @Test
    public void testDeleteReservation() {
        System.out.println("deleteReservation");
        String email = "ahmed.ayman1437@gmail.com";
        boolean expResult = true;
        boolean result = ReservationMeal.deleteReservation(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteMealReservation method, of class ReservationMeal.
     */
    @Test
    public void testDeleteMealReservation() {
        System.out.println("deleteMealReservation");
        String accID = "ahmed.ayman1437@gmail.com";
        int mealID = 1;
        boolean expResult = true;
        boolean result = ReservationMeal.deleteMealReservation(accID, mealID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addReservationMeal method, of class ReservationMeal.
     */
    @Test
    public void testAddReservationMeal() {
        System.out.println("addReservationMeal");
        //ReservationMeal instance = new ReservationMeal();
        boolean expResult = true;
        boolean result = instance.addReservationMeal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
