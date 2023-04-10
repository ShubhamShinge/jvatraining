package com.casestudy.model;

public class OrderedItem {
	private int price;
	private int itemId;
	private String itemName;
	private int qty;
	private int total;
	
	public OrderedItem(int itemId, String itemName,int price, int qty, int total) {
		super();
		this.price = price;
		this.itemId = itemId;
		this.itemName = itemName;
		this.qty = qty;
		this.total = total;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "OrderedItem [price=" + price + ", itemId=" + itemId + ", itemName=" + itemName + ", qty=" + qty
				+ ", total=" + total + "]";
	}
		
	
}
