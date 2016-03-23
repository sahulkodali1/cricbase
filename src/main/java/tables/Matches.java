package tables;

import java.io.Serializable;

public class Matches implements Serializable {
	private int id;
	private int player_id;
	private int Testmatches;
	private int odi;
	private int t20;
	//private Player player;
	private static long serialVersionUID = 1L;
	@Override
	public String toString() {
		return "Matches [id=" + id + ", player_id=" + player_id + ", Testmatches=" + Testmatches + ", odi=" + odi
				+ ", t20=" + t20 + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPlayer_id() {
		return player_id;
	}
	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}
	public int getTestmatches() {
		return Testmatches;
	}
	public void setTestmatches(int testmatches) {
		Testmatches = testmatches;
	}
	public int getOdi() {
		return odi;
	}
	public void setOdi(int odi) {
		this.odi = odi;
	}
	public int getT20() {
		return t20;
	}
	public void setT20(int t20) {
		this.t20 = t20;
	}
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	public static void setSerialVersionUID(long serialVersionUID) {
		Matches.serialVersionUID = serialVersionUID;
	}

}
