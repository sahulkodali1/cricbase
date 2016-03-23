package tables;

import java.io.Serializable;

public class Batting_statistics implements Serializable {
	private int id;
	private int runs;
	private int centuries;
	private int halfcenturies;
	private float average;
	private Player player;
	@Override
	public String toString() {
		return "Batting_statistics [id=" + id + ", runs=" + runs + ", centuries=" + centuries + ", halfcenturies="
				+ halfcenturies + ", average=" + average + ", player=" + player + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getCenturies() {
		return centuries;
	}
	public void setCenturies(int centuries) {
		this.centuries = centuries;
	}
	public int getHalfcenturies() {
		return halfcenturies;
	}
	public void setHalfcenturies(int halfcenturies) {
		this.halfcenturies = halfcenturies;
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
