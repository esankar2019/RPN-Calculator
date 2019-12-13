package com.rp.test.rpn;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for Calculator class 
 */
public class CalculatorTest
{
	@Test
    public void testAddition() throws Exception {
        Calculator calculator = new Calculator();        
        assertEquals(7, calculator.compute("5 2 +"), 0);
        assertEquals(9, calculator.compute("1 8 +"), 0);
    }
	
	@Test
    public void testSubtraction() throws Exception {
        Calculator calculator = new Calculator();        
        assertEquals(3, calculator.compute("5 2 -"), 0);
        assertEquals(7, calculator.compute("8 1 -"), 0);
    }
	
	@Test
    public void testMultiplication() throws Exception {
        Calculator calculator = new Calculator();        
        assertEquals(6, calculator.compute("2 3 *"), 0);
        assertEquals(15, calculator.compute("3 5 *"), 0);
    }
	
	@Test
    public void testDivison() throws Exception {
        Calculator calculator = new Calculator();        
        assertEquals(3, calculator.compute("6 2 /"), 0);
        assertEquals(5, calculator.compute("15 3 /"), 0);
    }
	
	@Test
    public void testEmptyStack() throws Exception {
        Calculator calculator = new Calculator();        
        try {
            calculator.compute("+");
        } catch (Exception ex) {
            assertEquals("Stack is empty", ex.getMessage());
        }
    }
	
	@Test
    public void testInsufficientOperand() throws Exception {
        Calculator calculator = new Calculator();        
        try {
            calculator.compute("2 +");
        } catch (Exception ex) {
            assertEquals("Stack does not have enought operands to perform the calculation", ex.getMessage());
        }
    }
	
	@Test
    public void testOperatorNotSupported() throws Exception {
        Calculator calculator = new Calculator();        
        try {
            calculator.compute("2 1 ^");
        } catch (Exception ex) {
            assertEquals("Operator is not supported", ex.getMessage());
        }
    }
	
	@Test
    public void testDivideByZero() throws Exception {
        Calculator calculator = new Calculator();        
        try {
            calculator.compute("2 0 /");
        } catch (Exception ex) {
            assertEquals("Cannot divide by 0", ex.getMessage());
        }
    }
}
