package com.evoke.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class GamesTeams {
	private int noofteams;

	Set<GamesLinked> gamesdetails = new LinkedHashSet<GamesLinked>();

	public GamesTeams(int noofteams) {
		super();
		this.noofteams = noofteams;
	}

	public int getNoofteams() {
		return noofteams;
	}

	public void setNoofteams(int noofteams) {
		this.noofteams = noofteams;
	}

	public Set<GamesLinked> getGamesdetails() {
		return gamesdetails;
	}

	public void setGamesdetails(Set<GamesLinked> gamesdetails) {
		this.gamesdetails = gamesdetails;
	}

	@Override
	public String toString() {
		return "GamesTeams [noofteams=" + noofteams + ", gamesdetails=" + gamesdetails + "]";
	}

}
