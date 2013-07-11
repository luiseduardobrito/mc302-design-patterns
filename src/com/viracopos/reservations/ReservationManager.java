package com.viracopos.reservations;

import java.util.ArrayList;
import java.util.List;

import com.viracopos.flights.Flight;
import com.viracopos.flights.Passenger;

public class ReservationManager {
	
	private ReservationStrategy strategy;
	private List<Reservation> reservations;
	
	public ReservationManager() {
		reservations = new ArrayList<Reservation>();
	}
	
	public boolean performOperation(ReservationOperation operation, Flight flight, Passenger passenger) {
		
		// TODO: Actually save the reservations
		
		switch(operation) {
			case Create:
				this.strategy = new ReservationCreator();
				return this.strategy.execute(flight, passenger);
			case CheckIn:
				this.strategy = new ReservationCheckIn();
				return this.strategy.execute(flight, passenger);
			case Cancel:
				this.strategy = new ReservationCancel();
				return this.strategy.execute(flight, passenger);
			default:
				return false;
		}
	}
	
	public ReservationOperation getCurrentOperation() {
		if(this.strategy instanceof ReservationStrategy)
			return this.strategy.getOperation();
		else
			return null;
	}

}
