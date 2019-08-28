package com.example.demo.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Tickets;

@Repository
public class TicketRepository {

	@Autowired
	private Ticketrepo trepo;

	public void createTicket(Tickets ticket) {
		trepo.save(ticket);
	}

	public List<Tickets> getTicketsForUser(int userid) {
		 return trepo.findAllByUser_userID(userid);
		
	}

	

}
