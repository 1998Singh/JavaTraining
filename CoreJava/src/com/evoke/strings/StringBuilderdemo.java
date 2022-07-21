package com.evoke.strings;

public class StringBuilderdemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("core java");
		StringBuilder sb1 = new StringBuilder("core java");
		
		System.out.println(sb.capacity()); // capacity of Stringbuilder.
		System.out.println(sb.append("topics")); // concatenates the given argument with this String.
		System.out.println(sb.insert(3, "class")); // inserts the given String with this string at the given index
													// value.
		System.out.println(sb.replace(1, 4, "method33")); // to replace string to given index value.
		sb1.reverse();
		System.out.println(sb1); // reverse the string
		sb1.delete(0, 5);
		System.out.println(sb1); // delete the string to given index value.

	}

}
