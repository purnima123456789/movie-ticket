package com.capgemini.User2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.User2.dao.TicketDao;
import com.capgemini.User2.entity.Ticket;
import com.capgemini.User2.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	TicketRepository ticketRepository;
	
	@Autowired
	TicketDao ticketDao;
	
	@Override
	public void addTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		 ticketDao.addTicket(ticket);
	}

	@Override
	public List<Ticket> showTicket() {
		// TODO Auto-generated method stub
		return ticketDao.showTicket();
	}

	@Override
	public void cancelBookings(int ticketId) {
		// TODO Auto-generated method stub
		ticketDao.cancelBookings(ticketId);
	}

}
