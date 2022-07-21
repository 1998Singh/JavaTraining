package com.evoke.threads;
 
// Using Runnable Interface

public class ThreadsDemo2 implements Runnable {

	@Override
	public void run() 
	{

		System.out.println("Creating Threads Using Runnable interface ");

	}

	public static void main(String[] args) {

		ThreadsDemo2 tdemo = new ThreadsDemo2();
		Thread thread = new Thread(tdemo);
		thread.start();

	}

}
