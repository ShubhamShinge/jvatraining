package com.casestudy.model;

public class Item {
	private int itemId;
	private String itemName;
	private int itemPrice;
	private int quantityOnHand;
	public Item() {
		// TODO Auto-generated constructor stub
	}
	public Item(int itemId, String itemName, int itemPrice, int quantityOnHand) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.quantityOnHand = quantityOnHand;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getQuantityOnHand() {
		return quantityOnHand;
	}
	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", quantityOnHand="
				+ quantityOnHand + "]";
	}
	
}
