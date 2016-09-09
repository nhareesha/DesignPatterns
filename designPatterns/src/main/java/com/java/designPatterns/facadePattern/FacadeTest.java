package com.java.designPatterns.facadePattern;

public class FacadeTest {
	
	public static void main(String args[]){
		
		ShoppingCardFacade facade = new ShoppingCardFacade();
		ShoppingCart shopCart = new ShoppingCart();
		facade.setShopCart(shopCart );
		facade.addToCart();
		facade.deleteFromCart();
		
	}
}
