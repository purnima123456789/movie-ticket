package com.capgemini.User2.dao;


import java.util.List;

import com.capgemini.User2.entity.Ticket;



public interface TicketDao {

	
	public List<Ticket> showTicket();
	public void cancelBookings(int ticketId);

	public void addTicket(Ticket ticket);
	
}
