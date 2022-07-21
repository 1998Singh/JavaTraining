package com.evoke.oopsconcepts;

public class TestUniversityCu {

	public static void main(String[] args) {

		University U1 = new Cu("Chandigarh University", "Punjab", 20000);

		System.out.println("University Name =" + U1.getUniversityname());
		System.out.println("Total students =" + U1.getTotalstudents());
		U1.rank();
		System.out.println("--------------------------------------");

		GamesUni g1 = new GamesUni();
		g1.setGame1("Cricket");
		g1.setGame2("Football");
		g1.setNoofteam(4);
		System.out.println("Game1 = " + g1.getGame1());
		System.out.println("Game2 = " + g1.getGame2());
		System.out.println("No of Teams = " + g1.getNoofteam());

		System.out.println("---------------------------------------");

		GamesResultUni gr1 = new ChandigarhUniversity();
		System.out.println("University Name = " + gr1.University1);
		System.out.println("Result = " + gr1.getResult()+"st");
		System.out.println("No Of Rounds = " + gr1.getNoOfRound());
		System.out.println("--------------------------------------");

		GamesResultUni gr2 = new DU();
		System.out.println("University Name = " + gr2.University2);
		System.out.println("Result = " + gr2.getResult()+"nd");
		System.out.println("No Of Rounds = " + gr2.getNoOfRound());

	}

}
