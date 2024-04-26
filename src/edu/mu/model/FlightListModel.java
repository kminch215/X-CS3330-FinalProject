package edu.mu.model;

import java.util.ArrayList;

public class FlightListModel {

	private ArrayList<FlightInformation> flightModel;

	public FlightListModel(ArrayList<FlightInformation> flightModel) {
		super();
		this.flightModel = flightModel;
	}

	public ArrayList<FlightInformation> getFlightModel() {
		return flightModel;
	}

	public void setFlightModel(ArrayList<FlightInformation> flightModel) {
		this.flightModel = flightModel;
	}
	
	
}
