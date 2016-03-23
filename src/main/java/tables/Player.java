package tables;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Player implements Serializable {
	private String name;
	private int age;
	private int player_id;
	private String role;
	private String nationality;
	private List<PresentStatus>status1=new ArrayList<PresentStatus>();
	public List<PresentStatus> getStatus1() {
		return status1;
	}
	public void setStatus1(List<PresentStatus> status1) {
		this.status1 = status1;
	}
	private static final long serialVersionUID = 1L;
	
	
	private Matches matches;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPlayer_id() {
		return player_id;
	}
	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	
	public Matches getMatches() {
		return matches;
	}
	public void setMatches(Matches matches) {
		this.matches = matches;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + ", player_id=" + player_id + ", role=" + role
				+ ", nationality=" + nationality + ", status=" + status1 + ", matches=" + matches + "]";
	}
	

}