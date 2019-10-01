package com.iris.book.ticket.app;

import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.iris.book.ticket.app.entities.Ticket;
import com.iris.book.ticket.app.service.TicketBookingService;


/*@SpringBootApplication
public class TicketBookingManagementAppApplication{

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(TicketBookingManagementAppApplication.class, args);
		TicketBookingService ticketBookingService = configurableApplicationContext.getBean("ticketBookingService", TicketBookingService.class);
		Ticket ticket = new Ticket();
		ticket.setBookingDate(new Date());
		ticket.setDestStation("mumbai");
		ticket.setEmail("abc@gmail");
		ticket.setPessangerName("Ram");
		ticket.setSourceStation("pune");
		ticketBookingService.createTicket(ticket);			
	}
}
*/

@SpringBootApplication
public class TicketBookingManagementAppApplication implements CommandLineRunner{

	@Autowired
	private TicketBookingService ticketBookingService;
	
	@Autowired
	private DataSource dataSource;
	
	public static void main(String[] args) {
		SpringApplication.run(TicketBookingManagementAppApplication.class, args);		
	}

	@Override
	public void run(String... args) throws Exception {
		Ticket ticket = new Ticket();
		ticket.setBookingDate(new Date());
		ticket.setDestStation("mumbai");
		ticket.setEmail("abc@gmail");
		ticket.setPessangerName("Ram");
		ticket.setSourceStation("pune");
		ticketBookingService.createTicket(ticket);
		System.out.println("DataSource :::"+dataSource);
	}

}
