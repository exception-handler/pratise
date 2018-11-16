package Strings;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String reverse = "";
		String original = "rohit";

		int length = original.length();

		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		System.out.println(original);
		System.out.println(reverse);

		System.out.println("-----------");

		for (int i = 0; i < original.length(); i++) {
			System.out.println(original.charAt(i));
		}

		System.out.println("------------");

		String demo1 = "hello";
		String demo2 = "hello";
		if (demo1 == demo2) {
			System.out.println(demo1);
		}
		if (demo1.equals(demo2)) {
			System.out.println(demo2);
		} else {
			System.out.println("false");
		}
		System.out.println("---------");
		String demo3 = new String();
		demo3 = "rohit";

		String demo4 = new String();
		demo4 = "rohit";

		if (demo3 == demo4) {
			System.out.println("inside demo3==demo4");
		}
		if (demo3.equals(demo4)) {
			System.out.println("inside demo3.equals(demo4)");
		} else {
			System.out.println("false");
		}

	}

}
