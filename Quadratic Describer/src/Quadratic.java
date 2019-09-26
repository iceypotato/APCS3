

public class Quadratic {
	//list the stretch factor, if graph is flipped, and roots
	public static String quadrDescriber(double a, double b, double c) {
		System.out.println(a+"x^2 + " + b+"x + " + c+"x");
		if (a < 0) {
			System.out.println("the Graph is inverted.\n" + "Slope: " + a);
		}
		System.out.println("Slope: " + a);
		System.out.println("Discriminant: " + Calculate.discriminant(a, b, c));
		System.out.println("Y-intercept: " + c);
		System.out.println(Calculate.quadForm(a, b, c));
		
		return "Done!";
	}
}
