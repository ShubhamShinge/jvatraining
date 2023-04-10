package com.product.model;

import com.product.exceptions.AccountAlreadyClosedException;
import com.product.exceptions.InvalidAgeException;
import com.product.exceptions.InvalidPinNumberException;
import com.product.exceptions.RegisterationNumberNotAvaialableException;

public interface IAccountManager {
	public boolean openAccount(Account account,String accountType) throws InvalidAgeException, RegisterationNumberNotAvaialableException;
	public boolean closeAccount(int accountId,int pinNumber) throws AccountAlreadyClosedException, InvalidPinNumberException;
	public boolean withdraw(int accountId,int pinNumber,int amount) throws InvalidPinNumberException;
	public boolean deposit(int accountId,int amount);
	public boolean transfer(TransferInfo transferinfo) throws InvalidPinNumberException;
}
