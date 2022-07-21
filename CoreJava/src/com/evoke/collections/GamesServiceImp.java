package com.evoke.collections;

import java.util.Set;

public class GamesServiceImp implements GamesService {

	private GamesTeams gamesteams;

	public GamesServiceImp(GamesTeams gamesteams) {
		super();
		this.gamesteams = gamesteams;
	}

	@Override
	public void addgamesdetails(GamesLinked gameslinked) {
		this.gamesteams.getGamesdetails().add(gameslinked);

	}

	@Override
	public Set<GamesLinked> getgamesdetails() {
		return gamesteams.getGamesdetails();
	}

	@Override
	public void cleargamesdetails() {
		this.gamesteams.getGamesdetails().clear();

	}

}
