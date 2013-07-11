package com.viracopos.reservations;

import com.viracopos.flights.Flight;
import com.viracopos.flights.Passenger;

public class Reservation {
	
	private Flight flight;
	private Passenger passenger;
	
	public Reservation(Flight flight, Passenger passenger) {
		this.flight = flight;
		this.passenger = passenger;
	}
	
	public boolean ok() {
		return (passenger instanceof Passenger);		
	}
}
