package edu.mu.db;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.sql.Date;

import edu.mu.model.*;

public class FlightApplicationSingleton {
	
	//file path to the file that will store the flight application information
	private final static String flightInformationFile = "flightInformationFile.csv";
	private final static String seatInformationFile = "seatInformationFile.csv";
	
	//will allow you only on instance among any FlightApplicationSingleton object that cannot be accessed outside
	//of the class
	private static FlightApplicationSingleton instance = null;
	private ArrayList<UserInformation> userInformation = null;
	private ArrayList<FlightInformation> flightInformation = null;
	private ArrayList<SeatInformation> seatInformation = null;
	private ArrayList<PaymentInformation> paymentInformation = null;
	private ArrayList<ReceiptInformation> receiptInformation = null;
	
	
	//default constructor
	private FlightApplicationSingleton() {
		userInformation = new ArrayList<UserInformation>();
		flightInformation = new ArrayList<FlightInformation>();
		seatInformation = new ArrayList<SeatInformation>();
		paymentInformation = new ArrayList<PaymentInformation>();
		receiptInformation = new ArrayList<ReceiptInformation>();
	}
	
	public static FlightApplicationSingleton getInstance() {
		if(instance == null) {
			instance = new FlightApplicationSingleton();
		}
		return instance;
	}
	
	//we need to initialize 
	public boolean initializeFlights() {
		FlightInformation flight = null;
    	try {
	        File file = new File(flightInformationFile);
	        Scanner scanner = new Scanner(file);
            // Skip the header if present
	        if (scanner.hasNextLine()) {
	            scanner.nextLine(); // Assuming the first line is a header, if not remove this line
	        }

	        // Read the data
	        while (scanner.hasNextLine()) {
	            String line = scanner.nextLine();
	            String[] parts = line.split(","); // Assuming the CSV is comma-separated

	            // Access each part of the CSV row
	            int flightNumber = Integer.parseInt(parts[0]);
	            String departureLocation = parts[1];
	            String arrivalLocation = parts[2];
	            Date date = Date.valueOf(parts[3]);
	            
	            // Do something with the data, for example, print it
	            System.out.println("FlightNumber: " + flightNumber + ", Departure: " + departureLocation + ", Arrival: " + arrivalLocation + ", Date: " + date);
	            
	            flight = new FlightInformation(flightNumber, departureLocation, arrivalLocation, date);
	            
	            FlightApplicationSingleton.getInstance().addFlight(flight);
	        }
	        scanner.close();
	    } catch (FileNotFoundException e) {
	        System.out.println("File not found: " + flightInformationFile);
	        e.printStackTrace();
	        return false;
	    }
    	
    	return true;
	}
	
	public boolean initializeSeats() {
		SeatInformation seat = null;
    	try {
	        File file = new File(seatInformationFile);
	        Scanner scanner = new Scanner(file);
            // Skip the header if present
	        if (scanner.hasNextLine()) {
	            scanner.nextLine(); // Assuming the first line is a header, if not remove this line
	        }

	        // Read the data
	        while (scanner.hasNextLine()) {
	            String line = scanner.nextLine();
	            String[] parts = line.split(","); // Assuming the CSV is comma-separated

	            // Access each part of the CSV row
	            int seatClass = Integer.parseInt(parts[0]);
	            int flightNumber = Integer.parseInt(parts[1]);
	            int seatNumber = Integer.parseInt(parts[2]);
	            
	            if(seatClass == 1) {
	            	seat = new FirstClassSeat(flightNumber, seatNumber, 1000.00);
	            }
	            else if(seatClass == 2) {
	            	seat = new EconomySeat(flightNumber, seatNumber, 300.00);
	            }
	            
	            // Do something with the data, for example, print it
	            System.out.println("FlightNumber: " + flightNumber + ", SeatNumber: " + seatNumber);
	            	            
	            FlightApplicationSingleton.getInstance().addSeat(seat);
	        }
	        scanner.close();
	    } catch (FileNotFoundException e) {
	        System.out.println("File not found: " + seatInformationFile);
	        e.printStackTrace();
	        return false;
	    }
    	
    	return true;
	}
	
	public boolean addFlight(FlightInformation flight) {
		if(!flightInformation.contains(flight)) {
			flightInformation.add(flight);
			return true;
		}
		return false;
	}
	
	public boolean addSeat(SeatInformation seat) {
		if(!seatInformation.contains(seat)) {
			seatInformation.add(seat);
			return true;
		}
		return false;
	}
}
