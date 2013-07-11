package com.viracopos.reservations;

import com.viracopos.flights.Flight;
import com.viracopos.flights.Passenger;

public interface ReservationStrategy {
	
	public ReservationOperation getOperation();
	public boolean execute(Flight flight, Passenger passenger);

}
