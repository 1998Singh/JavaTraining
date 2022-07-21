package com.evoke.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();

		set.add("Ravi");
		set.add("Vijay");
		set.add("Arun");
		set.add("Sumit");

		System.out.println(" Elements on hashset : " + set);
		System.out.println(" Size of hashset = " + set.size());

		// Removing specific element from HashSet
		set.remove("Ravi");
		System.out.println("After invoking remove method: " + set);

		// Creating New Hashset

		HashSet<String> set1 = new HashSet<String>();
		set1.add("Ajay");
		set1.add("Gaurav");
		set.addAll(set1);
		System.out.println(" new Hashset : " + set);

		System.out.println("\n------Using Iterator------");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
