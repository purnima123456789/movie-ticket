package com.capgemini.User2.controller;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.RestController;

import com.capgemini.User2.entity.Ticket;
import com.capgemini.User2.service.TicketService;

	@RestController
		@CrossOrigin(origins="http://localhost:4200")
		@RequestMapping("/ticket")
		public class TicketController {
			@Autowired
			TicketService ticketService;
			
			@GetMapping("/all")
			public List<Ticket> showTicket()
			{
				return ticketService.showTicket();
			}
			
			@GetMapping("/delete")
			public String delete(@RequestParam("ticketId") int ticketId) {
				
				ticketService.cancelBookings(ticketId);
				System.out.println("delete Done");
		       return "Deletion is performed successfully";
			}
			
			@PostMapping("/addTicket")
			public void addTicket(@RequestBody Ticket ticket) {
				ticketService.addTicket(ticket);
			}
	}
