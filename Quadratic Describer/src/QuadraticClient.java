//Nicholas Lee
//APCS 3rd
//September 30, 2019
//This will describe a quadratic equation from the a, b, and c values.

import java.util.Scanner;



public class QuadraticClient {

	static Scanner scan = new Scanner(System.in);
	static String exception = "";
	
	public static void main(String[] args) {
		double a = 0.;
		double b = 0.;
		double c = 0.;
		System.out.println("Welcome to the Quadratic Describer");
		System.out.println("Provide values for the variables shown below.");
		System.out.print("a: "); 
		a = scan.nextDouble();
		System.out.print("b: ");
		b = scan.nextDouble();
		System.out.print("c: ");
		c = scan.nextDouble();
		System.out.println();
		System.out.println(Quadratic.quadrDescriber(a, b, c));
	}

}
