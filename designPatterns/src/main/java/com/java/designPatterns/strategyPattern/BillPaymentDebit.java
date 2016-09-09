package com.java.designPatterns.strategyPattern;

public class BillPaymentDebit implements IBillPayment{

	public boolean pay(Payment pay) {
		System.out.println("Processing Debit card payment...");
		return true;
	}

}
