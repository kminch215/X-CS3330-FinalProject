package edu.mu;

import edu.mu.controller.FlightListController;
import edu.mu.controller.SeatSelectionController;
import edu.mu.controller.PaymentController;

import java.util.Scanner;
import java.util.Calendar;

public class Main {

	public int getHour() { //create faux airline name 			!!this is what is causing lag. If you don't want it, pitch it
        int hour = getCurrentHour();
        if (hour <= 12) {
            System.out.println("Good morning!\nThank you for choosing __ airlines. Here are our upcoming flights.");
        } else if (hour < 17) {
            System.out.println("Good afternoon!\nThank you for choosing __ airlines. Here are our upcoming flights.");
        } else {
            System.out.println("Good evening!\nThank you for choosing __ airlines.\nHere are our upcoming flights.");
        }
        return hour;
	}

    private int getCurrentHour() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.HOUR_OF_DAY);
    }

    public static void main(String[] args) {
    	Main main = new Main();
    	main.getHour();
		FlightListController flightController = new FlightListController();
		SeatSelectionController seatController = new SeatSelectionController();
		PaymentController paymentController = new PaymentController();
}
}
