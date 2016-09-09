package com.java.designPatterns.facadePattern;

public class ShoppingCart {
	
	public void selectProduct(){
		System.out.println("Products selected...After addproduct to cart");
	}
	public void addToCart(){
		System.out.println("Adding items to cart...");
	}
	public void checkInventory(){
		System.out.println("Check system Inventory...");
	}
	public void applyAnyDiscount(){
		System.out.println("Checking for promotion codes that apply...");
	}
	
	public void deleteItem(){
		System.out.println("Delete item from cart...");
	}
	public void updateInventory(){
		System.out.println("Updating inventory.....");
	}
	public void updateCartPrice(){
		System.out.println("Updating cart price......");
	}
}
