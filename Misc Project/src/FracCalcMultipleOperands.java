

import java.util.Arrays;
import java.util.Scanner;

public class FracCalcMultipleOperands {

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
    	String[] expression = input.split(" "); //1 - 1/2 - 4/5
    	System.out.println(Arrays.toString(expression));
    	int[] ans = new int[2];
    	int[] fractions = new int[4];
		int[] fracIndex = new int[2];
    	//Putting things into place.

    	for (int i = 1; i < ans.length; i+=2) {
    		if (expression[i].equals("*") || expression[i].equals("/")) {
	    		if (expression[i].equals("/")) {
	    			ans[1] = fractions[0] * fractions[3];
	    			ans[2] = fractions[1] * fractions[2];
	    		}
	    		else {
	        		ans[1] = fractions[0] * fractions[2];
	        		ans[2] = fractions[1] * fractions[3]; 
	    		}
    	    	
    	    	for (int a = 0 ; a < expression.length ; a++) {
    	    		if (a == i+1) {
    	    			expression[a] = toMixedNum(ans[0], ans[1]);
    	    			a++;
    	    		}
    	    		expression[a] = expression[a];
    	    	}
    		}
    	}
    	for (int i = 1; i < ans.length; i+=2) {
    		if (expression[i].equals("-") || expression[i].equals("+")) {
    			if (fractions[1] != fractions[3]) {
    				fractions[0] *= fractions[4];
    				fractions[2] *= fractions[1];
    				ans[2] = fractions[1] * fractions[3];
    			}
    			else {
    				ans[2] = fractions[1];
    			}
    			if (expression[1].equals("+")) {
    				ans[1] = fractions[0] + fractions[2];
    			}
    			else {
    				ans[1] = fractions[0] - fractions[2];
    			}
			}
    	}
    }
        // TODO: Implement this function to produce the solution to the input

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
	public static int abs(int num) {
    		if (num < 0) {
			num *= -1;
		}
		return num;
	}
	public static int[] toImproperFrac(String mixNum1,int[] fractions) {
		String[] mixedNum = new String[2];
		String[] fractionPortion = new String[2];
		return fractions;
	}
	public static String toMixedNum(int a, int b) {
		if (abs(a) % abs(b)==0)
			return a / b+"";
		if (a/b == 0) {
			if (b < 0) {
				b *= -1;
				a *= -1;
			}
			return a + "/" + b; 
		}
		return a / b + "_" + abs(a) % abs(b) + "/" + abs(b);
	}
}
