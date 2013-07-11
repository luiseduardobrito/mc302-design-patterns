package com.viracopos.structure.roads;

import java.util.List;

import com.viracopos.flights.Flight;

public interface RoadContext {
	
	boolean acceptLanding();
	boolean acceptTakeoff();
	
	List<Flight> getLine();
	Flight popFlight();
	boolean pushFlight(Flight flight);

}
