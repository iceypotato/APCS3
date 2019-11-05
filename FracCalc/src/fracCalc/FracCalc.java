package fracCalc;

import java.util.Arrays;
import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	System.out.println("Fractional Calculator, Input Calculation Below");
    	Scanner input = new Scanner(System.in);
		String calculate = "";
		calculate = input.nextLine();
		while (!calculate.equalsIgnoreCase("quit")) {
    		System.out.println(produceAnswer(calculate));
    		calculate = input.nextLine();
		}
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input) {
    	String[] expression = input.split(" ");
    	System.out.println(Arrays.toString(expression));
    	int[] frac1 = new int[3];
    	int[] frac2 = new int[3];
    	
    	String[] mixedNum1 = new String[2];
    	String[] fractionPart1 = new String[2];
    	if (expression[0].indexOf("_") != -1) {
        	mixedNum1 = expression[0].split("_");
        	fractionPart1 = mixedNum1[1].split("/");
        	frac1[0] = Integer.parseInt(mixedNum1[0]);
        	frac1[1] = Integer.parseInt(fractionPart1[0]);
        	frac1[2] = Integer.parseInt(fractionPart1[1]);
        	
    	}
    	else if (expression[0].indexOf("_") == -1) {
    		fractionPart1 = expression[0].split("/");
    		frac1[0] = 0;
    		frac1[1] = Integer.parseInt(fractionPart1[0]);
    		frac1[2] = Integer.parseInt(fractionPart1[1]);
    		
    	}
    	else {
    		frac1[0] = Integer.parseInt(expression[0]);
    	}
    	
    	String[] mixedNum2 = new String[2];
    	String[] fractionPart2 = new String[2];
    	if (expression[2].indexOf("_") != -1) {
        	mixedNum2 = expression[2].split("_");
        	fractionPart2 = mixedNum2[1].split("/");
        	frac2[0] = Integer.parseInt(mixedNum2[0]);
        	frac2[1] = Integer.parseInt(fractionPart2[0]);
        	frac2[2] = Integer.parseInt(fractionPart2[1]);
    	}
    	else if (expression[2].indexOf("_") == -1) {
    		fractionPart2 = expression[2].split("/");
        	frac2[0] = 0;
        	frac2[1] = Integer.parseInt(fractionPart2[0]);
        	frac2[2] = Integer.parseInt(fractionPart2[1]);
    	}
    	else {
    		frac2[0] = Integer.parseInt(expression[2]);
    	}
    	
    	//To improper frac VVV
    	
    	
        // TODO: Implement this function to produce the solution to the input
    	return "whole:" + frac2[0] + " numerator:" + frac2[1] + " denominator:" + frac2[2];
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
