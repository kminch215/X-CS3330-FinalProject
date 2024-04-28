package edu.mu;

import javax.swing.SwingUtilities;

import edu.mu.controller.FlightListController;
import edu.mu.controller.SeatSelectionController;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				FlightListController flightController = new FlightListController();
				flightController.initiate();
			}
		});
		
	}

}
