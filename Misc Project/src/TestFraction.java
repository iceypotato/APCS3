import fracCalc.Fraction;

public class TestFraction {

	public static void main(String[] args) {
		Fraction frac1 = new Fraction("2");
		Fraction frac2 = new Fraction("3");
		System.out.println(frac1);
		System.out.println(frac2);
		frac1.add(frac2);
		System.out.println(frac1);
		
	}

}
