package com.viracopos.reservations;

import com.viracopos.flights.Flight;
import com.viracopos.flights.Passenger;

public class ReservationCreator implements ReservationStrategy {
	
	public boolean execute(Flight flight, Passenger passenger) {
		return (new Reservation(flight, passenger)).ok();
	}
	
	public ReservationOperation getOperation() {
		return ReservationOperation.Create;
	}
}
