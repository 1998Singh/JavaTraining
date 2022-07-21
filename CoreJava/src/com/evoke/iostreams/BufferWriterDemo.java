package com.evoke.iostreams;

//Java BufferedWriter class is used to provide buffering for Writer instances. 
//It makes the performance fast. 

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriterDemo {

	public static void main(String[] args) {
		
		try {
			 FileWriter writer = new FileWriter("D://jav io//Bufferwriter.txt");  
			 BufferedWriter buffer = new BufferedWriter(writer);  
		    
			 buffer.write("Welcome to BufferWriter.");  
			 buffer.close();
			 writer.close();
			 System.out.println("Success"); 
			
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
