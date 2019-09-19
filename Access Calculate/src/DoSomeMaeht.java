
public class DoSomeMaeht {

	public static void main(String[] args) {
		System.out.println(Calculate.max(15, 20));
		System.out.println();
		System.out.println(Calculate.square(2));
		System.out.println();
		System.out.println(Calculate.cube(2));
		System.out.println();
		System.out.println(Calculate.average(1, 2));
		System.out.println();
		System.out.println(Calculate.average(1, 2, 3));
		System.out.println();
		System.out.println(Calculate.toRadians(180));
		System.out.println("To Degrees:");
		System.out.println(Calculate.toDegrees(3.14159));
		System.out.println("Discriminant:");
		System.out.println(Calculate.discriminant(1, 4, 1));
		System.out.println("ImproperFrac:");
		System.out.println(Calculate.toImproperFrac(2, 1, 3));
		System.out.println("Foil");
		System.out.println(Calculate.foil(2, 2, 1, 3, "x"));
		System.out.println("IsDivisible:");
		System.out.println(Calculate.isDivisibleBy(3, 3));
		System.out.println("Abs val");
		System.out.println(Calculate.absValue(-4));
		
		System.out.println(Calculate.round2(10.157));
		System.out.println("Exponent:");
		System.out.println(Calculate.exponent(2, 0));
		System.out.println();
		System.out.println(Calculate.factorial(10));
		System.out.println();
		System.out.println(Calculate.isPrime(1));
		System.out.println();
		System.out.println(Calculate.gcf(10,3));
		System.out.println();
		System.out.println(Calculate.sqrt(2));
	}

}
