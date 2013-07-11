package com.viracopos.structure.roads.contexts;

import java.util.ArrayList;
import java.util.List;

import com.viracopos.flights.Flight;
import com.viracopos.structure.roads.RoadContext;
import com.viracopos.structure.roads.RoadState;
import com.viracopos.structure.roads.RoadType;

public class RoadOpened implements RoadContext{
	
	private RoadType type;
	private RoadState state;
	
	private List<Flight> flights;
	
	public RoadOpened(RoadType type, RoadState state) {
		this.type = type;
		this.state = state;
		
		flights = new ArrayList<Flight>();
		
	}
	
	@Override
	public boolean acceptLanding() {
		
		if(this.type == RoadType.Takeoff)
			return false;
		
		else if(this.state != RoadState.Ready)
			return false;
		
		return true;
	}
	
	@Override
	public boolean acceptTakeoff() {
		
		if(this.type == RoadType.Landing)
			return false;
		
		else if(this.state != RoadState.Ready)
			return false;
		
		return true;
	}
	
	@Override
	public boolean pushFlight(Flight flight) {
		flights.add(flight);
		return true;
	}
	
	@Override
	public Flight popFlight() {
		
		Flight current = flights.get(0);
		flights.remove(0);
		
		return current;
	}
	
	@Override
	public List<Flight> getLine() {
		return this.flights;		
	}

}
