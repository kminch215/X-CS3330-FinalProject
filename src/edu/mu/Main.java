package edu.mu;

import edu.mu.db.FlightApplicationSingleton;

public class Main {

	public static void main(String[] args) {
		FlightApplicationSingleton.getInstance();
		FlightApplicationSingleton.getInstance().initializeFlights();
	}

}
