package edu.mu.controller;

import edu.mu.model.ReceiptInformation;
import edu.mu.view.ReceiptView;

public class ReceiptController {

	private ReceiptView receiptView;
	private ReceiptInformation receiptModel;
	
	public ReceiptController(ReceiptView receiptView, ReceiptInformation receiptModel) {
		super();
		this.receiptView = receiptView;
		this.receiptModel = receiptModel;
	}
	
}