package demo1;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int number=Integer.parseInt(sc.nextLine());
		int temp=1;
		for (int i = number-1; i >0; i--) {
			System.out.println(i);
			temp=temp+temp*i;
			System.out.println(temp);
		}
		System.out.println(temp);

	}

}
