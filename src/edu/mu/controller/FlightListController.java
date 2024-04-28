package edu.mu.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.table.TableColumn;

import edu.mu.model.FlightInformation;
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
		displayFlights(flightModel.getFlightModel());
		flightView.addActionListenerToSortButton(new ActionListenerSort());
	}
	
	public void displayFlights(ArrayList<FlightInformation> flights) {
		for(FlightInformation flight : flights) {
			flightView.addFlightInformationToView(flight);
		}
//		flightView.setRadioButtons();
	}
	
	public class ActionListenerSort implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
		
	}

	public void initiate() {
		flightView.setVisible(true);
	}
	
}