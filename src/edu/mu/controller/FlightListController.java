package edu.mu.controller;

import edu.mu.model.FlightListModel;
import edu.mu.view.FlightListView;

public class FlightListController {

	private FlightListView flightView;
	private FlightListModel flightModel;
	
	public FlightListController(FlightListView flightView, FlightListModel flightModel) {
		super();
		this.flightView = flightView;
		this.flightModel = flightModel;
	}
	
	
}