package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Model.Tickets;
import com.example.demo.Repository.TicketRepository;

@Service
public class TicketService {
	
	@Autowired
	private TicketRepository ticketrepo;

	public void createTicket(Tickets ticket) {
		ticketrepo.createTicket(ticket);
	}

	public List<Tickets> getAllTickets(int userid) {
		 return ticketrepo.getTicketsForUser(userid);
	}

}
