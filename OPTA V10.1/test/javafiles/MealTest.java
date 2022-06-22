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
public class MealTest {
    
    public MealTest() {
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
/*
    @Test
    public void testAddMeal() {
        //passed 
        System.out.println("addMeal");
        Meal instance = new Meal("$MANGO$&",15,12.12, 2);
        boolean expResult = true;
        boolean result = instance.addMeal();
        assertEquals(expResult, result);

    }
*/
    /**
     * Test of viewMeal method, of class Meal.
     */
    @Test
    public void testViewMeal() {
        System.out.println("viewMeal");
        int resID = 3;
        Meal[] expResult = new Meal[1];
        expResult[0] = new Meal("Pepperoni",8,15,3);
        Meal[] result = Meal.viewMeal(resID);
        //System.out.println(expResult[0].getName() + "         " + result[0].getName());
        assertEquals(expResult[0].getName(), result[0].getName());

    }


    /**
     * Test of fillMealInfo method, of class Meal.
     */
    @Test
    public void testFillMealInfo_0() {
        System.out.println("fillMealInfo");
        int mealID = 8;
        Meal instance = new Meal();
        boolean expResult = true;
        boolean result = instance.fillMealInfo(mealID);
        assertEquals(expResult, result);
    }
    @Test
    public void testFillMealInfo_1() {
        System.out.println("fillMealInfo");
        int mealID = 999;
        Meal instance = new Meal();
        boolean expResult = false;
        boolean result = instance.fillMealInfo(mealID);
        assertEquals(expResult, result);
    }
    @Test
    public void testFillMealInfo_2() {
        System.out.println("fillMealInfo params");
        int mealID = 1;
        Meal instance = new Meal();
        
        boolean result = instance.fillMealInfo(mealID);
        boolean expResult = getters(instance);
        assertEquals(expResult, result);
    }
    boolean getters(Meal meal){
        String name = "Fried Mango";
        double price =30;
        int mealID = 1, resID = 1;
        
        if(name.equals(meal.getName()) && price == meal.getPrice() && mealID == meal.getMealID() && resID == meal.getResID())
            return true;
        else 
            return false;
    }
}
