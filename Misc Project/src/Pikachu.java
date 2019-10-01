//This is for testing code before I implement them.
public class Pikachu {
	
	public static void main(String[] args) {
		printPikachu();
		box();
		System.out.println("He's sad now.");
	}
	
	public static void printPikachu() {
		System.out.println("Pikachu goes in this secret box.");
		System.out.println("(\\__/)");
		System.out.println("(o^.^");
	}
	
	public static void plusline() {
		System.out.println("+----------------+");
	}
	public static void verticalLine() {
		System.out.println("|                |");
	}
	public static void box() {
		plusline();
		verticalLine();
		verticalLine();
		verticalLine();
		verticalLine();
		verticalLine();
		plusline();
	}
}
