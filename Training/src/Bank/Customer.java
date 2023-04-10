package Bank;

import java.awt.DisplayMode;
import java.util.Scanner;

public class Customer {
	static Scanner sc=new Scanner(System.in);
	static {
		System.out.println("-----Welcome To Shubham Bank----");
	}
	public void DisplayMenu() {
		System.out.println("1.Login ");
		System.out.println("2.Create Acount");
		System.out.println("Enter Choice:");
		
		
	}
	private static void LoginAccount() {
		// TODO Auto-generated method stub
		System.out.println("Login Done");
	}
	private static void CreateAccount() {
		// TODO Auto-generated method stub
		String name=sc.next();
		SavingsAccount s1=new SavingsAccount(name, "GOLD",true);
		
		System.out.println("Account Created");
		System.out.println(s1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer();
		c.DisplayMenu();
		
		int UserChoice=sc.nextInt();
		switch(UserChoice) {
		case 1:c.LoginAccount();break;
		case 2:c.CreateAccount();break;
		
		}
		System.out.println("Thank You...Visit Again!!!");
		
	}
	
	

}
