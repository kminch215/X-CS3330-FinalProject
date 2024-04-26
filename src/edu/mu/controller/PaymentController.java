package edu.mu.controller;

import edu.mu.model.PaymentListModel;
import edu.mu.view.PaymentView;

public class PaymentController {

	private PaymentView paymentView;
	private PaymentListModel paymentModel;
	
	public PaymentController(PaymentView paymentView, PaymentListModel paymentModel) {
		super();
		this.paymentView = paymentView;
		this.paymentModel = paymentModel;
	}
	
}