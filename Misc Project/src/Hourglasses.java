import java.util.Scanner;

public class Hourglasses {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("how big you want hourglass?");
		int size = scanner.nextInt();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - 2; j++) {
				for (int a = 0; a < size ; a++) {
					String quotes = "";
					
					for (int ab = 0; ab<size; ab++) {
						quotes += "\"";
					}
					String lineone = "|" + quotes + "|";
					System.out.println(lineone);
					
				}
			}
		}
	}

}
