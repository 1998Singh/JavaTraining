package com.evoke.iostreams;

import java.io.FileReader;

public class FileReaderDemo1 {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("D://jav io//car.txt");
		int i=0;
		while ((i = fr.read()) != -1) {
			System.out.print((char) i);
		}
		fr.close();

	}

}
