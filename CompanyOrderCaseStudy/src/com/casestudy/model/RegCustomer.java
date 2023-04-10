package com.casestudy.model;

public class RegCustomer extends Customer{
	private int splDiscount;
	
	
	public RegCustomer(int customerId, String customerName, long mobileNo,int splDiscount) {
		super(customerId, customerName, mobileNo);
		this.splDiscount=splDiscount;
		// TODO Auto-generated constructor stub
	}


	public int getSplDiscount() {
		return splDiscount;
	}


	public void setSplDiscount(int splDiscount) {
		this.splDiscount = splDiscount;
	}


	public RegCustomer() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "RegCustomer [ CustomerId=" + getCustomerId()
				+ ", CustomerName=" + getCustomerName() + ", MobileNo=" + getMobileNo() + ", splDiscount="+getSplDiscount()+"]";
	}


	


	

}
