package com.example.demo.Controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Tickets;
import com.example.demo.Services.TicketService;

@RestController
@RequestMapping(path="/tickets")
public class TicketControllers {
	
	@Autowired
	private TicketService ticketservice;

	@PostMapping(value="/generateTicket")
	public void generateTicket(@RequestBody Tickets ticket) {
		ticketservice.createTicket(ticket);
	}
	@GetMapping("/user/{userid}")
	public List<Tickets> getallTicketsByUser(@PathVariable int userid){
		return ticketservice.getAllTickets(userid);
	}
	
	
}
