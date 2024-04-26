package edu.mu.controller;

import edu.mu.model.PaymentInformation;
import edu.mu.view.PaymentView;

public class PaymentController {

	private PaymentView paymentView;
	private PaymentInformation paymentModel;
	
	public PaymentController(PaymentView paymentView, PaymentInformation paymentModel) {
		super();
		this.paymentView = paymentView;
		this.paymentModel = paymentModel;
	}
	
}