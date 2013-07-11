package com.viracopos.main;

import com.viracopos.structure.Airport;
import com.viracopos.structure.AirportState;

public class App {
	
	public static void main(String[] args) {
		
		// declare airport instance
		Airport vcp = Airport.getInstance();
		vcp.init("VCP", "Aeroporto Internacional de Viracopos");
		vcp.setCurrentState(AirportState.Opened);
		
		// declare some companies
	}
	
}
