package java8.prowings.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//	Write a Java program to create a new array list, add some colors (string) and print out the collection.

public class ArrayList1 {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Pink");
		list.add("Black");
		list.add("purple");
		
		System.out.println(list);
		
//	Write a Java program to iterate through all elements in a array list.
	
		Iterator<String> Itr = list.iterator();
		
		System.out.println();
		while(Itr.hasNext()) {
			String s = Itr.next();
			System.out.println(s);
		}
		
		System.out.println();
		for(String s : list) {
			System.out.println(s);
		}
		
		ListIterator<String> litr = list.listIterator();
		
		System.out.println();
		while (litr.hasNext()) {
			String s = litr.next();
			System.out.println(s);
		}
				
		System.out.println();
		while(litr.hasPrevious()) {
			String s = litr.previous();
			System.out.println(s);
		}
		
//	Write a Java program to insert an element into the array list at the first position.
		
		list.add(0, "lovendor");
		
		System.out.println("\n"+list);
		
//	Write a Java program to retrieve an element (at a specified index) from a given array list.
		
		System.out.println(list.get(3));
	}
}
