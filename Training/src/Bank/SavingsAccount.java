package Bank;

import java.util.Scanner;

public class SavingsAccount {
	Scanner sc=new Scanner(System.in);
	private int AccountNumber;
	private String Name;
	private int PinNumber;
	private float Balance;
	private String Privilige;
	private boolean IsActive;
	
	public SavingsAccount() {
		
		
		System.out.println("You Need To Provide Details To Create Account");
	}
	
	
	public SavingsAccount( String name, String privilige,boolean isActive) {
		super();
		AccountNumber = 1001;
		Name = name;
		PinNumber = 1234;
		Balance = 500;
		Privilige = privilige;
		IsActive = isActive;
	}


	


	public int getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPinNumber() {
		return PinNumber;
	}

	public void setPinNumber(int pinNumber) {
		PinNumber = pinNumber;
	}

	public float getBalance() {
		return Balance;
	}

	public void setBalance(float balance) {
		Balance = balance;
	}

	public String getPrivilige() {
		return Privilige;
	}

	public void setPrivilige(String privilige) {
		Privilige = privilige;
	}

	public boolean isIsActive() {
		return IsActive;
	}

	public void setIsActive(boolean isActive) {
		IsActive = isActive;
	}

	
	
	@Override
	public String toString() {
		return "SavingsAccount [AccountNumber=" + AccountNumber + ", Name=" + Name + ", Balance=" + Balance
				+ ", Privilige=" + Privilige + ", IsActive=" + IsActive + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
