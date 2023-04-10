package com.product.model;

import java.time.LocalDate;
import java.util.Date;
import com.product.enums.Gender;
import com.product.enums.Privilige;

public class SavingsAccount extends Account implements ISavings{
	private LocalDate dateOfBirth;
	private Gender gender;
	private long mobileNO;
	
	public SavingsAccount(int accNumber, String name, int pinNumber, int balance, Privilige privilige, boolean isActive,
			LocalDate date, LocalDate closedDate, LocalDate dateOfBirth, Gender gender, long mobileNO) {
		super(accNumber, name, pinNumber, balance, privilige, isActive, date, closedDate);
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.mobileNO = mobileNO;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public long getMobileNO() {
		return mobileNO;
	}

	public void setMobileNO(long mobileNO) {
		this.mobileNO = mobileNO;
	}

	@Override
	public String toString() {
		return "SavingsAccount [ AccNumber=" + getAccNumber() + ", Name=" + getName() + ", PinNumber="
				+ getPinNumber() + ", Balance=" + getBalance() + ", Privilige=" + getPrivilige()
				+ ", isActive=" + isActive() + ", ActivatedDate=" + getActivatedDate() + ", ClosedDate="
				+ getClosedDate() + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", mobileNO=" + mobileNO+ "  ]";
	}
}
