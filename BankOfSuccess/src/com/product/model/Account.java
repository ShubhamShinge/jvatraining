package com.product.model;

import java.time.LocalDate;
import java.util.Date;
import com.product.enums.Privilige;

public abstract class Account implements IAccount{
	private int accNumber;
	private String name;
	private int pinNumber;
	private int balance;
	private Privilige privilige;
	private boolean isActive;
	private LocalDate activatedDate;
	private LocalDate closedDate;
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Privilige getPrivilige() {
		return privilige;
	}
	public void setPrivilige(Privilige privilige) {
		this.privilige = privilige;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public LocalDate getActivatedDate() {
		return activatedDate;
	}
	public void setActivatedDate(LocalDate activatedDate) {
		this.activatedDate = activatedDate;
	}
	public LocalDate getClosedDate() {
		return closedDate;
	}
	public void setClosedDate(LocalDate closedDate) {
		this.closedDate = closedDate;
	}
	public Account(int accNumber, String name, int pinNumber, int balance, Privilige privilige, boolean isActive,
			LocalDate date, LocalDate closedDate) {
		super();
		this.accNumber = accNumber;
		this.name = name;
		this.pinNumber = pinNumber;
		this.balance = balance;
		this.privilige = privilige;
		this.isActive = isActive;
		this.activatedDate = date;
		this.closedDate = closedDate;
	}
	@Override
	public String toString() {
		return "Account [accNumber=" + accNumber + ", name=" + name + ", pinNumber=" + pinNumber + ", balance="
				+ balance + ", privilige=" + privilige + ", isActive=" + isActive + ", activatedDate=" + activatedDate
				+ ", closedDate=" + closedDate + "]";
	}

	
}
