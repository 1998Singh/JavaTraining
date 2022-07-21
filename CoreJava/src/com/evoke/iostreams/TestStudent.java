package com.evoke.iostreams;

//Buffered reader & writer

public class TestStudent {

	public static void main(String[] args) {
	
		String path ="D://jav io/Student.txt";
		StudentServiceImp studentService = new StudentServiceImp();
		
		studentService.createBufferWriterFile(path);
		 
		System.out.println("\n reading the file Contents Using BufferedReader ");
	
     	studentService.readBufferReaderFile(path);

	}

}
