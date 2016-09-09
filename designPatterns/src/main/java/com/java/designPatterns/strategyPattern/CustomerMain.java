package com.java.designPatterns.strategyPattern;

public class CustomerMain {
	private IBillPayment payment;
	
	public CustomerMain(IBillPayment payment){
		this.payment = payment;
	}
	
	public static void main(String[] args) {
		CustomerMain main = new CustomerMain(new BillPaymentCredit());
		Payment pay =new Payment();
		pay.setAmount(123.45);
		pay.setCardNum("1234567890");
		pay.setCardType("VISA");
		main.payment.pay(pay );
	}

}
