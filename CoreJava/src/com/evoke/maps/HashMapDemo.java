package com.evoke.maps;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(100, "Laptop");
		hashmap.put(101, "Mobile");
		hashmap.put(102, "Games");
		hashmap.put(103, "Earphones");

		System.out.println("Size of Hashmap = " + hashmap.size());
		System.out.println("----Using foreach loop---");
		for (Map.Entry m : hashmap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		hashmap.putIfAbsent(104, "Gaming Laptops"); // It inserts the specified value with the specified key in the map
													// only if it is not already specified.
		System.out.println("-----After using putIfAbsent Method ------");
		
		System.out.println("Size of HashMap = " + hashmap.size());
		for (Map.Entry m : hashmap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
