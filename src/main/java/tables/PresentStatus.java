package tables;

public class PresentStatus {
private int statusid;


private Playerstatus status;

private Player player;
public Player getPlayer() {
	return player;
}
public void setPlayer(Player player) {
	this.player = player;
}
public int getStatusid() {
	return statusid;
}
public void setStatusid(int statusid) {
	this.statusid = statusid;
}

public Playerstatus getStatus() {
	return status;
}
public void setStatus(Playerstatus status) {
	this.status = status;
}



}
