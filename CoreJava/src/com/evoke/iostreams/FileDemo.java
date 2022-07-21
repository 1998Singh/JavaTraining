package com.evoke.iostreams;

import java.io.File;
import java.io.IOException;

//The File class is an abstract representation of file and directory pathname. 
//A pathname can be either absolute or relative.

public class FileDemo {

	public static void main(String[] args) {
	
		 try {  
	          File file = new File("D://jav io//Newfile.txt");  
	           
	            if (file.createNewFile()) 
	            {  
	                System.out.println("New File is created!");  
	            }
	            else 
	           
	            {  
	                System.out.println("File already exists.");  
	            }  
	        } 
		 catch (IOException e)
		 {   
	            System.out.println(e); 
	        }  

	}

}
