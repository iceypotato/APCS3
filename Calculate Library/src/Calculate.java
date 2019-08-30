//Nicholas Lee
//APCS Period 3
//AUG 29 2019
/*This is a Library of math functions.*/
public class Calculate {
	
	public static int square(int number) {
		return number * number;
	}
	public static int cube(int num) {
		return num * num * num;
	}
	public static double average(double num, double num2) {
		return (num + num) / 2. ;
	}
	public static double average(double num, double num2, double num3) {
		return (num + num2 + num3) / 3;
	}
	public static double toDegrees(double rads) {
		return rads * (180./3.14159);
	}
	public static double toRadians(double degs) {
		return degs * (3.14159/180.);
	}
	public static double discriminant(double a, double b, double c) {
		return (b*b) - (4.0 * a * c);
	}
	public static double toImproperFrac() {
		return ;
	}
}
