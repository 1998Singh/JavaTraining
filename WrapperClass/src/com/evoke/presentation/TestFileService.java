package com.evoke.presentation;

public class TestFileService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path ="D://jav io/Singh.txt";
		FileServiceImpl fileServiceImpl = new FileServiceImpl();
		fileServiceImpl.createFile(path);

	}

}
