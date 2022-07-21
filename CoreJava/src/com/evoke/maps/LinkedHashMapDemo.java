package com.evoke.maps;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

	Map hm = new LinkedHashMap();

		hm.put(101, "Rohan");
		hm.put(102, "Ram");
		hm.put(103, "Rohit");
		hm.put(104, "Rishabh");
		hm.put(105, "Pavan");

		System.out.println("Size of Linkedhashmap = " + hm.size());
		System.out.println("Elements oin Linkedhashmap = " + hm);

		System.out.println("\n-----keys in Linkedhashmap------ ");
		Set s1 = hm.keySet();
		System.out.println("keys are= " + s1);

		System.out.println("\n-----values in Linkedhashmap------ ");
		Collection c1 = hm.values();
		System.out.println("\nValues are = " + c1);

		Set s2 = hm.entrySet();
		System.out.println("\nEntry are in hashmap = " + s2);

		System.out.println("\n---Printing Values Using Iterator------");

		Iterator itr = s2.iterator();

		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey() + " " + m1.getValue());
		}
		
		System.out.println("----Using Remove Method--------");
		hm.remove(103, "Rohit");
		System.out.println("Elements after Removing"+hm);

	}

}
