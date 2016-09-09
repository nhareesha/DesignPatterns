package com.java.designPatterns.strategyPattern;
/**
 * This class demonstrate the use of strategy pattern
 * Here there can be any number of potential customers who
 * pay bill using credit or debit
 * that means the the bill pay behavior changes at runtime depending on customer.
 * That is where strategy pattern comes in for extracting the behavior that is capable of changing
 * @author Hareesha
 *
 */
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
