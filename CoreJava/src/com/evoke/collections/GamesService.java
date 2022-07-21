package com.evoke.collections;

import java.util.Set;

public interface GamesService {
	
	public void addgamesdetails(GamesLinked gameslinked);

	public Set<GamesLinked> getgamesdetails();

	public void cleargamesdetails();

}
