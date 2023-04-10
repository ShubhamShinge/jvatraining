package com.casestudy.model;

public class Order {
	private int orderId;
	private int customerId;
	private int totalAmount;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Order(int orderId, int customerId, int totalAmount) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.totalAmount = totalAmount;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerId=" + customerId + ", totalAmount=" + totalAmount + "]";
	}
	
}
