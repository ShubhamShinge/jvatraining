package com.product.factory;

import java.util.Scanner;
import com.product.enums.Gender;
import com.product.enums.Privilige;
import com.product.model.Account;
import com.product.model.CurrentAccount;
import com.product.model.SavingsAccount;
import java.time.LocalDate;
public class AccountFactory {
	static int accNo=10000;
	public Account create(String type) {
		//common details
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Account Holders Name:");String name=sc.next();
		System.out.print("Generate Your Pin Number:");int pinNumber=sc.nextInt();
		System.out.print("How Much Balance You Want To Keep Now:");int balance=sc.nextInt();
		LocalDate date = LocalDate.now();
		Privilige p;
		System.out.println("1.PREMIUM\t2.GOLD\t3.SILVER");
		System.out.print("Chose Your Account Privilige:");
		int n=sc.nextInt();
		if(n==1)
			p=Privilige.PREMIUM;
		else if(n==2)
			p=Privilige.GOLD;
		else 
			p=Privilige.SILVER;
		
		//seperate details.
		if(type=="SA") {
			System.out.print("Enter date of birth in YYYY-MM-DD format: "); String dateOfBirth=sc.next();LocalDate dob=LocalDate.parse(dateOfBirth);
			System.out.print("Enter Your Mobile No:");long mobileNo=sc.nextLong();
			return new SavingsAccount(accNo++, name,pinNumber, balance, p, false, date, date.plusYears(5),dob , Gender.M, mobileNo);
		}
		else {
			System.out.print("Enter Company Name:");String companyName=sc.next();
			System.out.print("Enter Company Website/URL:");String url=sc.next();
			System.out.print("Enter Registeration Number:");String registerationNo=sc.next();
			return new CurrentAccount(accNo++, name, pinNumber, balance, p, false,date,date.plusYears(3),companyName, url, registerationNo);
		}
	}
}
