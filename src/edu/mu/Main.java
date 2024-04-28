package edu.mu;

import edu.mu.controller.FlightListController;
import edu.mu.controller.SeatSelectionController;
import java.util.Scanner;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		FlightListController flightController = new FlightListController();
		SeatSelectionController seatController = new SeatSelectionController();
	}

	public static int convert(String str) {
		int num = 0;
		try {
			num = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			System.out.println("Invalid input. Please enter a number.");
		}
		return num;
	}
	public static void main(String[] args) {
		String yes = "yes";
		String no = "no";
		String back = "back";
		Scanner confirm = new Scanner(System.in);
		
		// Ticket confirmation loop
		while (true) {
            System.out.println("Is this okay? (Enter 'yes' to proceed, 'no' to cancel)" /*, retrieve ticket details, not finished*/);
            String ans = confirm.nextLine().toLowerCase();
            
            if (ans.equals(yes)) {
            	// Payment information loop
            	while (true) {
            		System.out.println("To proceed with payments, please enter the following:");
            		System.out.println("First name: ");
            		String firstName = confirm.nextLine().toLowerCase();
            		// Last name
            		while (true) {
            			System.out.println("Last name: ");
                        System.out.println("Say 'back' to retype.");
            			String lastName = confirm.nextLine().toLowerCase();
            			
            			if (lastName.equals(back)) {
            				System.out.println("Re-entering first name...");
            				break; // re-enter first name
            			}
            			
            			// Card number
            			System.out.println("Card number: ");
            			String cardnumber = confirm.nextLine(); //!HASH
                        if (cardnumber.length() != 16) {
                        	System.out.println("Card invalid.");
                        	continue; //redo cardnumber
                        }
            			String cardNumber = confirm.nextLine();
            			
            			while (true) {
            				System.out.println("CVV: ");
                            System.out.println("Say 'back' to retype.");
            				String cvvNumber = confirm.nextLine();
            				
            				if (cvvNumber.equals(back)) {
            					System.out.println("Re-entering card number...");
            					break; //re-enter card number
            				}
            				
            				if (cvvNumber.length() != 3) {
            					System.out.println("CVV invalid. Please enter 3 digits.");
            					continue; //re-enter CVV
            				}
            				
            				// Expiration month
            				System.out.println("Expiration month (MM): ");
            				String expirationMonth = confirm.nextLine();
            				int month = convert(expirationMonth);
            				if (month <= 0 || month > 12) {
            					System.out.println("Invalid month. Please enter a number between 1 and 12.");
            					continue; // re-enter expiration month
            				}
            				
            				// Expiration year
            				System.out.println("Expiration year (YYYY): ");
            				String expirationYear = confirm.nextLine();
            				int year = convert(expirationYear);
            				if (year < 2019 || year < 2029) {
            					System.out.println("Invalid year. Please enter a valid year.");
            					continue; //re-enter expiration year
            				}
            				
            				// Confirmation
            				System.out.println("Is this correct?");
            				System.out.println(firstName + " " + lastName);
            				System.out.println("Card number: XXXX-XXXX-XXXX-" + cardNumber.substring(cardNumber.length() - 4)); //conceal cardnum
            				System.out.println("Expiration: " + expirationMonth + "/" + expirationYear);
            				System.out.println("Enter 'yes' to confirm, 'no' to retype.");
            				String confirmPayment = confirm.nextLine().toLowerCase();
            				
            				if (confirmPayment.equals(yes)) {
                            	System.out.println("Payment processing... /n/n Processed. /n Thank you for choosing ___ airlines. Have a safe flight."); //input faux airline name
                            	break; //payment processed, exit
            				} else if (confirmPayment.equals(no)) {
                            	// Re-enter details
                            	continue; //re-enter expiration details
            				} else {
                            	System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            				}
            			} // End inner CVV loop
            			break; // Exit outer Last Name loop
            		} // End inner Last Name loop
            		
            		// Exit payment loop
            		if (ans.equals(no)) { //!not finished, take user back to seating selection
                    	System.out.println("goodbye");
                        break;
            		}
            	}
            }
		}
	}
}
