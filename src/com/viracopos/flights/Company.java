package com.viracopos.flights;

import java.util.ArrayList;
import java.util.List;

public enum Company {
	
	TAM(),
	AZUL(),
	GOL();
	
	private List<Flight> flights;
	
	private Company(){
		this.flights = new ArrayList<Flight>();
	}
	
	public List<Flight> getFlights() {
		return this.flights;
	}
	
	public void addFlight(Flight flight) {
		this.flights.add(flight);
	}
}