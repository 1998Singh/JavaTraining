package com.evoke.strings;

// The method intern() creates an exact copy of string object in the heap memory and store in String Constant pool.

public class internDemo {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str4 = str1.intern();
		System.out.println(str4 == str1);

		// creating object of string

		String str2 = new String("Hello");
		System.out.println(str1 == str2);
		String str3 = str2.intern();
		System.out.println(str1 == str3);
	}

}
