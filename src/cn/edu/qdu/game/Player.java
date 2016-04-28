package cn.edu.qdu.game;

public abstract class Player {
	private String playName;
	private int winningTimes;
	public String getPlayName() {
		return playName;
	}
	public void setPlayName(String playName) {
		this.playName = playName;
	}
	public int getWinningTimes() {
		return winningTimes;
	}
	public void setWinningTimes(int winningTimes) {
		this.winningTimes = winningTimes;
	}
	public abstract String inputName();
	public abstract String myFist();
	

}
