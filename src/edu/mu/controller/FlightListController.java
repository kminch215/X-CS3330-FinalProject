package edu.mu.controller;

import edu.mu.model.FlightListModel;
import edu.mu.view.FlightListView;

public class FlightListController {

	private FlightListView flightView;
	private FlightListModel flightModel;
	
	public FlightListController() {
		super();
		this.flightView = new FlightListView();
		this.flightModel = new FlightListModel();
		flightModel.initializeFlights();
	}
	
	
}