package com.evoke.packages;

//Importing  and Using in-build classes
import java.util.Scanner;

public class SumOfTwoNo {

	public static void main(String[] args) {
		System.out.println("Enter two Integer");
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int result = num1 + num2;
		System.out.println("Sum Of Two Integer Is = " + result);

	}

}
