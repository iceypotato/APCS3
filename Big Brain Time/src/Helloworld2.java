import java.util.Scanner;

//Nicholas Lee
//8/16/2019
//This will print Hello world in the most complicated way possible for APCS 3rd period.

public class Helloworld2 {
	
	static char H = 'H';
	static char e = 'e';
	static char l = 'l';
	static char o = 'o';
	static char w = 'W';
	static char r = 'r';
	static char d = 'd';
	static char excl = '!';

	static Scanner scan = new Scanner(System.in);

	static String test;

	public static void main(String[] args) {
		System.out.println(h()+e()+l()+l()+o()+" "+w()+o()+r()+l()+d()+excl);
		scan.nextLine();
		System.out.println("/o/");
		int a = 15; int b = 12;
		a = a-b;
		b = a+b;
		a = a-b;
		b=a;
		System.out.println(a + " " + b);
	}
	
	static String h() {
		String h = H+"";
		return h;
	}
	
	static String e() {
		String ee = e+"";
		return ee;
	}
	
	static String l() {
		String ll = l+"";
		return ll;
	}
	static String o() {
		String oo = o+"";
		return oo;
	}
	static String w() {
		String ww = w+"";
		return ww;
	}
	static String r() {
		String rr = r+"";
		return rr;
	}
	static String d() {
		String dd = d+"";
		return dd;
	}
}
