package com.evoke.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList3 {

	public static void main(String[] args) {

		List<String> planguage = new ArrayList<String>();    // Creating ArrayList

		planguage.add("Java");      // adding the elements in arrayList 
		planguage.add("Python");
		planguage.add("Spring");
		planguage.add("c++");
		planguage.add("c++");

		System.out.println("Size of ArrayList is = " + planguage.size());    // print the size of arrayList
		System.out.println("Elements of arrayList is = " + planguage);

		System.out.println("\n-----------using For each loop--------");

		for (String s : planguage)
		{
			System.out.println(s);
		}

		System.out.println("-----------Using Iterator--------");

		Iterator<String> obj = planguage.iterator();
		
		while (obj.hasNext())
		{
			System.out.println(obj.next());
		}
		
		planguage.add(3, "Sql");        
		System.out.println(planguage);
		

	}

}
