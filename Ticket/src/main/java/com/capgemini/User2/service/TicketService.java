package com.capgemini.User2.service;

import java.util.List;

import com.capgemini.User2.entity.Ticket;


public interface TicketService {

public void addTicket(Ticket ticket);
	
	public List<Ticket> showTicket();
	public void cancelBookings(int ticketId);
}
