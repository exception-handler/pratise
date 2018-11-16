package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListMainClass {

	Scanner sc = new Scanner(System.in);
	LinkedList<String> ll = new LinkedList<>();

	public static void main(String[] args) {
		LinkedListMainClass obj = new LinkedListMainClass();
		while (true) {
			System.out.println("enter choice");
			int choice = Integer.parseInt(obj.sc.nextLine());
			switch (choice) {
			case 1:obj.insert();
				break;
			case 2:obj.show();
				break;
			case 3:obj.remove();
				break;
			default:
				System.out.println("wrong choice");
				break;
			case 0:
				System.exit(0);
			}
		}

	}
	
	public void insert()
	{
		ll.add("rohit");
		ll.add("chetan");
		ll.add("mohit");
	}
	
	public void show()
	{
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		for (String string : ll) {
			System.out.println(string);
		}
	}
	
	public void removeFirst()
	{
		ll.removeFirst();
		
	}
	public void removeLast()
	{
		ll.removeLast();
	}
	public void remove()
	{
		ll.remove(2);
	}
}
