package com.iris.book.ticket.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iris.book.ticket.app.entities.Ticket;

public interface TicketBookingDao extends CrudRepository<Ticket,Integer> {
	
}
