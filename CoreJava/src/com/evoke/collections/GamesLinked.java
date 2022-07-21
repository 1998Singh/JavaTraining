package com.evoke.collections;

import java.util.Objects;

public class GamesLinked {
	private String gamename;
	private String gametype;
	private int noofplayer ;
	
	public GamesLinked(String gamename, String gametype, int noofplayer) {
		super();
		this.gamename = gamename;
		this.gametype = gametype;
		this.noofplayer = noofplayer;
	}

	public String getGamename() {
		return gamename;
	}

	public void setGamename(String gamename) {
		this.gamename = gamename;
	}

	public String getGametype() {
		return gametype;
	}

	public void setGametype(String gametype) {
		this.gametype = gametype;
	}

	public int getNoofplayer() {
		return noofplayer;
	}

	public void setNoofplayer(int noofplayer) {
		this.noofplayer = noofplayer;
	}

	@Override
	public String toString() {
		return "GamesLinked [gamename=" + gamename + ", gametype=" + gametype + ", noofplayer=" + noofplayer + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(gamename,gametype,noofplayer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		GamesLinked other = (GamesLinked) obj;
		return Objects.equals(gamename, other.gamename) && Objects.equals(gametype, other.gametype)
				&& Objects.equals(noofplayer, other.noofplayer);
	}
		
	}
	



