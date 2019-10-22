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

		/*Write a method that take in a string like

		 * "applespineapplesbreadlettucetomatobaconmayohambreadcheese"

		 * describing a sandwich.

		 * Use String.split to split up the sandwich by the word "bread" and return what's in the middle of

		 * the sandwich and ignores what's on the outside

		 * What if it's a fancy sandwich with multiple pieces of bread?

		 */
		String sandvitch = ("breadchesebread");
		String[] sandvitchArray = null;
		if (sandvitch.indexOf("bread") == -1) {//no bread exists
			System.out.println("not a freadking sandvitch");
		}
		else {
			
		}
		String stinr = "hi my name is ohdaiw";
		stinr.()
		
		

			
		
		//System.out.println("Enter ur epic sandvitch:");
		//String[] sandvitch = scan.nextLine().split("bread");
		

		
		

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

