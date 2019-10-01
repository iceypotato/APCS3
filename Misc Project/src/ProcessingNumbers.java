import java.util.Scanner;

public class ProcessingNumbers {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("How many numbers do you have?");
		int numTimes = scanner.nextInt();
		while (numTimes <= 0) {
			System.out.println("Please enter a value greater than 0.");
			numTimes = scanner.nextInt();
		}
		System.out.println("Enter a number.");
		int input = scanner.nextInt();
		int max = input;
		int min = input;
		int sum = 0;
		String inputString = "";
		for (int i = 1; i <= numTimes; i++) {
			if (i == numTimes) {
				System.out.println("Would you like to go again? (y/N)");
				inputString = scanner.nextLine();
				if (inputString.equalsIgnoreCase("y")) {
					i = 1;
					System.out.println("How many numbers do you have?");
					numTimes = scanner.nextInt();
				}
			}
			if (input % 2 == 0) {
				sum += input;
			}
			if (input > max) {
				max = input;
			}
			else if (input < min) {
				min = input;
			}
			System.out.println("Enter next number.");
			input = scanner.nextInt();
		}
		if (input % 2 == 0) {
			sum += input;
		}
		if (input > max) {
			max = input;
		}
		else if (input < min) {
			min = input;
		}
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		System.out.println("Sum of even numbers: " + sum);
	}

}
