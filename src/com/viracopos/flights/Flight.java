package com.viracopos.flights;

import java.util.ArrayList;
import java.util.List;

public class Flight {
	
	private String from;
	private String to;
	
	private Aircraft aircraft;
	private List<Passenger> passengers;
	
	public Flight(Aircraft aircraft, String from, String to) {
		this.from = from;
		this.to = to;
		
		this.aircraft = aircraft;
		this.passengers = new ArrayList<Passenger>();
	}
	
	public String getRoute() {
		return this.from + "/" + this.to;
	}
}
