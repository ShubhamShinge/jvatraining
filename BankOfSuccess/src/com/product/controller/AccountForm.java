package com.product.controller;

import java.util.Scanner;

import com.product.enums.TransferMode;
import com.product.exceptions.AccountAlreadyClosedException;
import com.product.exceptions.InvalidAgeException;
import com.product.exceptions.InvalidPinNumberException;
import com.product.exceptions.RegisterationNumberNotAvaialableException;
import com.product.factory.AccountFactory;
import com.product.factory.AccountManagerFactory;
import com.product.model.Account;
import com.product.model.AccountManager;
import com.product.model.SavingsAccount;
import com.product.model.TransferInfo;

public class AccountForm {
	
	static {
		System.out.println("Welcome To Shubham Bank!");
	}
	public static void main(String[] args) {
		AccountFactory accountFactory = new AccountFactory();
		AccountManagerFactory accountManagerFactory=new AccountManagerFactory();
		AccountManager accountManager=accountManagerFactory.create();
		Scanner sc=new Scanner(System.in);
		boolean isBankOpen=true;
		while(isBankOpen) {
			System.out.println("1.Open An Account.");
			System.out.println("2.Close An Account");
			System.out.println("3.Withdraw Amount.");
			System.out.println("4.Deposit Amount.");
			System.out.println("5.Transfer Amount.");
			System.out.println("6.Exit");
			System.out.print("Enter Your Choice:");
			int customerChoice=sc.nextInt();
			switch(customerChoice) {
			case 1:{
				System.out.println("What type of Account you want to open:");
				System.out.println("1.Savings\t\t2.Current");
				System.out.println("Enter Your Choice:");
				int accountTypeChoice=sc.nextInt();
				String accountType;
				if (accountTypeChoice==1)
					accountType="SA";
				else
					accountType="CA";
				Account account=accountFactory.create(accountType);
				try {
					if(accountManager.openAccount(account,accountType))
						System.out.println("Account Created Succesfully.");
						
				} catch (InvalidAgeException | RegisterationNumberNotAvaialableException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					System.out.println("Sorry Account could Not Be Created.");
				}
				break;
			}
			case 2:
			{
				System.out.print("Enter Your account Id:");int accId=sc.nextInt();
				System.out.print("Enter Your Pin:");int pinNo=sc.nextInt();
				try {
					if(accountManager.closeAccount(accId, pinNo))
						System.out.println("Account Closed Successfully");
				} catch (AccountAlreadyClosedException | InvalidPinNumberException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					System.out.println("Account Could Not Closed");
				}
				break;
			}
			case 3:
			{
				System.out.print("Enter Your account Id:");int accId=sc.nextInt();
				System.out.print("Enter Your Pin:");int pinNo=sc.nextInt();
				System.out.print("Enter Amount To Withdraw From Account:");int amount=sc.nextInt();
				try {
					if(accountManager.withdraw(accId,pinNo,amount))
						System.out.println("Withdrawal Successfull");
					else
						System.out.println("Withdrawal Unsuccesfull");
						
				} catch (InvalidPinNumberException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					System.out.println("Withdrawal Unsuccesfull");
				}
				break;
			}
			case 4:
			{
				System.out.print("Enter Your account Id:");int accId=sc.nextInt();
				System.out.print("Enter Amount To Deposit Into Account:");int amount=sc.nextInt();
				if(accountManager.deposit(accId, amount))
					System.out.println("Deposit successfull");
				break;
			}
			case 5:
			{
				System.out.print("Enter From Account Id:");int fromAccId=sc.nextInt();
				System.out.print("Enter To Account Id:");int toAccId=sc.nextInt();
				System.out.print("Enter Amount To Transfer:");int amount=sc.nextInt();
				System.out.print("Select Transaction Type:1."+TransferMode.NEFT+"\t2."+TransferMode.IMPS+"\t3."+TransferMode.RTGS);int transferModeChoice=sc.nextInt();
				TransferMode transferMode;
				if(transferModeChoice==1)
					transferMode=TransferMode.NEFT;
				else if(transferModeChoice==2)
					transferMode=TransferMode.IMPS;
				else
					transferMode=TransferMode.RTGS;
				System.out.print("Enter Your Pin:");int pinNo=sc.nextInt();
				TransferInfo transferinfo=new TransferInfo(fromAccId, toAccId, amount, transferMode, pinNo);
				try {
					if(accountManager.transfer(transferinfo))
						System.out.println("Transfer Succesfull");
				} catch (InvalidPinNumberException e) {
					// TODO Auto-generated catch block
					e.getMessage();
				}
				break;
			}
			case 6:{
				System.out.println("Thank You.Visit Again!!!");
				isBankOpen=false;
				break;
			}
			default:{
				System.out.println("Enter Correct Choice!");
				break;
			}
			}
		}
	}
}
