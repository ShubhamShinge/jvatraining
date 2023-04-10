package com.casestudy.model;

public class Customer {
	private int customerId;
	private String customerName;
	private long mobileNo;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Customer(int customerId, String customerName, long mobileNo) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", mobileNo=" + mobileNo + "]";
	}


	
}
