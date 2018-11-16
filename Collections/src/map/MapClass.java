package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class MapClass {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String[] demoString={"rohit","chetan","mohit","vipin","abhi"};
		HashMap<Integer, String> hashMap=new HashMap<>();
		LinkedHashMap<Integer, String> linkedHashMap=new LinkedHashMap<>();
		TreeMap<Integer, String> treeMap=new TreeMap<>();
	/*	int i=0;
		for (String string : demoString) {
			hashMap.put(i, string);
			
			linkedHashMap.put(i, string);
			
			treeMap.put(i, string);
			i++;
		}*/
		
		hashMap.put(1, "value");
		hashMap.put(0, "value1");
		hashMap.put(4, "value2");
		hashMap.put(2, "value3");
		linkedHashMap.put(1, "value");
		linkedHashMap.put(0, "value1");
		linkedHashMap.put(4, "value2");
		linkedHashMap.put(2, "value3");	
		treeMap.put(1, "value");
		treeMap.put(0, "value1");
		treeMap.put(4, "value2");
		treeMap.put(2, "value3");
		
		System.out.println("-----------");
		for (Integer key : hashMap.keySet()) {
			System.out.println(key+" " +hashMap.get(key));
		} 
		System.out.println("-----------");
		for (Integer key : linkedHashMap.keySet()) {
			System.out.println(key+" " +linkedHashMap.get(key));
		} 
		
		System.out.println("-----------");
		for (Integer key : treeMap.keySet()) {
			System.out.println(key+" " +treeMap.get(key));
		} 
		
	}

}
