package com.evoke.strings;

public class EqualAndCamp {

	public static void main(String[] args) {
		String s1 = "deepak";
		String s2 = "deepak";
		String s3 = new String("Deepak");
		String s4 = "a";  //65
		String s5 = "A";  //97
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s4.compareTo(s5));
	}

}
