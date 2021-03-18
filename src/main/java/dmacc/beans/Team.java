
package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author dbaack
 *
 */
@Entity
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String sport;
	private String location;
	private String teamName;
	private int numPlayers;
	private boolean professional;
	
	public Team() {
		super();
	}
	
	public Team(String sport, String location, String teamName, int numPlayers, boolean professional) {
		super();
		this.setSport(sport);
		this.setLocation(location);
		this.setTeamName(teamName);
		this.setNumPlayers(numPlayers);
		this.setProfessional(professional);
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getNumPlayers() {
		return numPlayers;
	}

	public void setNumPlayers(int numPlayers) {
		this.numPlayers = numPlayers;
	}

	public boolean isProfessional() {
		return professional;
	}

	public void setProfessional(boolean professional) {
		this.professional = professional;
	}

	@Override
	public String toString() {
		return "Team [sport=" + sport + ", location=" + location + ", teamName=" + teamName + ", numPlayers="
				+ numPlayers + ", professional=" + professional + "]";
	}
	
	
	
	
}
