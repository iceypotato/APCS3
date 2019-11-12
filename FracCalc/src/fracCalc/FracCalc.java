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
    	int[] ans = new int[3];
    	String[] expression = input.split(" ");
    	System.out.println(Arrays.toString(expression));
    	int[] frac1 = new int[3];
    	int[] frac2 = new int[3];
    	
    	String[] mixedNum1 = new String[2];
    	String[] fractionPart1 = new String[2];
    	//Putting things into place.
    	if (expression[0].indexOf("_") != -1) {
    		if (expression[0].indexOf("/") == -1) {
    			return "Invalid Syntax.";
    		}
    		else {
            	mixedNum1 = expression[0].split("_");
            	fractionPart1 = mixedNum1[1].split("/");
            	if (Integer.parseInt(mixedNum1[0]) < 0)
            		fractionPart1[0] = "-"+fractionPart1[0];
            	frac1[0] = 0;
            	frac1[1] = Integer.parseInt(mixedNum1[0]) * Integer.parseInt(fractionPart1[1]) + Integer.parseInt(fractionPart1[0]);
            	frac1[2] = Integer.parseInt(fractionPart1[1]);
    		}
    	}

    	else {
    		if (expression[0].indexOf("/") == -1) {
        		frac1[1] = Integer.parseInt(expression[0]);
        		frac1[2] = 1;
			}
    		else {
        		fractionPart1 = expression[0].split("/");
        		frac1[0] = 0;
        		frac1[1] = Integer.parseInt(fractionPart1[0]);
        		frac1[2] = Integer.parseInt(fractionPart1[1]);
			}
    	}

    	String[] mixedNum2 = new String[2];
    	String[] fractionPart2 = new String[2];
    	if (expression[2].indexOf("_") != -1) {
    		if (expression[2].indexOf("/") == -1) {
        		return "Invalid Syntax";
			}
        	mixedNum2 = expression[2].split("_");
        	fractionPart2 = mixedNum2[1].split("/");
        	if (Integer.parseInt(mixedNum1[0]) < 0)
        		fractionPart2[0] = "-"+fractionPart2[0];
        	frac2[0] = 0;
        	frac2[1] = Integer.parseInt(mixedNum2[0]) * Integer.parseInt(fractionPart2[1]) + Integer.parseInt(fractionPart2[0]);
        	frac2[2] = Integer.parseInt(fractionPart2[1]);
    	}
    	else {
    		if (expression[2].indexOf("/") == -1) {
    			frac2[1] = Integer.parseInt(expression[2]);
        		frac2[2] = 1;
			} else {
	    		fractionPart2 = expression[2].split("/");
	        	frac2[0] = 0;
	        	frac2[1] = Integer.parseInt(fractionPart2[0]);
	        	frac2[2] = Integer.parseInt(fractionPart2[1]);
			}
    	}
    	
    	System.out.println(Arrays.toString(frac1) + "\n" + Arrays.toString(frac2));
    	
    	//Calculation below
    	if (expression[1].equals("-") || expression[1].equals("+")) {
    		if (frac1[2] != frac2[2]) {
    			frac1[1] *= frac2[2];
    			frac2[1] *= frac1[2];
    			ans[2] = frac1[2] * frac2[2];
    		}
    		if (expression[1].equals("+")) {
        		ans[1] = frac1[1] + frac2[1];
			}
    		else {
    			ans[1] = frac1[1] - frac2[1];
    		}

    	}
    	if (expression[1].equals("*") || expression[1].equals("/")) {
    		if (expression[1].equals("/")) {
    			ans[1] = frac1[1] * frac2[2];
    			ans[2] = frac1[2] * frac2[1];
    		}
    		else {
        		ans[1] = frac1[1] * frac2[1];
        		ans[2] = frac1[2] * frac2[2]; 
    		}
    	}
    	
    	
        // TODO: Implement this function to produce the solution to the input
    	return toMixedNum(ans[1], ans[2]);
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
	public static int max(int a, int b) {
		int highestVal = 0;
		if (a > b) {
			highestVal = a;
		}
		else if (b > a) {
			highestVal = b;
		}
		else {
			highestVal = a;
			System.out.println("They are all equal.");
		}
		return highestVal;
	}
	public static int min(int a, int b) {
		int lowestVal = 0;
		if (a<b) {
			lowestVal = a;
		}
		else if (b<a) {
			lowestVal = b;
		}
		else {
			System.out.println("The Values are equal.");
			lowestVal = a;		
		}
		return lowestVal;
	}
	public static boolean isDivisibleBy(int a, int b) {
		boolean yesorno = false;
		if (a % b == 0) {
			yesorno = true;
		}
		
		return yesorno;
	}
	public static int gcf(int num1, int num2) {
		int maxNumber = max(num1, num2);
		int minNumber = min(num1, num2);
		System.out.println(maxNumber + " " + minNumber);
		
		for (int i = minNumber;  i > 0; i--) {
			boolean a = isDivisibleBy(maxNumber, i);
			boolean b = isDivisibleBy(minNumber, i);
			if (a == true && b == true) {
				return i;
			}
		}
		System.out.println("The GCF is one.");
		return 1;
	}
	public static String toMixedNum(int a, int b) {
		if (a == 0 && b == 0) {
			return "0";
		}
		else if (b < 0) {
			b *= -1;
			return -a/b+"_" + a%b + "/" + b;
		}
		return a / b + "_" + a % b + "/" + b;
	}
	public static int absValue(int num) {
		return num;
	}
    
    
}
