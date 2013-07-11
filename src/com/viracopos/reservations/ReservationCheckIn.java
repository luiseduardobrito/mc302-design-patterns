package com.viracopos.reservations;

import com.viracopos.flights.Flight;
import com.viracopos.flights.Passenger;

public class ReservationCheckIn implements ReservationStrategy {
	
	public boolean execute(Flight flight, Passenger passenger) {
		
		// pretend to check in the flight
		// TODO: actually cancel the reservation
		return true;
	}
	
	public ReservationOperation getOperation() {
		return ReservationOperation.CheckIn;
	}
}
