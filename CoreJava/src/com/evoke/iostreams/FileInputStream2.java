package com.evoke.iostreams;
import java.io.*;
public class FileInputStream2 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("D://jav io//Welcome.txt");
		int i=fis.read();
		System.out.println((char)i);
		fis.close();

	}

}
