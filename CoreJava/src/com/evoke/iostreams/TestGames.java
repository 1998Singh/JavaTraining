package com.evoke.iostreams;



public class TestGames {

	public static void main(String[] args) {
		
		
		
		GamesServiceImp gamesServiceImp = new GamesServiceImp();

		String path = "D://jav io/games.txt";
		
		gamesServiceImp.createFile(path);
		System.out.println("Path is = " + path);

		System.out.println("----Reading  the File Data ---");
		gamesServiceImp.readingFile(path);

	System.out.println("Deleting the file ");
		gamesServiceImp.deleteFile(path);

	}

}
