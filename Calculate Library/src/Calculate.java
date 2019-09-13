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
			a = highestVal;
		}
		else if (b > a) {
			b = highestVal;
		}
		else {
			System.out.println("They are all equal.");
		}
		return highestVal;
	}
	
	public static double max(double a, double b, double c) {
		double highestVal = 0;
		if (a > b && a > c) {
			a = highestVal;
		}
		else if (b > a && b > c) {
			b = highestVal;
		}
		else if (c > b & c > a) {
			c = highestVal;
		}
		else {
			System.out.println("They are all equal.");
		}
		return highestVal;
	}
	
	public static int min(int a, int b) {
		int lowestVal = 0;
		if (a<b) {
			a = lowestVal;
		}
		else if (b<a) {
			b = lowestVal;
		}
		else {
			System.out.println("The Values are equal.");
			a = lowestVal;		
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
		double factor = base;
		for (int a = 0; a < power; a++) {
			base = base * factor;
		}
		return base;
	}
	
	public static double factorial(int num) {
		int number = 1;
		for (int a = 1; a < num; a++) {
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
	
	public static int gcf(int num1, int num2) {
		return -1;
	}

}
