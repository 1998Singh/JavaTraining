package com.evoke.maps;

import java.util.*;

public class TreeMap1 {

	public static void main(String[] args) {
		
		TreeMap tree = new TreeMap();

		tree.put("PCM", 101);
		tree.put("PCB", 102);
		tree.put("Commerce", 103);
		tree.put("Arts", 104);
		tree.put("PCMB", 105);

		System.out.println(tree);

	}

}

class MyComparator implements Comparator {

	public int compare(Object obj1, Object obj2) {
		
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}

}
