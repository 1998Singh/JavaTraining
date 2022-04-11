package com.evoke.WrapperClass;

public class PrimitiveAndObject {

	public static void main(String[] args) {
		int x = 100;
		Integer y= Integer.valueOf(x); // Primitive to object
		int z = y.intValue(); // object to Primitive
		System.out.println(y);
		System.out.println(z);

		byte a = 122;
		String s=Byte.toString(a);    //Primitive to String
		 byte b= Byte.parseByte(s);   // String to Primitive
		 
		 
		 long l=1000;
		 Long m=Long.valueOf(l);      // Primitive to oobject
		 
		 String n=m.toString();       // object to String
		 
		 Long e=Long.valueOf(n);     // String to object

	}

}
