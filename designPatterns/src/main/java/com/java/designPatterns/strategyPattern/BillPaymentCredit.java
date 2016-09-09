package com.java.designPatterns.strategyPattern;

public class BillPaymentCredit implements IBillPayment {

	public boolean pay(Payment pay) {
		System.out.println("Processing Credit card payment ....");
		return true;
	}

}
