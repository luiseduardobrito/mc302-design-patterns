package com.viracopos.factories;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.viracopos.flights.Aircraft;
import com.viracopos.flights.Company;
import com.viracopos.flights.Flight;

public class CompanyFlightsFactory {
	
	private class Route {
		private String from;
		private String to;
		
		public Route(String from, String to) {
			this.from = from;
			this.to = to;
		}

		public String getFrom() {
			return from;
		}

		public String getTo() {
			return to;
		}
	}
	
	private List<Route> routes = Arrays.asList(
			new Route("VCP", "GYN"),
			new Route("VCP", "GRU"),
			new Route("VCP", "POA"));
	
	private Route RandomRouteFactory() {
		return this.routes.get((new Random()).nextInt(routes.size() - 1));
	}
	
	public Company create(Company company, Integer flightsNumber) {
		
		// declare some aircrafts
		for(int i = 0; i < flightsNumber; i++)
		{
			int n = (new Random()).nextInt(2);
			
			Aircraft aircraft;
			
			switch(n){
				case 0: 
					aircraft = Aircraft.E190;
					break;
				case 1:
					aircraft = Aircraft.E195;
					break;
				default:
					aircraft = Aircraft.B737;
					break;
			}
			
			Route route = this.RandomRouteFactory();
			company.addFlight(new Flight(aircraft, route.getFrom(), route.getTo()));
		}
		
		return company;
	}

}
