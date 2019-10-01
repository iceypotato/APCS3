

public class Quadratic {
	//list the stretch factor, if graph is flipped, and roots
	public static String quadrDescriber(double a, double b, double c) {
		String abc = a+"x^2 + " + b+"x + " + c+"x";
		String inverted = "";
		if (a < 0) {
			inverted = "The graph opens downward.";
		}
		else {
			inverted = "The graph opens up.";
		}
		String slope = "Stretch Factor: " + a;
		String discriminant = "Discriminant: " + Calculate.discriminant(a, b, c);
		String yIntercept = "Y-intercept: (0.0 , " + c + ")";
		String quadForm = Calculate.quadForm(a, b, c);
		
		return "Description of " + abc + "\n\n" + inverted + "\n" + slope + "\n" + discriminant + "\n" + yIntercept + "\n" + quadForm;
	}
}
