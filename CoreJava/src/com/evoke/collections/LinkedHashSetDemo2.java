package com.evoke.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo2 {

	public static void main(String[] args) {
		
		  LinkedHashSet<String> linkedhash =new LinkedHashSet<String>();  
		 
		  linkedhash.add("Ravi");  
		  linkedhash.add("Vijay");  
		  linkedhash.add("Ravi");   // Dublicate value.
		  linkedhash.add("Ajay"); 
		  linkedhash.add("Abhit");
		  linkedhash.add("Arun");
		  
		  
		  System.out.println("Elements are = "+linkedhash);
		  System.out.println("Size of Linkedhashset is = "+linkedhash.size());
		 
		  System.out.println("--------Using Iterator------");
		  Iterator<String> itr=linkedhash.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  

	}

}
