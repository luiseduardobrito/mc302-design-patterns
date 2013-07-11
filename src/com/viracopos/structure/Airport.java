package com.viracopos.structure;

import java.util.ArrayList;
import java.util.List;

import com.viracopos.structure.roads.Road;

public class Airport {
	
	private static Airport instance;
	
	private String cod;
	private String name;
	
	private List<Road> roads;
	
	private AirportState currentState; 
	
	public Airport() {

		this.roads = new ArrayList<Road>();
	}
	
	public static Airport getInstance() {
		
		if (instance == null)
    	  instance = new Airport();
		
		return instance;
	}
	
	public void init(String cod, String name) {
		
		if(this.cod.isEmpty() && this.name.isEmpty())
		{
			this.cod = cod;
			this.name = name;
		}
	}
	
	public AirportState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(AirportState currentState) {
		this.currentState = currentState;
	}

	public String getCod() {
		return this.cod;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addRoad(Road road) {
		this.roads.add(road);
	}
	
	public List<Road> getRoads() {
		return this.roads;
	}
}
