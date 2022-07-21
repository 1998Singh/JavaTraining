package com.evoke.threads;

public class TestPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriorityExample th1 = new ThreadPriorityExample();  
		ThreadPriorityExample th2 = new ThreadPriorityExample();  
		ThreadPriorityExample th3 = new ThreadPriorityExample(); 
		
		System.out.println("Priority of the thread th1 is : " + th1.getPriority()); 
		System.out.println("Priority of the thread th2 is : " + th2.getPriority()); 
		System.out.println("Priority of the thread th3 is : " + th3.getPriority()); 
		
		
		th1.setPriority(6);  
		th2.setPriority(3);  
		th3.setPriority(9);  
		
		
		
		System.out.println(" New Priority of the thread th1  is : " + th1.getPriority()); 
		System.out.println(" New Priority of the thread th2 is : " + th2.getPriority()); 
		System.out.println(" New Priority of the thread th3 is : " + th3.getPriority()); 
		

	}

}
