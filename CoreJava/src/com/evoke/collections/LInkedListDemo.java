package com.evoke.collections;

import java.util.LinkedList;
import java.util.List;

public class LInkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> cars = new LinkedList<String>();   // creating LinkedList

		cars.add("Jaguar");       // Adding elements in LinkedList
		cars.add("Range Rover");
		cars.add("BMW");
		cars.add("Audi");
		cars.add("Tata");
		
		System.out.println("Size of LinkedList is = " + cars.size());    // Printing size of LinkedList
		System.out.println("Elements of LinkedList is = " + cars);
		System.out.println("First Element is = "+cars.getFirst());
		cars.addFirst("Land Rover");
		

		System.out.println("\n---------Using for each loop--------");
		
		for (String s1 : cars) 
		{
			System.out.println(s1);
		}
		System.out.println("\n--------Using Add methods------- ");
		
		cars.add(2, "Mahindra & Mahindra");      // add the value in particular index value.
		System.out.println(cars);

		System.out.println("\n--------- Cantains Methods ------------");

		if (cars.contains("Range ")) {
			System.out.println("yes it Cantains");
		} else {
			System.out.println("No it not Cantains");

		}
			
	}

}
