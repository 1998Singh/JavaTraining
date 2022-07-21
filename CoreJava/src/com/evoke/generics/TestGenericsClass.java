package com.evoke.generics;

public class TestGenericsClass {

	public static void main(String[] args) {
		
		GenericClassDemo<String> gclass = new GenericClassDemo<String>("Sharad Singh");
		
		gclass.show();
		System.out.println(gclass.getobj());
		
		System.out.println();
		
		GenericClassDemo<Integer> gclass1 = new GenericClassDemo<Integer>(100);
		
		gclass1.show();
		System.out.println(gclass1.getobj());
		
		

	}

}
