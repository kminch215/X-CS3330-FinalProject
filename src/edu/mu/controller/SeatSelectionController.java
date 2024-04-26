package edu.mu.controller;

import edu.mu.model.SeatInformation;
import edu.mu.view.SeatSelectionView;

public class SeatSelectionController {

	private SeatSelectionView seatView;
	private SeatInformation seatModel;
	
	public SeatSelectionController(SeatSelectionView seatView, SeatInformation seatModel) {
		super();
		this.seatView = seatView;
		this.seatModel = seatModel;
	}
	
}