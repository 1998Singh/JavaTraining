package com.evoke.iostreams;

import java.awt.List;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class GamesServiceImp implements GamesService {

	@Override
	public void createFile(String path) {
		try {
			String data = getDetails();
			File file = new File(path);
			FileWriter filewriter = new FileWriter(file);
			filewriter.write(data.toString());
			filewriter.close();
			System.out.println("......Successfully File Created .......");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Override
	public void readingFile(String path) {

		try {
			File file = new File(path);
			FileReader filereader = new FileReader(file);
			char ch[] = new char[(int) file.length()];
			filereader.read(ch);
			for (char ch1 : ch) {
				System.out.print(ch1);
			}

			filereader.close();
			System.out.println("......Success.......");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Override
	public void deleteFile(String path) {

		File file = new File(path);
		if (file.exists()) {
			file.delete();
			System.out.println(path);
		} else {
			System.out.println("File not exists");
		}

	}

	public String getDetails() {

		Games games = new Games("Cricket", "OutDoor", 12);
		Games games1 = new Games("Football", "OutDoor", 11);
		Games games2 = new Games("Chess", "InDoor", 2);

		ArrayList list = new ArrayList();

		list.add(games);
		list.add(games2);
		list.add(games1);
		return list.toString();

	}

}
