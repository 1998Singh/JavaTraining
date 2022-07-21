package com.evoke.iostreams;

import java.io.FileInputStream;

public class FileInput {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fin=new FileInputStream("D://jav io//Welcome.txt");
		   int i=0;    
           while((i=fin.read())!=-1){    
            System.out.print((char)i);    
           }    
           fin.close();

	}

}
