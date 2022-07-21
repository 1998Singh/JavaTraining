package com.evoke.oopsconcepts;

abstract class GamesResultUni {
	abstract int getResult();     // abstract method

	abstract int getNoOfRound();  // abstract method

	String University1 = "Chandigarh University";
	String University2 = "Delhi University";

}

class ChandigarhUniversity extends GamesResultUni {

	int getResult() {
		return 1;
	}

	int getNoOfRound() {
		return 2;
	}
}

class DU extends GamesResultUni {

	int getResult() {
		return 2;
	}

	int getNoOfRound() {
		return 3;
	}
}
