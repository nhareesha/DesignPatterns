package com.java.designPatterns.facadePattern;

/**
 * This is a facade class for the ShoppingCart that provides high level
 * interface for the client and also it provides simple to use interface.
 * @author Hareesha
 *
 */
public class ShoppingCardFacade {
	private ShoppingCart shopCart;
	
	public ShoppingCart getShopCart() {
		return shopCart;
	}

	public void setShopCart(ShoppingCart shopCart) {
		this.shopCart = shopCart;
	}

	/**
	 * This method provides a high level interface for addToCart functionality
	 * 
	 */
	public void addToCart(){
		shopCart.selectProduct();
		shopCart.checkInventory();
		shopCart.addToCart();
		shopCart.applyAnyDiscount();
		shopCart.updateCartPrice();
	}
	
	/**
	 * This method provides a high level interface for the deleteCart functionality
	 */
	public void deleteFromCart(){
		shopCart.selectProduct();
		shopCart.deleteItem();
		shopCart.updateInventory();
		shopCart.updateCartPrice();
	}
}
