package com.evoke.iostreams;
import java.io.*;
public class FileContent {

	public static void main(String[] args) throws Exception
	{
		String fileName=args[0];
		FileInputStream fis=new FileInputStream(fileName);
		int size=fis.available();
		byte []b= new byte[size];
		fis.read(b);
		//String[ ]s1=new String[b];
		String s1=b.toString();
		System.out.println(s1);
		

	}

}
