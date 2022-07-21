package com.evoke.arrays;

public class TwoDimArray {

	public static void main(String[] args) {
		int[][] array = { { 10, 12, 18 }, { 18, 17, 36 }, { 13, 21, 78 } };
		// int[][] array= new int[3][3];     

		System.out.println("Element of the array");

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[0].length; j++) {

				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
