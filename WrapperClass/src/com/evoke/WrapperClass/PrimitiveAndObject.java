package com.evoke.WrapperClass;

public class PrimitiveAndObject {

	public static void main(String[] args) {
		int x = 100;
		Integer y = Integer.valueOf(x); // Primitive to object  [Autoboxing]
		int z = y.intValue(); // object to Primitive       [Unboxing]
		System.out.println(y);
		System.out.println(z);

		long l = 1000;
		Long m = Long.valueOf(l); // Primitive to object
		long n = m.longValue(); // Object to Primitive
		System.out.println(m);
		System.out.println(n);

	}

}
