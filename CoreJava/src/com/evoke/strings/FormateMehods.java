package com.evoke.strings;

public class FormateMehods {

	public static void main(String[] args) {
		String name = "Evoke";
		String s1 = String.format(" %s ", name); // String Value
		String s2 = String.format("%d", 101); // integer value
		String s3 = String.format("%.2f", 154.8976); // float value
		String s4 = String.format("%c", 'o'); // char value

		System.out.println(name);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

	}

}
