package com.viracopos.structure.roads;

import com.viracopos.structure.roads.contexts.RoadClosed;
import com.viracopos.structure.roads.contexts.RoadOpened;


public class Road {
	
	private int num;
	private RoadType type;
	private RoadState state;
	private RoadContext context;
	
	public Road(int num, RoadType type) {
		this.type = type;
	}

	public int getNum() {
		return num;
	}

	public RoadType getType() {
		return type;
	}
	
	public void setState(RoadState state) {
		this.state = state;
		
		switch(this.state) {
			case Ready:
				this.context = new RoadOpened(this.type, this.state);
				break;
			case Closed:
				this.context = new RoadClosed(this.type, this.state);
				break;
		}
	}
	
	public RoadContext getContext() {
		return this.context;
	}
	
}
