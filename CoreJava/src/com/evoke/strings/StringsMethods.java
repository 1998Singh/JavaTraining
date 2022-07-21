package com.evoke.strings;

public class StringsMethods {

	public static void main(String[] args) {
		String name = "Evoke";
		String name2 = "Technologies";
		System.out.println(name);
		System.out.println(name2);
		System.out.println(name.concat(name2));
		System.out.println(name.toLowerCase());
		System.out.println(name2.toUpperCase());
		System.out.println(name2.subSequence(3, 9));
		System.out.println(name.substring(1));
		System.out.println(name.toString());
		
	}

}
