package com.product.model;

import java.time.LocalDate;
import java.util.Date;
import com.product.enums.Privilige;

public class CurrentAccount extends Account implements ICurrent{
	private String companyName;
	private String website;
	private String registerationNo;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getRegisterationNo() {
		return registerationNo;
	}
	public void setRegisterationNo(String registerationNo) {
		this.registerationNo = registerationNo;
	}
	public CurrentAccount(int accNumber, String name, int pinNumber, int balance, Privilige privilige, boolean isActive,
			LocalDate activatedDate, LocalDate closedDate, String companyName, String website, String registerationNo) {
		super(accNumber, name, pinNumber, balance, privilige, isActive, activatedDate, closedDate);
		this.companyName = companyName;
		this.website = website;
		this.registerationNo = registerationNo;
	}
	@Override
	public String toString() {
		return "CurrentAccount [ AccNumber=" + getAccNumber() + ", getName=" + getName()
				+ ", PinNumber=" + getPinNumber() + ", Balance=" + getBalance() + ", Privilige="
				+ getPrivilige() + ", isActive=" + isActive() + ", ActivatedDate=" + getActivatedDate()
				+ ", ClosedDate=" + getClosedDate() + ", companyName=" + companyName + ", website=" + website + ", registerationNo="+registerationNo +" ]";}
	
	
}
