package com.evoke.loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the integer");
		int num = in.nextInt();
		int fact = 1;
		while (num > 1) {
			fact = fact * num;
			num--;
		}
		System.out.println("Fact valu = " + fact);
	}

}
  
// 5!=5*4*3*2*1= 120.