package com.evoke.accessmodifiers2;

import com.evoke.accessmodifiers.AccessModifiersDemo;

public class Modifiers2 {

	public static void main(String[] args) {

		AccessModifiersDemo ad = new AccessModifiersDemo();
		// System.out.println(ad.num1); // private
		//// System.out.println(ad.num2); // default
		// System.out.println(ad.num3); // protected
		System.out.println(ad.num4); // public

	}

}
