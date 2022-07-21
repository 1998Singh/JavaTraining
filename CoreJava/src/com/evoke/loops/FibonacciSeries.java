package com.evoke.loops;
         // 0 1 1 2 3 5 8 13........
import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no ");
		int num = in.nextInt();
		int t1 = 0, t2 = 1;
		int count = 1;
		System.out.print(t1 + " " + t2 + " ");

		while (count <= num - 2) {
			int t3 = t1 + t2;
			System.out.print(t3 + " ");
			t1 = t2;
			t2 = t3;
			count++;
		}
	}

}


//t1         t2               t3               count
//0           1                1                 1
//1           1                2                  2
//1            2                3                 3
