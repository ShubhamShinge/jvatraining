package com.product.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.product.enums.Privilige;
import com.product.exceptions.AccountAlreadyClosedException;
import com.product.exceptions.InvalidAgeException;
import com.product.exceptions.InvalidPinNumberException;
import com.product.exceptions.RegisterationNumberNotAvaialableException;

public class AccountManager implements IAccountManager {
	public static int calculateAge(LocalDate dob)   
	{  
	//creating an instance of the LocalDate class and invoking the now() method      
	//now() method obtains the current date from the system clock in the default time zone      
	LocalDate curDate = LocalDate.now();  
	//calculates the amount of time between two dates and returns the years  
	if ((dob != null) && (curDate != null))   
	{  
	return Period.between(dob, curDate).getYears();  
	}  
	else  
	{  
	return 0;  
	}  
	}  
	Map<Integer,Account> accountList=new HashMap<Integer, Account>();
	List<TransferInfo> transferInfoList=new ArrayList<TransferInfo>();
	Map<LocalDate,List<TransferInfo>> transferLog=new HashMap<LocalDate, List<TransferInfo>>();
	public AccountManager() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean openAccount(Account account,String accountType) throws InvalidAgeException, RegisterationNumberNotAvaialableException {
		if(accountType=="SA") {
		LocalDate dob=((SavingsAccount) account).getDateOfBirth();
		if(calculateAge(dob)<18)
			throw new InvalidAgeException("Age Should Be Greater Than 18.");
			
		else {
			account.setActive(true);
			accountList.put(account.getAccNumber(),account);
			//account.setPinNumber(-1);
			System.out.println("Here Are YOur Account Details:"+account);
			return true;
		}
		}
		else {
			if(((CurrentAccount)account).getRegisterationNo()==null) {
				throw new RegisterationNumberNotAvaialableException("Please Provide Registeration Number:");
			}
			else {
				account.setActive(true);
				accountList.put(account.getAccNumber(), account);
				//account.setPinNumber(-1);
				System.out.println("Here Are YOur Account Details:"+account);
				return true;
			}
		}
	}

	@Override
	public boolean closeAccount(int accountId,int pinNumber ) throws AccountAlreadyClosedException, InvalidPinNumberException {
		// TODO Auto-generated method stub
		Account account=accountList.get(accountId);
		if(checkPinNumberValidity(account.getPinNumber(), pinNumber)) {
			if(account.isActive()==false)
				throw new AccountAlreadyClosedException("Account Is Already Closed.");
			account.setActive(false);
			//accountList.remove(accountId);
			//account.setPinNumber(-1);
			System.out.println("Account Closed With Details:"+account);

			return true;
		}
		else
			return false;
	}

	@Override
	public boolean withdraw(int accountId,int pinNumber,int amount) throws InvalidPinNumberException {
		// TODO Auto-generated method stub
		Account account=accountList.get(accountId);
		if(account.isActive() && checkPinNumberValidity(account.getPinNumber(),pinNumber) && account.getBalance()>=amount) {
			account.setBalance(account.getBalance()-amount);
			accountList.replace(accountId, account);
			System.out.println("Account Balance:"+account.getBalance());
			return true;
		}
		else
			return false;
	}

	private boolean checkPinNumberValidity(int i, int pinNumber) throws InvalidPinNumberException {
		// TODO Auto-generated method stub
		if(i!=pinNumber)
			throw new InvalidPinNumberException("Entered Pin Is Wrong");
		else
			return false;
	}
	@Override
	public boolean deposit(int accountId,int amount) {
		// TODO Auto-generated method stub
		Account account=accountList.get(accountId);
		if(account.isActive()) {
			account.setBalance(account.getBalance()+amount);
			accountList.replace(accountId, account);
			System.out.println("Account Balance:"+account.getBalance());
			return true;
		}
		else
			return false;
	}

	@Override
	public boolean transfer(TransferInfo transferinfo) throws InvalidPinNumberException {
		// TODO Auto-generated method stub
		Account fromAcc=accountList.get(transferinfo.getFromAccount());
		Account toAcc=accountList.get(transferinfo.getToAccount());
		if(fromAcc.isActive() && toAcc.isActive()){
			try {
				if(fromAcc.getPrivilige()==Privilige.PREMIUM && transferinfo.getTransferAmount()<=100000) {
					if(withdraw(fromAcc.getAccNumber(), transferinfo.getPinNumber(), transferinfo.getTransferAmount())&&
					deposit(toAcc.getAccNumber(), transferinfo.getTransferAmount())) 
					{
						transferinfo.setPinNumber(-1);
					transferInfoList.add(transferinfo);
					LocalDate date=LocalDate.now();
					transferLog.put(date, transferInfoList);
					System.out.println(transferInfoList);
					System.out.println(transferLog);
					return true;
					}
					else
						return false;
					
				}
				else if(fromAcc.getPrivilige()==Privilige.GOLD && transferinfo.getTransferAmount()<=50000) {
					if(withdraw(fromAcc.getAccNumber(), transferinfo.getPinNumber(), transferinfo.getTransferAmount())&&
							deposit(toAcc.getAccNumber(), transferinfo.getTransferAmount())) 
							{
								transferinfo.setPinNumber(-1);
							transferInfoList.add(transferinfo);
							LocalDate date=LocalDate.now();
							transferLog.put(date, transferInfoList);
							System.out.println(transferInfoList);
							System.out.println(transferLog);
							return true;
							}
							else
								return false;
				}
				else if(fromAcc.getPrivilige()==Privilige.SILVER && transferinfo.getTransferAmount()<=25000) {
					if(withdraw(fromAcc.getAccNumber(), transferinfo.getPinNumber(), transferinfo.getTransferAmount())&&
							deposit(toAcc.getAccNumber(), transferinfo.getTransferAmount())) 
							{
								transferinfo.setPinNumber(-1);
							transferInfoList.add(transferinfo);
							LocalDate date=LocalDate.now();
							transferLog.put(date, transferInfoList);
							System.out.println(transferInfoList);
							System.out.println(transferLog);
							return true;
							}
							else
								return false;
				}
				else
					return false;
			} catch (InvalidPinNumberException e) {
				// TODO Auto-generated catch block
				e.getMessage();
				return false;
			}
		}
		else
			return false;
	}
}
