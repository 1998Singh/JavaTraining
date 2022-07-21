package com.evoke.collections;

import java.util.*;

public class TreeSetDemo2 {
	
	public static void main(String[] args) {

		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(24);
		set.add(66);
		set.add(12);
		set.add(15);

		System.out.println("Elements in TreeSet are = " + set);
		System.out.println("First Value : " + set.first()); // print fast element
		System.out.println("Last Value: " + set.last()); // print fast element

		System.out.println("\n---------Printing Elements Using Iterator-------");
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("\n---------Printing Elements Using Iterator in Decendingorder-------");
		Iterator itr1 = set.descendingIterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}

}
