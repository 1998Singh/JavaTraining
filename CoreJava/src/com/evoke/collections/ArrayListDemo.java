package com.evoke.collections;

import java.util.ArrayList;
import java.util.List;

import com.evoke.constructors.Bank;

public class ArrayListDemo {

	public static void main(String[] args) {

		
		List list = new ArrayList(); // Creating an arrayList

		list.add("Sharad"); // adding Elements on arraylist
		list.add(1234);
		list.add(124.45);
		list.add('c');
		list.add(new Double(12563.655));

		Bank b1 = new Bank("SBI", "Rajesh", 1234567, 1276549.678);
		list.add(b1);

		System.out.println("ArrayList Size = " + list.size()); // checking size of arraylist

		System.out.println("Value at index value 5 = " + list.get(4)); 

		System.out.println("--------------------------------------------");

		System.out.println("Element of Arraylist are : ");

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));

		}

	}

}
