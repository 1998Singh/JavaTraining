package com.evoke.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericDemo {

	public static void main(String[] args) {

		List list = new ArrayList();    // it is not Type Safe

		list.add("Sharad");
		list.add(123);
		list.add(124.65);
		list.add(new Integer(10));

		String string = (String) list.get(0); // TypeCasting
		System.out.println(string);

		Integer i = (Integer) list.get(1); // Typecasting
		System.out.println(i);

	
		System.out.println("--------ArrayList By Using Generics---------");

		List<String> list1 = new ArrayList<String>();

		list1.add("Sharad");
		list1.add("Abhishek");
		list1.add("Pavan");
		// list1.add(10); // compile time error

		String string1 = list1.get(0); // TypeCasting Not required
		System.out.println(string1);

		System.out.println("----printing Elements Using Iterator------");
		
		Iterator<String> itr = list1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
