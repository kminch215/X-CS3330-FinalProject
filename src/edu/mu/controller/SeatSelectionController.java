package edu.mu.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import edu.mu.controller.FlightListController.ActionListenerSelectFlight;
import edu.mu.model.FlightInformation;
import edu.mu.model.SeatInformation;
import edu.mu.model.SeatListModel;
import edu.mu.view.SeatSelectionView;

public class SeatSelectionController {

	private SeatSelectionView seatView;
	private SeatListModel seatModel;
	
	public SeatSelectionController(int flightNumber) {
		super();
		this.seatView = new SeatSelectionView();
		this.seatModel = new SeatListModel(flightNumber);
		seatModel.initializeSeats();
		displaySeats(seatModel.getSeatModel(flightNumber));
		seatView.setVisible(true);
		seatView.addActionListenerToSelectSeatButton(new ActionListenerSelectSeat());
		seatView.addActionListenerToBackButton(new ActionListenerBackToFlightList());


	}
	
	public void displaySeats(ArrayList<SeatInformation> seats) {
		seatView.clearSeatTable();
		for(SeatInformation seat : seats) {
			seatView.addSeatInformationToView(seat);
		}
	}
	
	public class ActionListenerSelectSeat implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(seatView.getSelectedSeatNumber() == -1) {
		        JOptionPane.showMessageDialog(null, "No seat selected!");
		        return;
			}
			PaymentController paymentController = new PaymentController();
			System.out.println("Selected Seat(s): " + seatView.getSelectedSeatNumber());
			System.out.println("Moving to payment view...");
			seatView.setVisible(false);

		}
		
	}
	
	public class ActionListenerBackToFlightList implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			FlightListController flightListController = new FlightListController();
			flightListController.initiate();
			System.out.println("Returning to Flight View...");
			seatView.setVisible(false);

		}
		
	}
//	
//	public void initiate() {
//		seatView.setVisible(true);
//	}
	
}