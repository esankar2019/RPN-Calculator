package com.rp.test.rpn;

import java.util.Scanner;

/**
 * Main class for Reverse Polish Notation calculator 
 *
 */
public class RPNCalculator 
{
    /**
     * Runs the RPN calculation for a given expression 
     */
    public static void main(String[] args) {
        try {
        	
        	// Use Scanner to get the input from the user 
            Scanner in = new Scanner(System.in); 
            
            Calculator calculator = new Calculator();
            
            while (true) {
	            if(in.hasNextLine()) {
	            	String inputString = in.nextLine();
		            if ("q".equalsIgnoreCase(inputString)) {
		                break;
		            } else {               
		            	try {
							double result = calculator.compute(inputString);
							System.out.println(result);
						} catch (Exception ex) {							
							System.out.println(ex.getMessage());
						}
		            }
	            } else {
	            	break;
	            }	            	
            } 
            //close the input stream
            in.close();
                    
        } catch (Exception err) {
            System.out.println(err.getMessage());
        } 
    }
}
