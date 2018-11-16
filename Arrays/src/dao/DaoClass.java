package dao;

import java.util.Scanner;

public class DaoClass implements DaoInterface{

	Scanner sc=new Scanner(System.in);
	@Override
	public void insertData(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=Integer.parseInt(sc.nextLine());
		}
		
	}
	@Override
	public void displayData(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}	
		
	}
	@Override
	public void searchElement(int[] arr,int element) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]==element)
			{
				System.out.println("element found at index "+i);
				count++;
				break;
			}
		
		}
		if(count==0)
		{
			System.out.println("element not found");
		}
		
	}
	@Override
	public void deleteElement(int[] arr, int element) {
		
		int temp=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==element)
			{
				temp=i;
				break;
			}
			
		}
		
	}

}
