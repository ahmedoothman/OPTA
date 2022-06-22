/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package javafiles;

import java.sql.Date;
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
public class ReservationRoomsTest {
    ReservationRooms instance;
    
    public ReservationRoomsTest() {
      instance = new ReservationRooms("ahmed.ayman1437@gmail.com","At arrival","Gym",new Date(2022, 06, 11),new Date(2022, 06, 18),199.99,1,1);
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
     * Test of getEmail method, of class ReservationRooms.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        //ReservationRooms instance = new ReservationRooms();
        String expResult = "ahmed.ayman1437@gmail.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class ReservationRooms.
     */
    /*@Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        ReservationRooms instance = new ReservationRooms();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getPaymentType method, of class ReservationRooms.
     */
    @Test
    public void testGetPaymentType() {
        System.out.println("getPaymentType");
        //ReservationRooms instance = new ReservationRooms();
        String expResult = "At arrival";
        String result = instance.getPaymentType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPaymentType method, of class ReservationRooms.
     */
    /*@Test
    public void testSetPaymentType() {
        System.out.println("setPaymentType");
        String paymentType = "";
        ReservationRooms instance = new ReservationRooms();
        instance.setPaymentType(paymentType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getAmenties method, of class ReservationRooms.
     */
    @Test
    public void testGetAmenties() {
        System.out.println("getAmenties");
        //ReservationRooms instance = new ReservationRooms();
        String expResult = "Gym";
        String result = instance.getAmenties();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAmenties method, of class ReservationRooms.
     */
    /*@Test
    public void testSetAmenties() {
        System.out.println("setAmenties");
        String amenties = "";
        ReservationRooms instance = new ReservationRooms();
        instance.setAmenties(amenties);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getArrivalDate method, of class ReservationRooms.
     */
    @Test
    public void testGetArrivalDate() {
        System.out.println("getArrivalDate");
        //ReservationRooms instance = new ReservationRooms();
        Date expResult = new Date(2022, 06, 11);
        Date result = instance.getArrivalDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setArrivalDate method, of class ReservationRooms.
     */
    /*@Test
    public void testSetArrivalDate() {
        System.out.println("setArrivalDate");
        Date arrivalDate = null;
        ReservationRooms instance = new ReservationRooms();
        instance.setArrivalDate(arrivalDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getEndDate method, of class ReservationRooms.
     */
    @Test
    public void testGetEndDate() {
        System.out.println("getEndDate");
        //ReservationRooms instance = new ReservationRooms();
        Date expResult = new Date(2022, 06, 18);
        Date result = instance.getEndDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEndDate method, of class ReservationRooms.
     */
    /*@Test
    public void testSetEndDate() {
        System.out.println("setEndDate");
        Date endDate = null;
        ReservationRooms instance = new ReservationRooms();
        instance.setEndDate(endDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getTotalPrice method, of class ReservationRooms.
     */
    @Test
    public void testGetTotalPrice() {
        System.out.println("getTotalPrice");
        //ReservationRooms instance = new ReservationRooms();
        double expResult = 199.99;
        double result = instance.getTotalPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalPrice method, of class ReservationRooms.
     */
    /*@Test
    public void testSetTotalPrice() {
        System.out.println("setTotalPrice");
        double totalPrice = 0.0;
        ReservationRooms instance = new ReservationRooms();
        instance.setTotalPrice(totalPrice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getNumberOfRooms method, of class ReservationRooms.
     */
    @Test
    public void testGetNumberOfRooms() {
        System.out.println("getNumberOfRooms");
        //ReservationRooms instance = new ReservationRooms();
        int expResult = 1;
        int result = instance.getNumberOfRooms();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberOfRooms method, of class ReservationRooms.
     */
    /*@Test
    public void testSetNumberOfRooms() {
        System.out.println("setNumberOfRooms");
        int numberOfRooms = 0;
        ReservationRooms instance = new ReservationRooms();
        instance.setNumberOfRooms(numberOfRooms);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getRoomID method, of class ReservationRooms.
     */
    
    @Test
    public void testGetRoomID() {
        System.out.println("getRoomID");
        //ReservationRooms instance = new ReservationRooms();
        int expResult = 1;
        int result = instance.getRoomID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setRoomID method, of class ReservationRooms.
     */
    /*@Test
    public void testSetRoomID() {
        System.out.println("setRoomID");
        int roomID = 0;
        ReservationRooms instance = new ReservationRooms();
        instance.setRoomID(roomID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of deleteRoomReservation method, of class ReservationRooms.
     */
    @Test
    public void testDeleteRoomReservation() {
        System.out.println("deleteRoomReservation");
        String email = "ahmed.ayman1437@gmail.com";
        int roomID = 1;
        boolean expResult = true;
        boolean result = ReservationRooms.deleteRoomReservation(email, roomID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of viewReservations method, of class ReservationRooms.
     */
    /*@Test
    public void testViewReservations() {
        System.out.println("viewReservations");
        String email = "ahmed.ayman1437@gmail.com";
        ReservationRooms[] expResult = null;
        ReservationRooms[] result = ReservationRooms.viewReservations(email);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of addReservationRoom method, of class ReservationRooms.
     */
    @Test
    public void testAddReservationRoom() {
        System.out.println("addReservationRoom");
        //ReservationRooms instance = new ReservationRooms();
        boolean expResult = true;
        boolean result = instance.addReservationRoom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }    
}
