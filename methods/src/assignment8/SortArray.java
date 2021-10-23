package assignment8;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SortArray {

	public static void main(String[] args) {
		//Collections in java is a framework that provides an architecture  
		//to store and manipulate the group of objects
		//TreeSet is one of set collection used to remove duplicate and 
		//sort alpha numerically
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(600);
		numbers.add(200);
		numbers.add(500);
		numbers.add(400);
		numbers.add(300);
		numbers.add(100);
		numbers.add(100);
		System.out.println(numbers);
		for(Integer x:numbers) {
			System.out.println(x);
		}

		Set<Integer> numbers1 = new TreeSet<Integer>();
		numbers1.add(600);
		numbers1.add(200);
		numbers1.add(500);
		numbers1.add(400);
		numbers1.add(300);
		numbers1.add(100);
		numbers1.add(100);
		System.out.println(numbers1);
		for(Integer x:numbers1) {
			System.out.println(x);
		}

	}

}
