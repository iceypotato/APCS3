import java.util.Arrays;
import java.util.Scanner;

public class Split {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Your task Part 0

		//String.split();

		//It's a method that acts on a string, <StringName>.split(<sp>);

		//Where sp is the string where the string splits

		//And it returns an array

		// Example: "I like apples!".split(" ");

		// it will split at spaces and return an array of ["I","like","apples!"]
		String[] output = "I like apples!".split(" ");
		System.out.println(Arrays.toString(output));

		// Example 2: "I really like really red apples!".split("really")

		// it will split at the word "really" and return an array of ["I "," like ","red apples!"]
		String[] output2 = "I really like really red apples!".split("really");
		System.out.println(Arrays.toString(output2));

		//play around with String.split!
		

		//What happens if you "I reallyreally likeapples".split("really") ?
	 

		//Your task Part 1:

		/* Write a method that take in a string like

		 * "applespineapplesbreadlettucetomatobaconmayohambreadcheese"

		 * describing a sandwich.

		 * Use String.split to split up the sandwich by the word "bread" and return what's in the middle of

		 * the sandwich and ignores what's on the outside

		 * What if it's a fancy sandwich with multiple pieces of bread?

		 */
		
		String sandvitch = "mayobreadmayobreadmayobreadbaconbreadbacon";	//cheesebread //cheesebreadcheesebreadbreadhcheese	
		
		//bread counter
		int breads = 0;
		for (int i = 0 ; i < sandvitch.length()-4; i++) {
			if (sandvitch.substring(i, i+5).equals("bread")) {
				breads++;
				System.out.print(breads + " ");
			}
		}
		System.out.println();
		if (breads <= 1) {
			System.out.println("Not a freaking sandvitch");
		}
		else {
			String[] splitSandvitch = sandvitch.split("bread");
			System.out.println(Arrays.toString(splitSandvitch));
			if (breads > 2) {
				for (int i = 0 ; i < splitSandvitch.length - 3 ; i++) {
					combinedSandvitch += splitSandvitch[1]+splitSandvitch[2]
				}

			}
			else {
				System.out.println(splitSandvitch[1]);
			}
		}
		
		
		//Your task pt 2:

		/*Write a method that take in a string like

		 * "apples pineapples bread lettuce tomato bacon mayo ham bread cheese"

		 * describing a sandwich

		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of

		 * the sandwich and ignores what's on the outside.

		 * Again, what if it's a fancy sandwich with multiple pieces of bread?

		 */

	}
}