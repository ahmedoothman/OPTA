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
 * @author DELL
 */
public class RoomsTest {
    
    public RoomsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        DBConnect te=new DBConnect();
        System.out.println("Connected to DB");
        
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
     * Test of getNumberOfRooms method, of class Rooms.
     */
    @Test
    public void testGetNumberOfRooms() {
        System.out.println("getNumberOfRooms");
        Rooms instance = new Rooms(10,3, 10,199.99,1);
        int expResult = 10;
        int result = instance.getNumberOfRooms();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNumberOfRooms method, of class Rooms.
     */
    @Test
    public void testSetNumberOfRooms() {
        System.out.println("setNumberOfRooms");
        int numberOfRooms = 15;
        Rooms instance = new Rooms(10,3, 10,199.99,1);
        instance.setNumberOfRooms(numberOfRooms);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getHotelID method, of class Rooms.
     */
    @Test
    public void testGetHotelID() {
        System.out.println("getHotelID");
        Rooms instance = new Rooms(10,3, 10,199.99,1);
        int expResult = 0;
        int result = instance.getHotelID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setHotelID method, of class Rooms.
     */
    @Test
    public void testSetHotelID() {
        System.out.println("setHotelID");
        int hotelID = 0;
        Rooms instance = new Rooms();
        instance.setHotelID(hotelID);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of getAvailableRooms method, of class Rooms.
     */
    @Test
    public void testGetAvailableRooms() {
        System.out.println("getAvailableRooms");
        Rooms instance = new Rooms();
        int expResult = 0;
        int result = instance.getAvailableRooms();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setAvailableRooms method, of class Rooms.
     */
    @Test
    public void testSetAvailableRooms() {
        System.out.println("setAvailableRooms");
        int availableRooms = 0;
        Rooms instance = new Rooms();
        instance.setAvailableRooms(availableRooms);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getNumberOfBeds method, of class Rooms.
     */
    @Test
    public void testGetNumberOfBeds() {
        System.out.println("getNumberOfBeds");
        Rooms instance = new Rooms();
        int expResult = 0;
        int result = instance.getNumberOfBeds();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of setNumberOfBeds method, of class Rooms.
     */
    @Test
    public void testSetNumberOfBeds() {
        System.out.println("setNumberOfBeds");
        int numberOfBeds = 0;
        Rooms instance = new Rooms();
        instance.setNumberOfBeds(numberOfBeds);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of isAvailable method, of class Rooms.
     */
    @Test
    public void testIsAvailable() {
        System.out.println("isAvailable");
        Rooms instance = new Rooms();
        boolean expResult = false;
        boolean result = instance.isAvailable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of getPrice method, of class Rooms.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Rooms instance = new Rooms(10,3, 10,199.99,1);
        double expResult = 199.99;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of setPrice method, of class Rooms.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 0.0;
        Rooms instance = new Rooms(10,3, 10,199.99,1);
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getRoomID method, of class Rooms.
     */
    @Test
    public void testGetRoomID() {
        System.out.println("getRoomID");
        Rooms instance = new Rooms(10,3, 10,199.99,1);
        int expResult = 1;
        int result = instance.getRoomID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of setRoomID method, of class Rooms.
     */
    @Test
    public void testSetRoomID() {
        System.out.println("setRoomID");
        int roomID = 1;
        Rooms instance = new Rooms(10,3, 10,199.99,1);
        instance.setRoomID(roomID);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of viewRooms method, of class Rooms.
     */
    /*
    @Test
    public void testViewRooms() {
        System.out.println("viewRooms");
        int hotelId = 1;
        Rooms[] ss= new Rooms[3];
        System.out.println(Rooms.viewRooms(hotelId).toString());
        ss[0]= new Rooms(10,3,9,199.99,1);
        ss[1]= new Rooms(15,2,15,166.66,2);
        ss[2]= new Rooms(20,4,20,155.55,3);
        Rooms[] expResult = ss;
        Rooms[] result = Rooms.viewRooms(hotelId);
        assertArrayEquals(expResult, result);
        
    }
*/
    /**
     * Test of isRoomAvailalbe method, of class Rooms.
     */
    @Test
    public void testIsRoomAvailalbe_int() {
        System.out.println("isRoomAvailalbe");
        int roomID = 1;
        boolean expResult = true;
        boolean result = Rooms.isRoomAvailalbe(roomID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isRoomAvailalbe method, of class Rooms.
     */
    /*
    @Test
    public void testIsRoomAvailalbe_0args() {
        System.out.println("isRoomAvailalbe");
        Rooms instance = new Rooms(10,3, 10,199.99,1);
        boolean expResult = true;
        boolean result = instance.isRoomAvailalbe();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    */

    /**
     * Test of updateRoomAvailablity method, of class Rooms.
     */
    @Test
    public void testUpdateRoomAvailablity() {
        System.out.println("updateRoomAvailablity");
        int Available = 9;
        int roomID = 1;
        boolean expResult = true;
        boolean result = Rooms.updateRoomAvailablity(Available, roomID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }  
}
