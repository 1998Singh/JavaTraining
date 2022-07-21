package com.evoke.iostreams;

public class Games {
	private String gamename;
	private String gametype;
	private int noofplayer;

	public Games(String gamename, String gametype, int noofplayer) {
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
		return "Games [gamename=" + gamename + ", gametype=" + gametype + ", noofplayer=" + noofplayer + "]";
	}

}
