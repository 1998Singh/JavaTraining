package com.evoke.collections;

import java.util.Iterator;
import java.util.Set;



public class TestGames {

	public static void main(String[] args) {
		
		GamesTeams gteams=new GamesTeams(4);
		
		GamesLinked glinked=new GamesLinked("Cricket","Outdoor",12);
		GamesLinked glinked1=new GamesLinked("Football","Outdoor",11);
		GamesLinked glinked2=new GamesLinked("Basketball","Outdoor",5);
		
		GamesService gservice=new GamesServiceImp(gteams);
		gservice.addgamesdetails(glinked);
		gservice.addgamesdetails(glinked1);
		gservice.addgamesdetails(glinked2);
		gservice.addgamesdetails(glinked2);
	
		Set<GamesLinked> gamedetails=gservice.getgamesdetails();
		System.out.println("Size of LinkedHashset = "+gamedetails.size());
		System.out.println("Hashcode = "+gamedetails.hashCode());
		
		Iterator<GamesLinked> detail=gamedetails.iterator();
		while(detail.hasNext()) {
			System.out.println(detail.next());
		}
		
		System.out.println("Clearing Games Details");
		
		gservice.cleargamesdetails();
		
		Iterator<GamesLinked> detail1=gamedetails.iterator();
		while(detail.hasNext()) {
			System.out.println(detail.next());
		

	}

	}
}
