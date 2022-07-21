package com.evoke.iostreams;

//BufferWriter

import java.io.BufferedWriter;
import java.io.FileWriter;

public class TesrBank {

	public static void main(String[] args) {

		try {
			Bank b1 = new Bank("SBI", "Ram", 12345678);
			Bank b2 = new Bank("PNB", "Rakesh", 1234567890);

			FileWriter writer = new FileWriter("D://jav io//Bank.txt");
			BufferedWriter buffer = new BufferedWriter(writer);

			buffer.write(b1.toString());
			buffer.write("\n");
			buffer.write(b2.toString());

			buffer.close();
			writer.close();
			System.out.println("Success");

		} catch (Exception e) 
		{
			System.out.println(e);
		}

	}

}
