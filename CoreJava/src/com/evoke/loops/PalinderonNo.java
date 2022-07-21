package com.evoke.loops;

import java.util.Scanner;                       // input=1221 , output=1221

public class PalinderonNo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = in.nextInt();
		int rev = 0;
		int temp = num;
		System.out.println(" reverse no is : ");
		while (num != 0) {
			int rem = num % 10;    // 1,2,2,1
			rev = rev * 10 + rem;         // 0*10+1=1, 1*10+2=12, 12*10+2=122, 122*10+1=1221
			num = num / 10;   // 122,12,1
		}
		System.out.println(rev);
		if (rev == temp)
			System.out.println("Palinderon no");
		else
			System.out.println("No a Palinderon no ");

	}

}
