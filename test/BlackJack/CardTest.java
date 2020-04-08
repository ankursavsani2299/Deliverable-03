/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

import static BlackJack.Card.SPADES;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ankur
 */
public class CardTest {
    
    public CardTest() {
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

    @Test
    public void testGetSuit() {
        System.out.println("getSuit");
        Card instance = null;
        int expResult = 0;
        int result = instance.getSuit();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Card instance = null;
        int expResult = 0;
        int result = instance.getValue();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetSuitAsString() {
        System.out.println("getSuitAsString");
        int suit = 1;
        String expResult = "Hearts";
        String result = Card.getSuitAsString(suit);
        assertEquals("Pass", expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetValueAsString() {
        System.out.println("getValueAsString");
        int value = 11;
        String expResult = "Jack";
        String result = Card.getValueAsString(value);
        assertEquals("Pass", expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Card instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
