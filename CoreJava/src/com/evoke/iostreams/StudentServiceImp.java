package com.evoke.iostreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class StudentServiceImp implements StudentService {

	@Override
	public void createBufferWriterFile(String path) {

		try {
			Student student = new Student("Abhishek Saini", "Chandigarh University", "Automobile", 140000);
			Student student1 = new Student("Abhit", "Delhi University", "CSE", 90000);

			FileWriter writer = new FileWriter(path);
			BufferedWriter buffer = new BufferedWriter(writer);
			buffer.write(student.toString());
			buffer.write("\n");
			buffer.write(student1.toString());
			buffer.close();
			writer.close();
			System.out.println("Success....");
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}

	}

	@Override
	public void readBufferReaderFile(String path) {
	
		try 
		{
            FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
            int i=0;
			
            while ((i = br.read()) != -1) 
			{
				System.out.print((char) i);
			}
			br.close();
			fr.close();
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}

	}

}
