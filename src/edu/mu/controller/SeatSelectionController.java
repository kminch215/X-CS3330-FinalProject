package edu.mu.controller;

import edu.mu.model.SeatListModel;
import edu.mu.view.SeatSelectionView;

public class SeatSelectionController {

	private SeatSelectionView seatView;
	private SeatListModel seatModel;
	
	public SeatSelectionController() {
		super();
		this.seatView = new SeatSelectionView();
		this.seatModel = new SeatListModel();
		seatModel.initializeSeats();
	}
	
}