package com.rp.test.rpn;

import java.util.Stack;

/**
 *  This class perform the Reverse Polish Notation for the given inputs
 *
 */
public class Calculator {
	
	private Stack<Double> stack = new Stack<>();

	/**
     * Computes the outcome of a given expression in Reverse Polish Notation
     *
     * @param expr the expression to compute
     * @return Double
     */
    public double compute(String expr) throws
            Exception {    	
        for (String token : expr.split("\\s+")) {  
        	 Double value = tryParseDouble(token);
             if (value == null) {
            	int stackSize = stack.size();
            	if(stackSize > 1) {            		
		            switch (token) {
		                case "+": 
		                    stack.push(stack.pop() + stack.pop());
		                    break;
		                case "-": 
		                    stack.push(-stack.pop() + stack.pop());
		                    break;
		                case "*":
		                    stack.push(stack.pop() * stack.pop());
		                    break;
		                case "/":                    
		                    double divisor = stack.pop();
		                    if(divisor == 0) {
		                    	throw new Exception("Cannot divide by 0");	
		                    }
		                    stack.push(stack.pop() / divisor);
		                    break;                
		                default:
		                	throw new Exception("Operator is not supported");		                	
		            }		            
            	} else if (stackSize == 0) {            		
            		throw new Exception("Stack is empty");
         		} else {         			
         			throw new Exception("Stack does not have enought operands to perform the calculation");
         		}
             } else {              	
                stack.push(value);                
             }
        } 
        return stack.peek();
    }
    
    /**
     * Parse the input string for valid number  
     * @param String
     * @return Double
     */
    private Double tryParseDouble(String str) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return null;
        }
    }
}
