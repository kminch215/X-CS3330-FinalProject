package edu.mu.model;

import java.util.ArrayList;

public class ReceiptListModel {

	private ArrayList<ReceiptInformation> receiptList;

	public ReceiptListModel(ArrayList<ReceiptInformation> receiptList) {
		super();
		this.receiptList = receiptList;
	}

	public ArrayList<ReceiptInformation> getReceiptList() {
		return receiptList;
	}

	public void setReceiptList(ArrayList<ReceiptInformation> receiptList) {
		this.receiptList = receiptList;
	}
	
}
