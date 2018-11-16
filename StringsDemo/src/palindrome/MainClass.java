package palindrome;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string");
		String input=sc.nextLine();
		String reverse="";
		int length=input.length();
		System.out.println(length);
		for (int i = length-1; i >=0; i--) {
			reverse=reverse+input.charAt(i);
		}
		System.out.println(reverse);
		if(input.equalsIgnoreCase(reverse))
		{
			System.out.println("yes");
		}
		else
			System.out.println("no");
		

	}

}
