

public class Quadratic {
	
	//Start of requred methods
	public static double discriminant(double a, double b, double c) {
		return (b * b) - (4. * a * c);
		
	}
	
	public static double round2(double num) {
		boolean wasNegative = false;
		if (num < 0) {
			num *= -1;
			wasNegative = true;
		}
		num = (num + 0.005) * 100;
		num = (int) num;
		num = num / 100;
		if (wasNegative == true) {
			return num * -1;	
		}
		return num;
	}
	
	public static double sqrt(double input) {	
		double calculation = 10.;
		for (int i = 0; i < 10; i++) {
			calculation = (1./2.)*(input/calculation + calculation);
		}
		calculation = round2(calculation);
		return calculation;
		
	}
	
	public static String quadForm(double a, double b, double c) {
		if (discriminant(a, b, c) == 0) {
			double outputPos = (-b + sqrt(discriminant(a, b, c))) / (2 * a);
			if (outputPos == -0.0) {
				outputPos *= -1;
			}
			return "There is only one root/x-intercept: " + outputPos;
		}
		else if (discriminant(a, b, c) < 0) {
			return "No real roots.";
		}
		double outputPos = (-b + sqrt(discriminant(a, b, c))) / (2 * a);
		double outputNeg = (-b - sqrt(discriminant(a, b, c))) / (2 * a);
		return "X-intercepts: " + outputPos + " , " + outputNeg;
	}
	public static double square(double x) {
		return x * x;
	}
	//end of requred methods
	
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
		String discriminant = "Discriminant: " + discriminant(a, b, c);
		double vertexX = -b / 2*a;
		String vertex = "Vertex: (" + vertexX + " , " + a*(square(vertexX) + b*vertexX + c) + ")";
		String yIntercept = "Y-intercept: " + c;
		String quadForm = quadForm(a, b, c);
		
		return "Description of " + abc + "\n\n" + inverted + "\n" + slope + "\n" + vertex + "\n" + yIntercept + "\n" + quadForm;
	}
}
