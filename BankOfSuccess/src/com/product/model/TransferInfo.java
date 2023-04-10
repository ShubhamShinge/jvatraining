package com.product.model;

import com.product.enums.TransferMode;

public class TransferInfo {
	private int fromAccount;
	private int toAccount;
	private int transferAmount;
	private TransferMode transferMode;
	private int pinNumber;
	public TransferInfo(int fromAccount, int toAccount, int transferAmount, TransferMode transferMode, int pinNumber) {
		super();
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.transferAmount = transferAmount;
		this.transferMode = transferMode;
		this.pinNumber = pinNumber;
	}
	public int getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(int fromAccount) {
		this.fromAccount = fromAccount;
	}
	public int getToAccount() {
		return toAccount;
	}
	public void setToAccount(int toAccount) {
		this.toAccount = toAccount;
	}
	public int getTransferAmount() {
		return transferAmount;
	}
	public void setTransferAmount(int transferAmount) {
		this.transferAmount = transferAmount;
	}
	public TransferMode getTransferMode() {
		return transferMode;
	}
	public void setTransferMode(TransferMode transferMode) {
		this.transferMode = transferMode;
	}
	public int getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	@Override
	public String toString() {
		return "TransferInfo [fromAccount=" + fromAccount + ", toAccount=" + toAccount + ", transferAmount="
				+ transferAmount + ", transferMode=" + transferMode + ", pinNumber=" + pinNumber + "]";
	}
	
}
