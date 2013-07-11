package com.viracopos.main;

import java.util.Random;

import com.viracopos.structure.Airport;
import com.viracopos.structure.AirportState;
import com.viracopos.structure.roads.Road;
import com.viracopos.structure.roads.RoadType;

public class App {
	
	public static void main(String[] args) {
		
		// declare airport instance
		Airport vcp = Airport.getInstance();
		vcp.init("VCP", "Aeroporto Internacional de Viracopos");
		vcp.setCurrentState(AirportState.Opened);
		
		// declare some roads
		for(int i = 0; i < 3; i++)
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
			
			vcp.addRoad(new Road(i, type));
		}
	}
	
}

