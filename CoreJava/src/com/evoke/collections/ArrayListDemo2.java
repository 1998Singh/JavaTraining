package com.evoke.collections;

import java.util.ArrayList;
import java.util.List;

import com.evoke.constructors.Bank;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		List list = new ArrayList();
		
		list.add("Abhishek Saini");
		list.add(12345);
		list.add(123);
		list.add(1234.34);
		list.add(new Double(1234.89));
		list.add('s');

		Bank b1 = new Bank("PNB", "Ram", 1234557, 230000);
		list.add(b1);

		System.out.println("Size Of ArrayList = " + list.size());
		System.out.println("Element Of ArrayList are : ");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("--------------------------------------");

		if (list.contains("Abhishek Saini")) // to check Arraylist Contains the Value
		{
			System.out.println("Yes It cantains in ArrayList");

		} else {
			System.out.println("No It not  cantain in List ArrayList");

		}
		System.out.println("------------------------------------------------");

		if (list.isEmpty()) // to check Arraylist isEmpty or not
		{
			System.out.println("Yes ArrayList  is Empty");
		} else {
			System.out.println("NO Arraylist is not Empty");
		}

		System.out.println("-------------------------------------------");

		list.remove(5); // removing the value at the indexvalue 6.

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
