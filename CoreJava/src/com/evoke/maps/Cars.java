package com.evoke.maps;

import java.util.*;

public class Cars {

	public static void main(String[] args) {

		HashMap hash = new HashMap();
		hash.put(1, "Jaguar");
		hash.put(2, "Range Rover");
		hash.put(3, "Audi");
		hash.put(4, "BMW");
		hash.put(5, "Land Rover");
		hash.put(6, "Mercedes-Benz");

		System.out.println("Elements in HashMap = " + hash);
		System.out.println(hash.put(3, "Porsche")); // Duplicate key.

		// it is used to prints keys in HashMap
		Set s1 = hash.keySet();
		System.out.println("Keys in hashmap are = " + s1);

		// it is used to prints values in HashMap
		Collection c1 = hash.values();
		System.out.println("Values in HashMap are = " + c1);

		// return entry in HashMap
		Set s2 = hash.entrySet();
		System.out.println("Entry are in hashmap = " + s2);

		System.out.println("---Printing Values Using Iterator------");
	
		Iterator itr = s2.iterator();
		
		while (itr.hasNext())
		{

			Map.Entry m1 = (Map.Entry) itr.next();
           System.out.println(m1.getKey() + " " + m1.getValue());
		}

	
		if (hash.containsKey(10)) //to check the key contains in hashmap.
		{
			System.out.println("Yes it contain the key");
		} else {

			System.out.println("No it contain the key");

		}

	}

}
