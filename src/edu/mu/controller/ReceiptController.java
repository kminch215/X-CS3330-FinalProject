package edu.mu.controller;

import edu.mu.model.ReceiptListModel;
import edu.mu.view.ReceiptView;

public class ReceiptController {

	private ReceiptView receiptView;
	private ReceiptListModel receiptModel;
	
	public ReceiptController(ReceiptView receiptView, ReceiptListModel receiptModel) {
		super();
		this.receiptView = receiptView;
		this.receiptModel = receiptModel;
	}
	
}