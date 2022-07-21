package com.evoke.maps;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hash = new HashMap<Integer, String>();

		Integer int1 = new Integer(10);
		Integer int2 = new Integer(10);
		hash.put(int1, "Rajesh");
		hash.put(int2, "Ram"); 
		System.out.println("entry= " + hash); // {10=Ram}

		System.out.println("\n----By Using Identity HashMap------");

		IdentityHashMap<Integer, String> hash1 = new IdentityHashMap<Integer, String>();

		Integer int3 = new Integer(10);
		Integer int4 = new Integer(10);
		hash1.put(int3, "Rajesh");
		hash1.put(int4, "Ram"); // 
		System.out.println("\nentry= " + hash1); // {10=Ram,10=Rajesh}

	}

}
