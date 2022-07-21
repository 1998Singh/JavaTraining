package com.evoke.threads;

public class TestDaemonThread {

	public static void main(String[] args) {
		
		System.out.println("Main Thread Working ");   // main thread
		
		DaemonThreadDemo daemon = new DaemonThreadDemo();  // User Thread
		daemon.start();

		DaemonThreadDemo daemon1 = new DaemonThreadDemo();  // Daemon Thread.
		daemon1.setDaemon(true);
		daemon1.start();

	}

}
