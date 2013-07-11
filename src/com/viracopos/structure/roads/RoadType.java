package com.viracopos.structure.roads;

public enum RoadType {
	Takeoff("takeoff"),
	Landing("landing"),
	Both("both");
	
	String description;
	
	private RoadType(String desc) {
		this.description = desc;
	}
	
	public String getDescription() {
		return this.description;
	}
}
