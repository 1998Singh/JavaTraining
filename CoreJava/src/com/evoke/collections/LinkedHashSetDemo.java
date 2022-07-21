package com.evoke.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet h1 = new LinkedHashSet();
		h1.add("Jaguar");
		h1.add("Pavan");
		h1.add("Audi");
		h1.add(1234);
		h1.add(125.34);
		h1.add('S');

		System.out.println(h1.add("Jaguar"));  // false
		System.out.println("Size of LinkedHashSet = " + h1.size());  // print size of linkedhashset
		System.out.println(h1);  // elements on linkedhashset

		System.out.println(" ------using Iterator----------");
		Iterator itr = h1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Removing an element from the above linked Set.
		 
		h1.remove("Audi");
		System.out.println("Elements After Removing = " + h1);

		// Using of Contains methods
	
		System.out.println("-------------------");
		 
		if (h1.contains("Jaguar")) {
			System.out.println(" yes it Contains");
		} else {
			System.out.println("No it not Contains");
		}

	}

}
