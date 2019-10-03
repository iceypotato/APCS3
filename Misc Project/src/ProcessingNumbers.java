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
		int maxEven = input;
		int sum = 0;
		String inputString = "";
		for (int i = 0; i < numTimes-1; i++) {
			if (input % 2 == 0) {
				sum += input;
			}
			if (input % 2 == 0 && input > maxEven) {
				maxEven = input;
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
		//update one more time
		if (input % 2 == 0) {
			sum += input;
		}
		if (input % 2 == 0 && input > maxEven) {
			maxEven = input;
		}
		if (input > max) {
			max = input;
		}
		else if (input < min) {
			min = input;
		}
		// ^^^^^
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		if (sum == 0) {
			System.out.println("There are no even numbers.");
		}
		else {
			System.out.println("Sum of even numbers: " + sum);
			System.out.println("Max even number: " + maxEven);
		}
	}
}
