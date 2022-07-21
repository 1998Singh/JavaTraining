package com.evoke.collections;

// Underline data structure for TreeSet is Balanced Tree.
// Duplicated and Heterogeneous object r not allowed.
// Objects Insert to Some sorting order.

import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet tree = new TreeSet(); 

		tree.add("Abhishek"); // adding the object inside TreeSet.
		tree.add("Abhit");
		tree.add("Hritick");
		tree.add("Rishabh");
		tree.add("Pavan");
		tree.add("pranjal");

		// tree.add(null); // null Pointer Exception.
		// System.out.println(tree.add(10)); // class cast exceptions
		System.out.println(tree);

		System.out.println("\n---------Printing Elements Using Iterator-------");
		
		Iterator itr = tree.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
