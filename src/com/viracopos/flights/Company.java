package com.viracopos.flights;

import java.util.ArrayList;
import java.util.List;

public enum Company {
	
	TAM(),
	AZUL(),
	GOL();
	
	private List<Flight> flight;
	
	private Company(){
		this.flight = new ArrayList<Flight>();
	}
	
	public List<Flight> getFlights() {
		return this.flight;
	}
	
	public void addFlight(Flight flight) {
		this.flight.add(flight);
	}
}