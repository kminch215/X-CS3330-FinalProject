package edu.mu.controller;

import edu.mu.model.FlightInformation;
import edu.mu.view.FlightListView;

public class FlightListController {

	private FlightListView flightView;
	private FlightInformation flightModel;
	
	public FlightListController(FlightListView flightView, FlightInformation flightModel) {
		super();
		this.flightView = flightView;
		this.flightModel = flightModel;
	}
	
	
}