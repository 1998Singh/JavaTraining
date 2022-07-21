package com.evoke.strings;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = in.nextLine();
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev))
			System.out.println(" The given string " + str + " is Palindrome ");
		else
			System.out.println("The given string " + str + " is not a Palindrome ");

	}

}
