package fracCalc;

public class Fraction {

	int whole;
	int numerator;
	int denominator;
	
	public Fraction(String operand) {
		String[] mixedNum = new String[2];
		String[] fractionPortion = new String[2];
		if (operand.indexOf("_") != -1) {
			if (operand.indexOf("/") == -1) {
				throw new IllegalArgumentException("Ur stupid at making fractions");
			} else {
				mixedNum = operand.split("_");
				fractionPortion = mixedNum[1].split("/");
				if (Integer.parseInt(mixedNum[0]) < 0)
					fractionPortion[0] = "-" + fractionPortion[0];
				whole = Integer.parseInt(mixedNum[0]);
				numerator = Integer.parseInt(fractionPortion[1]);
			}
		}

		else {
			if (operand.indexOf("/") == -1) {
				fractions[0] = Integer.parseInt(operand);
				fractions[1] = 1;
			} else {
				fractionPortion = operand.split("/");
				fractions[0] = Integer.parseInt(fractionPortion[0]);
				fractions[1] = Integer.parseInt(fractionPortion[1]);
			}
		}
	}
	
}
