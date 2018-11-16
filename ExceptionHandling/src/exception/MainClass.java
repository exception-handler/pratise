package exception;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		BeanClass bean=new BeanClass();
		bean.setId(101);
		bean.setName("rohit");

		System.out.println(bean);
	}

}
