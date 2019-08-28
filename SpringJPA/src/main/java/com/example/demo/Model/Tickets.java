package com.example.demo.Model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Ticket")
public class Tickets {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "TicketID")
	private int ID;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="USER_ID")
	private User user;
	@Column(name = "PassengerName")
	private String name;
	@Column(name = "BoardingPoint")
	private String boarding;
	@Column(name = "Destination")
	private String destination;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBoarding() {
		return boarding;
	}

	public void setBoarding(String departure) {
		boarding = departure;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public User getUserId() {
		return user;
	}

	public void setUserId(User user) {
		this.user = user;
	}
}
