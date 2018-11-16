package Set;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetMainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Set<Department> set=new HashSet<>(); Department dept1=new
		 * Department(101, "HR"); Department dept2=new Department(102,
		 * "Finance"); set.add(dept1); set.add(dept2);
		 * 
		 * for (Department department : set) { System.out.println(department); }
		 */

		String[] demoString = { "India", "Bangladesh", "USA", "Dubai" };

		HashSet<String> hashSet = new HashSet<>();
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		TreeSet<String> treeSet = new TreeSet<>();

		for (String string : demoString) {
			hashSet.add(string);
			linkedHashSet.add(string);
			treeSet.add(string);
		}
		System.out.println("===TREE--sortedorder===");
		for (String string : treeSet) {
			System.out.println(string);
		}
		
		System.out.println("===HASHSET--random===");
		for (String string : hashSet) {
			System.out.println(string);
		}
		
		System.out.println("===LinkedHAshSet--insertion order===");
		for (String string : linkedHashSet) {
			System.out.println(string);
		}
	}
}
