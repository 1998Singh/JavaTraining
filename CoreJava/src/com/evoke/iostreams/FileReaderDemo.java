package com.evoke.iostreams;

import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) throws Exception {
		
		 FileReader fr=new FileReader("D://jav io//filewrite.txt"); 
	      int i;    
          while((i=fr.read())!=-1) {   
          System.out.print((char)i);  
          }
          fr.close();    

	}

}
