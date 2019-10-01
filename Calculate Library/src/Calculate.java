//Nicholas Lee
//APCS Period 3
//AUG 29 2019
/*This is a Library of math functions.*/
public class Calculate {
	
	public static int square(int x) {
		return x * x;
	}
	
	public static int cube(int x) {
		return x * x * x;
	}

	public static double average(double num1, double num2) {
		return (num1 + num2) / 2.;
	}
	
	public static double average(double num1, double num2, double num3) {
		return (num1 + num2 + num3) / 3.;
	}
	
	public static double toDegrees(double rads) {
		return rads * (180./3.14159);
	}
	
	public static double toRadians(double degs) {
		return degs * (3.14159/180.);
	}
	
	public static double discriminant(double a, double b, double c) {
		return (b * b) - (4. * a * c);
		
	}
	
	public static String toImproperFrac(int a, int b, int c) {
		return a * c + b + "/" + c;
	}
	
	public static String toMixedNum(int a, int b) {
		return a / b + "_" + a % b + "/" + b;
	}
	
	public static String foil(int a, int b, int c, int d, String var) {
		return a*c+var+"^2" + " + " + ( a * d + b * c) + var + " + " + b*d;
	}
	
	public static boolean isDivisibleBy(int a, int b) {
		boolean yesorno = false;
		if (a % b == 0) {
			yesorno = true;
		}
		
		return yesorno;
	}
	
	public static double absValue(double num) {
		if (num < 0) {
			num = num * -1.;
		}
		return num;
	}
	
	public static double max(double a, double b) {
		double highestVal = 0;
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
	public static double max(double a, double b, double c) {
		double highestVal = 0;
		if (a > b && a > c) {
			highestVal = a;
		}
		else if (b > a && b > c) {
			highestVal = b;
		}
		else if (c > b & c > a) {
			highestVal = c;
		}
		else {
			System.out.println("They are all equal.");
		}
		return highestVal;
	}
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
	public static double min(double a, double b) {
		double lowestVal = 0;
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
	
	public static double round2(double num) {
		num = (num + 0.005) * 100;
		num = (int) num;
		num = num / 100;
		return num;
	}
	
	public static double exponent(double base, int power) {
		if (power < 0) {
			System.out.println("Negative exponents not supported.");
			return -1;
		}
		else if (power == 0) {
			return 1;
		}
		double factor = base;
		for (int a = 0; a < power; a++) {
			base = base * factor;
		}
		return base;
	}
	
	public static double factorial(int num) {
		int number = 1;
		for (int a = 1; a <= num; a++) {
			number = number * a;
		}
		return number;
	}
	
	public static boolean isPrime(int num) {
		boolean tempOutput = false;
		int timesTrue = 0;
		if (num == 1) {
			System.out.println("1 is a prime number"); 
			return true;
		}
		for (int i = 1; i <= num; i++) {
			tempOutput = isDivisibleBy(num, i);
			if (tempOutput == true) {
				timesTrue++;
			}
		}
		if (timesTrue == 2) {
			return true;
		}
		return false;
	}
	
	/* if true, test if the other is true */
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
	public static double sqrt(double input) {	
		double calculation = 10.;
		for (int i = 0; i < 10; i++) {
			calculation = (1./2.)*(input/calculation + calculation);
		}
		calculation = round2(calculation);
		return calculation;
		
	}
	public static String quadForm(int a, int b, int c) {
		if (discriminant(a, b, c) == 0) {
			double outputPos = (-b + sqrt(discriminant(a, b, c))) / (2 * a);
			return "There is only one root: " + outputPos;
		}
		else if (discriminant(a, b, c) < 0) {
			return "No real roots.";
		}
		double outputPos = (-b + sqrt(discriminant(a, b, c))) / (2 * a);
		double outputNeg = (-b - sqrt(discriminant(a, b, c))) / (2 * a);
		return "Positive root: " + outputPos + "\n" + "Negative root: " + outputNeg; 
	}
	public static String quadForm(double a, double b, double c) {
		if (discriminant(a, b, c) == 0) {
			double outputPos = (-b + sqrt(discriminant(a, b, c))) / (2 * a);
			return "There is only one root/x-intercept: " + outputPos;
		}
		else if (discriminant(a, b, c) < 0) {
			return "No real roots.";
		}
		double outputPos = (-b + sqrt(discriminant(a, b, c))) / (2 * a);
		double outputNeg = (-b - sqrt(discriminant(a, b, c))) / (2 * a);
		return "1st root/x-intercept: (" + outputPos + " , 0.0)" + "\n" + "2nd root/x-intercept: (" + outputNeg + " , 0.0)";
	}

}
