package tables;

import java.io.Serializable;

public class Bowling_statistics implements Serializable {
	private int id;
	private int wickets;
	private int five_wicket;
	private int ten_wicket;
	private float average;
	private Player player;
	@Override
	public String toString() {
		return "Bowling_statistics [id=" + id + ", wickets=" + wickets + ", five_wicket=" + five_wicket
				+ ", ten_wicket=" + ten_wicket + ", average=" + average + ", player=" + player + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public int getFive_wicket() {
		return five_wicket;
	}
	public void setFive_wicket(int five_wicket) {
		this.five_wicket = five_wicket;
	}
	public int getTen_wicket() {
		return ten_wicket;
	}
	public void setTen_wicket(int ten_wicket) {
		this.ten_wicket = ten_wicket;
	}
	public float getAverage() {
		return average;
	}
	public void setAverage(float average) {
		this.average = average;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	

}
