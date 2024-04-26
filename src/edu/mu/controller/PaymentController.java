package edu.mu.controller;

import edu.mu.model.PaymentListModel;
import edu.mu.view.PaymentView;

public class PaymentController {

	private PaymentView paymentView;
	private PaymentListModel paymentModel;
	
	public PaymentController() {
		super();
		this.paymentView = new PaymentView();
		this.paymentModel = new PaymentListModel();
	}
	
}