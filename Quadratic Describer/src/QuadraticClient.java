import java.util.Scanner;

public class QuadraticClient {

	static Scanner scan = new Scanner(System.in);
	static String exception = "";
	public static void main(String[] args) {
		System.out.println("Welcome to the Quadratic Describer");
		System.out.print("a: "); 
		try {
			double a = scan.nextDouble();
		} catch (Exception e) {
			System.out.println("The value you entered was not a double.");
			exception = e.getMessage();
		}
	}

}
