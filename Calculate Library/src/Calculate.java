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
		return degs * (3.14159/180);
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

}
