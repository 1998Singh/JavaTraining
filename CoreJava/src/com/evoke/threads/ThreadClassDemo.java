package com.evoke.threads;

// A thread is a lightweight sub-process, the smallest unit of processing.

// 2 ways 1. thread class , Runnable Interface

// Using thread class

public class ThreadClassDemo extends Thread {

	public void run() // is used to perform action for a thread.
	{
		System.out.println("Creating Thread Using Thead Class");
	}

	public static void main(String[] args) {

		ThreadClassDemo threadClass = new ThreadClassDemo();

		threadClass.start(); // starts the execution of the thread.JVM calls the run() method.

	}

}
