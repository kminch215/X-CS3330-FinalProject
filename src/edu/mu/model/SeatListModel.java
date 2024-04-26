package edu.mu.model;

import java.util.ArrayList;

public class SeatListModel {

	private ArrayList<SeatInformation> seatModel;

	public SeatListModel(ArrayList<SeatInformation> seatModel) {
		super();
		this.seatModel = seatModel;
	}

	public ArrayList<SeatInformation> getSeatModel() {
		return seatModel;
	}

	public void setSeatModel(ArrayList<SeatInformation> seatModel) {
		this.seatModel = seatModel;
	}

}
