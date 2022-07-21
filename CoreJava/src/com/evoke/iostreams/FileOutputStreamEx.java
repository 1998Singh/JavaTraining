package com.evoke.iostreams;

import java.io.*;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fout = new FileOutputStream("D:\\jav io\\abc.txt");
			String s1 = "Welcome To Java IO Streams";
			byte[] b = s1.getBytes(); //converting string into byte array 
			fout.write(b);
			fout.close();
			System.out.println("success...");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
