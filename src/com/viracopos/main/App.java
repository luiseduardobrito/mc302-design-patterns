package com.viracopos.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.viracopos.factories.AirportFactory;
import com.viracopos.factories.CompanyFlightsFactory;
import com.viracopos.flights.Company;
import com.viracopos.structure.Airport;

public class App {
	
	public static void main(String[] args) {
		
		Integer num = (new Random()).nextInt(4);
		Airport vcp = AirportFactory.create("VCP", "Aeroporto Internacional de Viracopos", 2);
		
		CompanyFlightsFactory companyFactory = new CompanyFlightsFactory();
		
		List<Company> companies = new ArrayList<Company>();
		companies.add(companyFactory.create(Company.AZUL, 4));
		companies.add(companyFactory.create(Company.TAM, 4));
	}
	
}

