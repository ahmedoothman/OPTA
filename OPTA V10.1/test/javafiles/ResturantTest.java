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
 * @author 20109
 */
public class ResturantTest {
    
    public ResturantTest() {
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
     * Test of getNumberOfTables method, of class Resturant.
     */
    @Test
    public void testGetNumberOfTables() {
        System.out.println("getNumberOfTables");
        Resturant instance = new Resturant();
        int expResult = 0;
        int result = instance.getNumberOfTables();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberOfTables method, of class Resturant.
     */
    @Test
    public void testSetNumberOfTables() {
        System.out.println("setNumberOfTables");
        int numberOfTables = 0;
        Resturant instance = new Resturant();
        instance.setNumberOfTables(numberOfTables);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAvaliableTable method, of class Resturant.
     */
    @Test
    public void testGetAvaliableTable() {
        System.out.println("getAvaliableTable");
        Resturant instance = new Resturant();
        int expResult = 0;
        int result = instance.getAvaliableTable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAvaliableTable method, of class Resturant.
     */
    @Test
    public void testSetAvaliableTable() {
        System.out.println("setAvaliableTable");
        int avaliableTable = 0;
        Resturant instance = new Resturant();
        instance.setAvaliableTable(avaliableTable);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getResturantID method, of class Resturant.
     */
    @Test
    public void testGetResturantID() {
        System.out.println("getResturantID");
        Resturant instance = new Resturant();
        int expResult = 0;
        int result = instance.getResturantID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setResturantID method, of class Resturant.
     */
    @Test
    public void testSetResturantID() {
        System.out.println("setResturantID");
        int resturantID = 0;
        Resturant instance = new Resturant();
        instance.setResturantID(resturantID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
