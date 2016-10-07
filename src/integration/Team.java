package integration;

import java.util.LinkedList;

public class Team {

	private LinkedList<Players> players;
	private String Name;
	private String Coach;
	private String owner;
	private String President;
	
	public Team() {
		players = new LinkedList<Players>();
	}
	
	public Team(String Name, String Coach, String owner, String President) {
		this.setName(Name);
		this.setCoach(Coach);
		this.setOwner(owner);
		this.setPresident(President);
		players = new LinkedList<Players>();
	}
	
	public LinkedList<Players> getPlayers(){
		return players;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCoach() {
		return Coach;
	}

	public void setCoach(String coach) {
		Coach = coach;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPresident() {
		return President;
	}

	public void setPresident(String president) {
		President = president;
	}
	
}
