import java.util.Scanner;

public class QuadraticClient {

	static Scanner scan = new Scanner(System.in);
	static String exception = "";
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Quadratic Describer");
		System.out.print("a: "); 
		double a = scan.nextDouble();
		System.out.print("b: ");
		double b = scan.nextDouble();
		System.out.print("c: ");
		double c = scan.nextDouble();
		System.out.println();
		Quadratic.quadrDescriber(a, b, c);
	}

}
