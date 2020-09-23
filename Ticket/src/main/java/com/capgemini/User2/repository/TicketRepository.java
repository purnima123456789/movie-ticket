package com.capgemini.User2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.User2.entity.Ticket;



@Repository
public interface TicketRepository  extends CrudRepository<Ticket, Integer> {

}
