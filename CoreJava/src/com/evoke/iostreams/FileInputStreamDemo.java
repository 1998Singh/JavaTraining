package com.evoke.iostreams;
// It able to carry data from a particular Source file to java application.
import java.io.*;

public class FileInputStreamDemo {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("D://jav io//input.txt");
		int size = fis.available();  //It is used to return the estimated number of bytes that can be read from the input stream.
		byte[] b = new byte[size];
		fis.read(b);
		String s1 = new String(b);
		System.out.println(s1);
		fis.close();

	}

}
