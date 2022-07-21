package com.evoke.threads;

public class MovieSeatBookApp extends Thread {

	static BookSeatsSynch b;
	int seats;

	public void run() {
		b.bookseat(seats);
	}

	public static void main(String[] args) {

		b = new BookSeatsSynch();

		MovieSeatBookApp amit = new MovieSeatBookApp();
		amit.seats = 7;
		amit.start();

		MovieSeatBookApp pavan = new MovieSeatBookApp();
		pavan.seats = 6;
		pavan.start();

	}

}
