package p1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrrayListImpl {
	Scanner sc=new Scanner(System.in);
	ArrayList<Integer> arrayList=new ArrayList<>();
	public static void main(String[] args) {
		
		ArrrayListImpl obj=new ArrrayListImpl();
		
		
		while(true){
			System.out.println("enter choice 1 to insert 2 to display 0 to exit"
					+ "enter 3 to find a element");
			int choice=Integer.parseInt(obj.sc.nextLine());
			
			switch(choice)
			{
			case 1:obj.addData();
				break;
			case 2:obj.displayData();
				break;
			case 3:System.out.println("enter data to be removed");
			int data=Integer.parseInt(obj.sc.nextLine());
			obj.removeData(data);
				break;
				
			default:System.out.println("wrong choice");
				break;	
			case 0:System.exit(0);
				
			}
		}
		
	}
	public void addData()
	{
		System.out.println("enter 1st element");
		arrayList.add(Integer.parseInt(sc.nextLine()));
		System.out.println("enter 2nd element");
		arrayList.add(Integer.parseInt(sc.nextLine()));
	}
	public void displayData()
	{
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}
	}
	public void removeData(int data)
	{
		for (Integer integer : arrayList) {
			if(integer==data)
			{
				arrayList.remove(integer);
			}
		}
	}
}
