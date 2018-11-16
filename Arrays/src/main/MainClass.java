package main;

import java.util.Scanner;

import dao.DaoClass;

public class MainClass {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int size=4;
		//int[] arr=new int[size];
		int[] arr={1,2,3,4,5};
		DaoClass dao=new DaoClass();
		
		
		while(true){
			System.out.println("enter choice 1 to insert 2 to display 0 to exit"
					+ "enter 3 to find a element");
			int choice=Integer.parseInt(sc.nextLine());
			
			switch(choice)
			{
			case 1:dao.insertData(arr);
				break;
			case 2:dao.displayData(arr);
				break;
			case 3:
				System.out.println("enter element to be searched");
				int element=Integer.parseInt(sc.nextLine());
				dao.searchElement(arr, element);
				break;
				
			default:System.out.println("wrong choice");
				break;	
			case 0:System.exit(0);
				
			}
		}
		

	}

}
