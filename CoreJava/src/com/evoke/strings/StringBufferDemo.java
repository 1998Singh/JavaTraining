package com.evoke.strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("ramesh");
		StringBuffer sb1 = new StringBuffer("rajan singh");

		System.out.println(sb.capacity()); // capacity of Stringbuffer.
		System.out.println(sb.append("singh")); // concatenates the given argument with this String.
		System.out.println(sb.insert(3, "kumar")); // inserts the given String with this string at the given index value.
		System.out.println(sb.replace(0, 3, "raj")); // to replace string to given index value.
		sb1.reverse();
		System.out.println(sb1); // reverse the string
		sb1.delete(0, 5);
		System.out.println(sb1); // delete the string to given index value.

	}

}