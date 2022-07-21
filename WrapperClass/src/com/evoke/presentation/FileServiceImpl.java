package com.evoke.presentation;

import java.io.FileOutputStream;

public class FileServiceImpl implements FileService {

	@Override
	public void createFile(String path) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout = new FileOutputStream(path);
			fout.write(65); //ASCII Values = A
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
