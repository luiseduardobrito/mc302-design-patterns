package com.viracopos.flights;

public class Seat {
	
	private String row;
	private Integer num;
	
	public Seat(String row, int num) {
		this.row = row;
		this.num = num;
	}
	
	public String getLocation() {
		return this.row + this.num.toString();
	}
}
