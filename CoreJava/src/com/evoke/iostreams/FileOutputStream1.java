package com.evoke.iostreams;

import java.io.*;

public class FileOutputStream1 {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("D:\\jav io\\test.txt");
			fout.write(65); //ASCII Values = A
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
