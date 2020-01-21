/*
 * Nicholas Lee
 * 12/19/2019
 * 3rd
 * 
 * 
 * This accepts an expression of fractions and evaluates it.
 */


package fracCalcFall;

import java.util.Arrays;
import java.util.Scanner;

public class FracCalcFall {

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

	// ** IMPORTANT ** DO NOT DELETE THIS FUNCTION. This function will be used to
	// test your code
	// This function takes a String 'input' and produces the result
	//
	// input is a fraction string that needs to be evaluated. For your program, this
	// will be the user input.
	// e.g. input ==> "1/2 + 3/4"
	//
	// The function should return the result of the fraction after it has been
	// calculated
	// e.g. return ==> "1_1/4"
	public static String produceAnswer(String input) {
		if (input.indexOf(" ") == -1) {
			return "Invalid Syntax.";
		}
		String[] expression = input.split(" "); // 5_3/4 - -6_8/8 - 5_3/4
		
		String[] expressionParts = null;
		int[] ans = new int[2];
		int[] frac1 = new int[2];
		int[] frac2 = new int[2];

		// Putting things into place.
		for (int i = 1; i < expression.length; i += 0) { //Loop scans for multiplication and addition
			String[] newExpression = new String[expression.length - 2];
			if (expression[i].equals("*") || expression[i].equals("/")) {
				toImproperFrac(expression[i - 1], frac1);
				toImproperFrac(expression[i + 1], frac2);
				if (frac1 == null || frac2 == null) {
					return "Invalid Syntax. Missing a \"/\"";
				}
				if (expression[i].equals("/")) {
					ans[0] = frac1[0] * frac2[1];
					ans[1] = frac1[1] * frac2[0];
				} else if (expression[i].equals("*")) {
					ans[0] = frac1[0] * frac2[0];
					ans[1] = frac1[1] * frac2[1];
				}
				int tempAns1 = ans[0], tempAns2 = ans[1];
				ans[0] /= gcf(tempAns1, tempAns2);
				ans[1] /= gcf(tempAns1, tempAns2);
				int j = 0;
				for (int a = 0; a < expression.length; a++) {
					if (a == i - 1) {
						newExpression[j] = toMixedNum(ans[0], ans[1]);
						a += 2;
						j++;
					} else {
						newExpression[j] = expression[a];
						j++;
					}

				}
				expression = newExpression;
			}
			else if (expression[i].equals("+") || expression[i].equals("-")) {
				i += 2;
			}
			else {
				return "Invalid Operation.";
			}

		}
		for (int i = 1; i < expression.length; i += 0) {
			String[] newExpression = new String[expression.length - 2];
			if (expression[i].equals("-") || expression[i].equals("+")) {
				toImproperFrac(expression[i - 1], frac1);
				toImproperFrac(expression[i + 1], frac2);
				if (frac1 == null || frac2 == null) {
					return "Invalid Syntax. Missing a \"/\"";
				}
				if (frac1[1] != frac2[1]) {
					frac1[0] *= frac2[1];
					frac2[0] *= frac1[1];
					ans[1] = frac1[1] * frac2[1];
				} 
				else {
					ans[1] = frac1[1];
				}
				if (expression[i].equals("+")) {
					ans[0] = frac1[0] + frac2[0];
				} 
				else if (expression[i].equals("-")) {
					ans[0] = frac1[0] - frac2[0];
				}
				int tempAns1 = ans[0], tempAns2 = ans[1];
				ans[0] /= gcf(tempAns1, tempAns2);
				ans[1] /= gcf(tempAns1, tempAns2);
				int j = 0;
				for (int a = 0; a < expression.length; a++) {
					if (a == i - 1) {
						newExpression[j] = toMixedNum(ans[0], ans[1]);
						a += 2;
						j++;
					} else {
						newExpression[j] = expression[a];
						j++;
					}

				}
				expression = newExpression;
			}
			else if (expression[i].equals("*") || expression[i].equals("/")) {
				i += 2;
			}
			else {
				return "Invalid Operation.";
			}
		}
		return expression[0];
	}
	// TODO: Implement this function to produce the solution to the input

	// TODO: Fill in the space below with any helper methods that you think you will
	// need
	public static int max(int a, int b) {
		int highestVal = 0;
		if (a > b) {
			highestVal = a;
		} else if (b > a) {
			highestVal = b;
		} else {
			highestVal = a;
		}
		return highestVal;
	}

	public static int min(int a, int b) {
		int lowestVal = 0;
		if (a < b) {
			lowestVal = a;
		} else if (b < a) {
			lowestVal = b;
		} else {
			lowestVal = a;
		}
		return lowestVal;
	}

	public static boolean isDivisibleBy(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("Divide by 0");
		}
		boolean yesorno = false;
		if (a % b == 0) {
			yesorno = true;
		}

		return yesorno;
	}

	public static int gcf(int num1, int num2) {
		int maxNumber = max(num1, num2);
		int minNumber = min(num1, num2);
		if (minNumber < 0)
			minNumber *= -1;
		for (int i = minNumber; i > 0; i--) {
			boolean a = isDivisibleBy(maxNumber, i);
			boolean b = isDivisibleBy(minNumber, i);
			if (a == true && b == true) {
				return i;
			}
		}
		return 1;
	}

	public static int abs(int num) {
		if (num < 0) {
			num *= -1;
		}
		return num;
	}
	//1_1/2
	public static int[] toImproperFrac(String mixNumRaw, int[] fractions) {
		String[] mixedNum = new String[2];
		String[] fractionPortion = new String[2];
		if (mixNumRaw.indexOf("_") != -1) {
			if (mixNumRaw.indexOf("/") == -1) {
				return null;
			} else {
				mixedNum = mixNumRaw.split("_");
				fractionPortion = mixedNum[1].split("/");
				if (Integer.parseInt(mixedNum[0]) < 0)
					fractionPortion[0] = "-" + fractionPortion[0];
				fractions[0] = Integer.parseInt(mixedNum[0]) * Integer.parseInt(fractionPortion[1]) + Integer.parseInt(fractionPortion[0]);
				fractions[1] = Integer.parseInt(fractionPortion[1]);
			}
		}

		else {
			if (mixNumRaw.indexOf("/") == -1) {
				fractions[0] = Integer.parseInt(mixNumRaw);
				fractions[1] = 1;
			} else {
				fractionPortion = mixNumRaw.split("/");
				fractions[0] = Integer.parseInt(fractionPortion[0]);
				fractions[1] = Integer.parseInt(fractionPortion[1]);
			}
		}
		return fractions;
	}

	public static String toMixedNum(int a, int b) {
		int temp1 = 0, temp2 = 0;
		if (abs(a) % abs(b) == 0)
			return a / b + "";
		if (a / b == 0) {
			if (b < 0) {
				b *= -1;
				a *= -1;
			}
			return a + "/" + b;
		}
		return a / b + "_" + abs(a) % abs(b) + "/" + abs(b);
	}
}
