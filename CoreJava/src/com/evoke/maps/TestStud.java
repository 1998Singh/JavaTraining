package com.evoke.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestStud {

	public static void main(String[] args) {

		TreeMap<Student, Integer> map = new TreeMap<Student, Integer>(new AccordingMarks());

		// Add elements to TreeMap
		map.put(new Student("Akash", 400), 1);
		map.put(new Student("Ajay", 500), 2);
		map.put(new Student("Abhit", 300), 3);

		System.out.println("TreeMap keys sorting in ascending order of the marks:");

		// Print map using Entry
		for (Map.Entry<Student, Integer> entry : map.entrySet()) {
			System.out.println("Key : (" + entry.getKey() + "), Value : " + entry.getValue());

		}
	}

}
