package stringdemo1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input");
		String str=sc.nextLine();
		int length=str.length();
		char temp=str.charAt(0);
		String output=length+""+temp;
		System.out.println(output);
	}

}
