/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class geminiTest {

    public geminiTest() {
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
    public void testAddition() {
        double expectedResult = 10;
        double result = gemini.calculate(5, '+', 5);
        assertEquals(expectedResult, result, 0.001);
    }

    @Test
    public void testSubtraction() {
        double expectedResult = 3;
        double result = gemini.calculate(8, '-', 5);
        assertEquals(expectedResult, result, 0.001);
    }

    @Test
    public void testMultiplication() {
        double expectedResult = 21;
        double result = gemini.calculate(7, '*', 3);
        assertEquals(expectedResult, result, 0.001);
    }

    @Test
    public void testDivision() {
        double expectedResult = 5;
        double result = gemini.calculate(10, '/', 2);
        assertEquals(expectedResult, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        gemini.calculate(10, '/', 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidOperator() {
        gemini.calculate(10, '%', 2);
    }
}

