package br.com.entities;

import java.util.Date;
import java.util.List;

public class Game {
	
	private Integer id;
	private Date day;
	private List<Player> players;
	private List<Player> waitingList;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	public List<Player> getWaitingList() {
		return waitingList;
	}
	public void setWaitingList(List<Player> waitingList) {
		this.waitingList = waitingList;
	}
}
