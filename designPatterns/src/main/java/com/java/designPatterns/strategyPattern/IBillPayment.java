package com.java.designPatterns.strategyPattern;
/**
 * This is strategy or behavior that is expected to change
 * and there can be any number of implementation , so that 
 * common functionality is abstracted in to an interface
 * @author SunilKumar
 *
 */
public interface IBillPayment {
	public boolean pay(Payment pay);

}
