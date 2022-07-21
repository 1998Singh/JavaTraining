package com.evoke.strings;

public class StringsMethods2 {

	public static void main(String[] args) {
		String s1 = new String("java is best Programing Language is");
		String s2 = "evoke technologies";
		System.out.println(s1);
		System.out.println(s1.replace("is", "is always"));
		System.out.println(s1.replaceAll("is", "was"));
		System.out.println(s2.indexOf("no"));
		System.out.println(s2.indexOf("ol"));
		System.out.println(s2.lastIndexOf("t"));
		System.out.println(s2.charAt(6));

	}

}
