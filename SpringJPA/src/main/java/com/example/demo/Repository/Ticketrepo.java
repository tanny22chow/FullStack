package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.example.demo.Model.Tickets;


public interface Ticketrepo extends JpaRepository<Tickets,Integer>{
	
	public List<Tickets> findAllByUser_userID(int id) ;

}
