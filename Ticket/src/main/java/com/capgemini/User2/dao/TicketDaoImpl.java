package com.capgemini.User2.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.User2.entity.Ticket;
import com.capgemini.User2.repository.TicketRepository;


@Component
public class TicketDaoImpl implements TicketDao{

	@Autowired
	TicketRepository ticketRepository;
	
	public void addTicket(Ticket ticket) {
	      ticketRepository.save(ticket);
	}

	
	public List<Ticket> showTicket() {
		return (List<Ticket>)ticketRepository.findAll();
	}

	
	public void cancelBookings(int ticketId) {
		ticketRepository.deleteById(ticketId);
	}

}
