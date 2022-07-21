package com.evoke.threads;

// Daemon thread  is a service provider thread that provides services to the user thread .

public class DaemonThreadDemo extends Thread {

	public void run()   // is used to perform action for a thread.
	{
		if (Thread.currentThread().isDaemon()) 
		{
			System.out.println("Daemon thread working");
		} else 
		{
			System.out.println("User thread working");
		}
	}

}
