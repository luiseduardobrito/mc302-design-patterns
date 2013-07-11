package com.viracopos.main;

import java.util.Random;

import com.viracopos.factories.AirportFactory;
import com.viracopos.structure.Airport;
import com.viracopos.structure.AirportState;
import com.viracopos.structure.roads.Road;
import com.viracopos.structure.roads.RoadType;

public class App {
	
	public static void main(String[] args) {
		
		Integer num = (new Random()).nextInt(4);
		Airport vcp = AirportFactory.create("VCP", "Aeroporto Internacional de Viracopos", num);
	}
	
}

