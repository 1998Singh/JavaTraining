package com.evoke.maps;

import java.util.*;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap<Integer, String> tree = new TreeMap<Integer, String>();

		tree.put(101, "Uttar Pradesh");
		tree.put(103, "Madhya Pradesh");
		tree.put(102, "Punjab");
		tree.put(106, "Telangana");
		tree.put(105, "Maharashtra");
		tree.put(104, "Odisha");

		System.out.println("Elements in TreeMap = " + tree);

		System.out.println("\n-----By Using Foreach loop----");
		for (Map.Entry m : tree.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		tree.remove(102); // remove the element at key.
		System.out.println("\nAfter calling remove() method");
		for (Map.Entry m : tree.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}
		// return key-value pairs whose keys are less than key.

		System.out.println("\nHeadmap = " + tree.headMap(104));

		// Returns key-value pairs whose keys are greater than or equal to the specified
		// key .
		System.out.println("Tailmap = " + tree.tailMap(103));

		// Returns key-value pairs exists in between the specified key.
		System.out.println("SubMap = " + tree.subMap(102, 106));
		
		System.out.println("Elements in Descending order = "+tree.descendingMap());

	}

}
