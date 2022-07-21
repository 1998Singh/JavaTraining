package com.evoke.arrays;

public class SumOf2D {

	public static void main(String[] args) {
		int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 6, 7, 8 } };
		int[][] array2 = { { 10, 20, 30 }, { 40, 50, 60 }, { 60, 70, 80 } };
		int[][] Sum = new int[array1.length][array2[0].length];
		System.out.println("Sum of 2D is ");
		for (int i = 0; i < Sum.length; i++) {
			for (int j = 0; j < Sum[i].length; j++) {
				Sum[i][j] = array1[i][j] + array2[i][j];
				System.out.print(Sum[i][j] + " ");
			}
			 System.out.println();
		}

	}

}
