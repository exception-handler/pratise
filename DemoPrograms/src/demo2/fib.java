package demo2;

import java.util.Scanner;

public class fib {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the limit");
		int limit=Integer.parseInt(sc.nextLine());
		int first=1;
		int second=1;
		int result;
		
		for (int i = first; i <=limit; i++) {
			
			System.out.println(first);
			result=first+second;
			first=second;
			second=result;
		}
		
	}

}
