package com.flamingo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TicketInfo {
@Id
private int ticketId;
private int seatNo;
private String status;
@ManyToOne
@JoinColumn(name = "profileid")
private Passenger profile;
@ManyToOne
@JoinColumn(name = "flightId")
private Flight flight;

}
