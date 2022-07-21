package com.evoke.iostreams;

import java.io.File;
import java.io.FileWriter;

public class TestCar {

	public static void main(String[] args) {

		try {
			Cars c1 = new Cars("Jaguar F-Phase", "SUR", 286);
			Cars c2 = new Cars("BMW", "SUV", 300);
			
			File file = new File("D://jav io//car.txt");
			
			FileWriter fw = new FileWriter(file);
			
			fw.write(c1.toString());
			fw.write('\n');
			fw.write(c2.toString());
			
			fw.close();
			System.out.println(" Sucessful.........");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
