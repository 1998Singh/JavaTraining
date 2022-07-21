package com.evoke.strings;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = new String("Evoke");  
		String s2 = "Technologies"; 
		String name = "  Rahul Singh ";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.length());      // to count length of string
		System.out.println(s2.isEmpty());    //Boolean  values
		System.out.println(name);
		System.out.println(name.trim());    // remove the space
	}

}
