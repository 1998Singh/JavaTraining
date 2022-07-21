package com.evoke.arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 }; // integer type of array
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		// System.out.println(arr[5]);

		String[] strarray = { "Welcome", "To", "Java" }; // string type of array
		System.out.print(strarray[0]);
		System.out.print("\t" + strarray[1]);
		System.out.print("\t" + strarray[2]);

		System.out.println("\nSecond way to write an array");
	//	int [] arr1= new int[size];
		
		int[] arr1 = new int[3];            
		arr1[0] = 20;
		arr1[1] = 29;
		arr1[2] = 26;
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);

	}

}
