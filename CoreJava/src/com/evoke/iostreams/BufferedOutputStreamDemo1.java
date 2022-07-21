package com.evoke.iostreams;

//It  uses buffer to store data.
//It adds more efficiency than to write data directly into a stream.  
// So it makes the performance fast.

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamDemo1 {

	public static void main(String[] args) throws Exception {

		FileOutputStream fout = new FileOutputStream("D://jav io//bufferstream.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);

		String s = "Welcome to BufferedOutputStream .";
		byte b[] = s.getBytes();

		bout.write(b);
		bout.flush(); // It flushes the buffered output stream.

		bout.close();
		fout.close();
		System.out.println("success");

	}

}
