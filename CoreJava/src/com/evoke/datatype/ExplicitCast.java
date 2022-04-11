package com.evoke.datatype;

public class ExplicitCast {

	public static void main(String[] args) {
		int a = 100;
		byte b = (byte) a;
		System.out.println(b);

		int c = 97;
		char ch = (char) c;
		System.out.println(ch);

		int x = 612;
		byte y = (byte) x;
		char z = (char) y;
		System.out.println(z);
	}

}
