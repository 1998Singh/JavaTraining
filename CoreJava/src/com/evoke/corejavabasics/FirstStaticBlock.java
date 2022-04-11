package com.evoke.corejavabasics;

public class FirstStaticBlock {
	public static void main(String[] args)
	{
		System.out.println("main block");
		
	}
	static {
		System.out.println("Static Block 1");
	}
	static {
		System.out.println("Static Block 2");
	}

}
