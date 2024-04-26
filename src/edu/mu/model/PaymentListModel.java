package edu.mu.model;

import java.util.ArrayList;

public class PaymentListModel {

	private ArrayList<PaymentInformation> paymentModel;

	public PaymentListModel(ArrayList<PaymentInformation> paymentModel) {
		super();
		this.paymentModel = paymentModel;
	}

	public ArrayList<PaymentInformation> getPaymentModel() {
		return paymentModel;
	}

	public void setPaymentModel(ArrayList<PaymentInformation> paymentModel) {
		this.paymentModel = paymentModel;
	}
	
}
