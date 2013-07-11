package com.viracopos.flights;

public class Seat {
	
	private String place;
	private Integer row;
	
	public Seat(Integer row, String place) {
		this.row = row;
		this.place = place;
	}
	
	public String getLocation() {
		return this.row.toString() + this.place;
	}
}
