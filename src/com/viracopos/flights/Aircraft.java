package com.viracopos.flights;

public enum Aircraft {
	
	E190("Embraer 190", 114),
	E195("Embraer 195", 124),
	B737("Boeing 737-700", 149);
	
	private String desc;
	private int qtd; 
	
	private Aircraft(String desc, int qtd) {
		this.desc = desc;
		this.qtd = qtd;
	}

}
