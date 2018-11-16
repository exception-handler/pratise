package demo4;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int temp,number,reverse=0,remainder;
		System.out.println("enter number");
		number=Integer.parseInt(sc.nextLine());
		temp=number;
		do{
			remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
			
		}while(number>0);
		System.out.println("the reverse of "+temp +" is "+reverse);

	}

}
