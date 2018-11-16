package demo3;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter number");
		int number = Integer.parseInt(sc.nextLine());
		int temp, count = 0;
		for (int i = 2; i < number; i++) {

			temp = number % i;
			if (temp == 0) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println("not prime");
		} else
			System.out.println("prime");
	}

}
