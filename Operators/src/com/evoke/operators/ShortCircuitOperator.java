package com.evoke.operators;

public class ShortCircuitOperator {

	public static void main(String[] args) {
		boolean x = true, y = false,z=true;
		if (x && y) {
			System.out.println("inside if");
		}
		if(x&&z) {
			System.out.println("inside if using &&");
		}
		if (x || y) {
			System.out.println("inside if");
		}

	}

}
