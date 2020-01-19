import fracCalc.Fraction;

public class TestFraction {

	public static void main(String[] args) {
		Fraction frac = new Fraction("5");
		Fraction frac2 = new Fraction("-6");
		frac.multiply(frac2);
		System.out.println(frac.toString());
	}

}
