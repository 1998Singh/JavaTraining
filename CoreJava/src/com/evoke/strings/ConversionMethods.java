package com.evoke.strings;

public class ConversionMethods {

	public static void main(String[] args) {
		String name = "Rahul Singh";

		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		//-------------------------
		int a=97, b=30;
		System.out.println(a+b);
		String s1=String.valueOf(a);
		String s2=String.valueOf(b);
		System.out.println(s1);
		System.out.println(s1+s2);
		char[] c=name.toCharArray();     //Converts the string to a new character array.
		System.out.println(c);
		

	}

}
