import java.util.Arrays;
import java.util.Scanner;

public class TestClass {
	
	static Scanner scan = new Scanner(System.in);
	static String string = new String();
	static Integer[] ints = {1,3,5,15,6,1,14,512,5,45,214};

	public static void main(String[] args) {
		args[0] = "daw";
		d();

	}
	public static void d() {
		String[][] stinra = new String[4][8];
		System.out.println(stinra[0][0]);
		System.out.println(Arrays.deepToString(stinra));
		System.out.println(stinra[2].length);
	}

}
