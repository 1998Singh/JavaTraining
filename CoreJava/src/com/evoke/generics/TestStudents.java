package com.evoke.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestStudents {

	public static void main(String[] args) {
		
		List <Students> list = new ArrayList<Students>();
		
		Students s1 = new Students("Abhit",1,78.96);
		Students s2 = new Students("Abhishek",2,88.96);
		Students s3 = new Students("Daksh",3,90);
		
		list.add(s2);
		list.add(s1);
		list.add(s3);
	//	list.add(12);   // compile time error
		
		System.out.println( "Elements is = "+list.get(0));   // TypeCasting Not required
		
		System.out.println("----printing Elements Using Iterator------");
		
		Iterator<Students> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
