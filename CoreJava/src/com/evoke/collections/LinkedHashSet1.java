package com.evoke.collections;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {

		LinkedHashSet<Students> l1 = new LinkedHashSet<Students>();

		// Creating object for Students
		Students s1 = new Students("Pavan", 1, "Non-Medical");
		Students s2 = new Students("Abhishek", 2, "Medical");
		Students s3 = new Students("Ashish", 3, "Commerce");

		// Adding Students to hash table
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);

		for (Students s : l1) {
	      
			System.out.println(s);

		}

	}

}
