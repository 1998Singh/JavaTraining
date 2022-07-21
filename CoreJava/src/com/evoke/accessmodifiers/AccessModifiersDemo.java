package com.evoke.accessmodifiers;

public class AccessModifiersDemo {
	private int num1 = 20;
	int num2 = 200;
	protected int num3 = 2000;
	public int num4 = 40;

	public static void main(String[] args) {
		AccessModifiersDemo ad = new AccessModifiersDemo();
		System.out.println(ad.num1);
		System.out.println(ad.num2);
		System.out.println(ad.num3);
		System.out.println(ad.num4);

	}

}
