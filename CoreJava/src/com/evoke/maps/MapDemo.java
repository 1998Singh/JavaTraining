package com.evoke.maps;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {

		Map map = new HashMap();

		// Adding element to map

		map.put(1, "Rojapavan");
		map.put(2, "Abhit");
		map.put(3, "Abhishek");
		map.put(4, "Daksh");
		map.put(5, "Rishabh");
		map.put(6, "Rishabh"); // Duplicate Value.

		System.out.println("Size of Map = " + map.size());

		Set set = map.entrySet(); // Converting Map to Set

		Iterator itr = set.iterator();

		while (itr.hasNext())
		{
			Map.Entry entry = (Map.Entry) itr.next(); // converting map.entry so that we can get key and value
														// separately.
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
