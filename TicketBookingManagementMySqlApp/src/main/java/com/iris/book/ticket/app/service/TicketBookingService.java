package com.iris.book.ticket.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iris.book.ticket.app.dao.TicketBookingDao;
import com.iris.book.ticket.app.entities.Ticket;

@Service
public class TicketBookingService {

	@Autowired
	private TicketBookingDao  ticketBookingDao;
	public Ticket createTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return ticketBookingDao.save(ticket);
	}
	public Ticket getTicketById(Integer ticketId) {
		return ticketBookingDao.findOne(ticketId);
	}
	public Iterable<Ticket> getAllBookedTickets() {
		return ticketBookingDao.findAll();
	}
	public void deleteTicket(Integer ticketId) {
		ticketBookingDao.delete(ticketId);
		
	}
	public Ticket updateTicket(Integer ticketId, String newEmail) {
		Ticket ticket = ticketBookingDao.findOne(ticketId);
		ticket.setEmail(newEmail);
		Ticket save = ticketBookingDao.save(ticket);
		return save;
	}
	public Ticket updateTicketPATCH(Integer ticketId, Ticket ticket) {
		Ticket Lticket = ticketBookingDao.findOne(ticketId);
		Lticket.setEmail(ticket.getEmail());
		Ticket save = ticketBookingDao.save(Lticket);
		return save;
	}

}