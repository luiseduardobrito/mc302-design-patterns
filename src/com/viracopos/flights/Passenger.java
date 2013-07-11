package com.viracopos.flights;

public class Passenger {
	
	private String name;
	private String rg;
	
	private Seat seat;
	
	public Passenger(String name, String rg) {
		this.name = name;
		this.rg = rg;
	}
	
	public String getName() {
		return name;
	}

	public String getRg() {
		return rg;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}
	
	public Seat getSeat() {
		return this.seat;
	}
}
