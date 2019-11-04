import java.util.Scanner;

public class Hourglass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("how big you want hourglass? ");
		int size = scanner.nextInt();
		System.out.print("|");
		for (int i = 0; i < size; i++) {
			System.out.print("\"");
		}
		System.out.println("|");
		for (int i = 1; i <= size/2; i++) {
			if (i == size/2) {
			}
			else {
				System.out.print(printSpace(i));
				System.out.print("\\");
				System.out.print(printColons(size-2*i));
				System.out.println("/");
			}
			
		}
		System.out.println(printSpace(size/2) + "||");
		for (int i = size/2; i >= 1; i--) {
			if (i != 1) {
				System.out.print(printSpace(i-1));
				System.out.print("/");
				System.out.print(printColons(size-2*(i-1)));
				System.out.println("\\");
			}
		}
		System.out.print("|");
		for (int i = 0; i < size; i++) {
			System.out.print("\"");
		}
		System.out.println("|");
	}
	
	public static String printSpace(int spaces) {
		String spString = "";
		for (int i = 0; i < spaces; i++) {
			spString += " ";
		}
		return spString;
	}
	public static String printColons(int colons) {
		String colon = "";
		for (int i = 0; i < colons; i++) {
			colon += ":";
		}
		return colon;
	}

}
