package edu.mu.controller;

import edu.mu.model.SeatListModel;
import edu.mu.view.SeatSelectionView;

public class SeatSelectionController {

	private SeatSelectionView seatView;
	private SeatListModel seatModel;
	
	public SeatSelectionController(SeatSelectionView seatView, SeatListModel seatModel) {
		super();
		this.seatView = seatView;
		this.seatModel = seatModel;
	}
	
}