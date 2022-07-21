package com.evoke.iostreams;

import java.io.*;

public class FileWriterDemo {

	public static void main(String[] args) throws Exception {

		FileWriter fw = new FileWriter("D://jav io//filewrite.txt");
		String data = "Welcome To FileWriter In Java";
		char[] ch = data.toCharArray();
		fw.write(ch);
		fw.close();
		System.out.println("success...");

	}

}
