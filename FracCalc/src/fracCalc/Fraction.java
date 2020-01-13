package fracCalc;

public class Fraction {

	int whole;
	int numerator;
	int denominator;
	
	public Fraction(String operand) {
		String[] mixedNum = new String[2];
		String[] fractionPortion = new String[2];
		if (operand.indexOf("_") != -1) {
			if (operand.indexOf("/") == -1) {
				throw new IllegalArgumentException("Ur stupid at making fractions");
			} else {
				mixedNum = operand.split("_");
				fractionPortion = mixedNum[1].split("/");
				if (Integer.parseInt(mixedNum[0]) < 0)
					fractionPortion[0] = "-" + fractionPortion[0];
				whole = Integer.parseInt(mixedNum[0]);
				numerator = Integer.parseInt(fractionPortion[1]);
			}
		}

		else {
			if (operand.indexOf("/") == -1) {
				whole = Integer.parseInt(operand);
				denominator = 1;
			} else {
				fractionPortion = operand.split("/");
				numerator = Integer.parseInt(fractionPortion[0]);
				denominator = Integer.parseInt(fractionPortion[1]);
			}
		}
	}
	public void toImproper() {
		if (whole != 0) {
			numerator = whole * denominator + numerator;
			whole = 0;
		}
	}
	
	public void reduce() {
		
	}
	
	private static int max(int a, int b) {
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

	private static int min(int a, int b) {
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

	private static boolean isDivisibleBy(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("Divide by 0");
		}
		boolean yesorno = false;
		if (a % b == 0) {
			yesorno = true;
		}

		return yesorno;
	}

	private static int gcf(int num1, int num2) {
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

	private static int abs(int num) {
		if (num < 0) {
			num *= -1;
		}
		return num;
	}
	//1_1/2

	private static String toMixedNum(int a, int b) {
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
