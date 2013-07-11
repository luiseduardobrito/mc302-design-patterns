package com.viracopos.factories;

import java.util.Random;

import com.viracopos.structure.Airport;
import com.viracopos.structure.AirportState;
import com.viracopos.structure.roads.Road;
import com.viracopos.structure.roads.RoadType;

public class AirportFactory {
	
	public static Airport create(String cod, String name, Integer roadNumber) {
		
		// declare airport instance
		Airport airport = Airport.getInstance();
		airport.init(cod, name);
		airport.setCurrentState(AirportState.Opened);
		
		// declare some roads
		for(int i = 0; i < roadNumber; i++)
		{
			int n = (new Random()).nextInt(2);
			
			RoadType type;
			
			switch(n){
				case 0: 
					type = RoadType.Landing;
					break;
				case 1:
					type = RoadType.Takeoff;
					break;
				default:
					type = RoadType.Both;
					break;
			}
			
			airport.addRoad(new Road(i, type));
		}
		
		return airport;
	}

}
