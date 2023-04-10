package com.casestudy.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Company {
	static int orderId=100;
	static Company company=new Company();
	static Scanner sc=new Scanner(System.in);
	static List<Item> itemList=new ArrayList<Item>();
	List<OrderedItem> orderList=new ArrayList<OrderedItem>();
	static Map<Integer,RegCustomer> memberList=new HashMap<Integer,RegCustomer>();
	static List<Order> allOrderList=new ArrayList<Order>();
	public void addItem(Item item) {
		itemList.add(item);
	}
	public void generateItemList() {
		Item i1=new Item(1001,"Parle",10,1000);
		Item i2=new Item(1002,"GoodDay",20,567);
		Item i3=new Item(1003,"Maggie",12,999);
		itemList.add(i1);
		itemList.add(i2);
		itemList.add(i3); 
		memberList.put(101,new RegCustomer(101,"Shubham",7378420301L,15));
	}
	private void displayItems() {
		// TODO Auto-generated method stub
		if(itemList.isEmpty()) {
			System.out.println("No Item In The Store!!!");
		}
		else {
			int i=1;
			for(Item item:itemList) {
				System.out.println(i+"->"+item);
				i++;}
		}
		
	}
	public void shop() {
		company.displayItems();
		System.out.println("Enter Item No. You want to add:");
		int selectedItem=sc.nextInt();
		Item sample=itemList.get(selectedItem-1);
		System.out.println("Enter Quantity:");
		int qty=sc.nextInt();
		if(qty>sample.getQuantityOnHand()) {
			System.out.println("Sorry! Item Quantity is Out Of Stock!!");
			return;
		}
		else {
			sample.setQuantityOnHand(sample.getQuantityOnHand()-qty);
		}
		int total=(qty*sample.getItemPrice());
		OrderedItem ordereditem=new OrderedItem(sample.getItemId(),sample.getItemName(),sample.getItemPrice(), qty,total);
		//System.out.println(ordereditem);
		orderList.add(ordereditem);
		System.out.println("Item Added Successfully!");
	}
	public boolean generateBill(int cId,boolean isRegCustomer) {
		int currentOrderId=orderId++;
		System.out.println("Bill Generated for Order :"+currentOrderId);
		int totalAmount=0;
		int i=1;
		for(OrderedItem o:orderList) {
			System.out.println(" # "+i++ + " | " + o+" #");
			totalAmount+=o.getTotal();
		}
		System.out.println("You Shopped for:"+totalAmount);
		if(isRegCustomer) {
			totalAmount-=(totalAmount*memberList.get(cId).getSplDiscount()/100);
			System.out.println("After Adding Discount Your Total Is:"+totalAmount);
		}
		Order order=new Order(currentOrderId,cId,totalAmount);
		System.out.println(order);
		allOrderList.add(order);
		System.out.println("Thank You Visit Again!!!");
		orderList.clear();
		return false;
	}
	static {
		System.out.println("Welcome To Amazon");
	}
	public void getTotalWorthOfOrdersPlaced() {
		int totalShopForDay=0;
		for(Order o:allOrderList)
			totalShopForDay+=o.getTotalAmount();
		System.out.println("Total Shop for Today Is:"+totalShopForDay);
	}
	public static void main(String[] args) {
		company.generateItemList();
		
		boolean flag=true;
		while(flag){
			//MenuList
			System.out.println("1.Shop");
			System.out.println("2.Add an Item to Stock");
			System.out.println("3.Exit");
			int n=sc.nextInt();
			switch(n) {
			case 1:{
				//checking if he is regular customer or not
				
				System.out.println("Enter Your Id:");int cId=sc.nextInt();
				//RegCustomer temp=new RegCustomer(101,"Shubham",2, 2);
				//System.out.println(temp+" "+memberList.equals(temp));
				if(!memberList.containsKey(cId)){
					System.out.println("Enter Name");String cName=sc.next();
					System.out.println("Enter Mobile No.");long cMobileNo=sc.nextLong();
					System.out.println("Do You want Prime MemberShip (y/n):");char regCustomer=sc.next().charAt(0);
					if(regCustomer=='y') {
						System.out.println("Enter Discount:");
						int splDiscount=sc.nextInt();
						RegCustomer customer=new RegCustomer(cId,cName,cMobileNo,splDiscount);
						memberList.put(cId,customer);
						//Adding Orders to List
						boolean keepShopping=true;
						while(keepShopping) {
							System.out.println("1.Keep Shopping.");
							System.out.println("2.Generate Bill.");
							int choice=sc.nextInt();
							switch(choice) {
								case 1:{
									company.shop();
									break;
								}
								case 2:{
									keepShopping=company.generateBill(cId,true);
									break;
								}
							}
						}
						}
											
					else {
						Customer customer=new Customer(cId,cName,cMobileNo);
						boolean keepShopping=true;
						while(keepShopping) {
							System.out.println("1.Keep Shopping.");
							System.out.println("2.Generate Bill.");
							int choice=sc.nextInt();
							switch(choice) {
								case 1:{
									company.shop();
									
									break;
								}
								case 2:{
									keepShopping=company.generateBill(cId,false);
									break;
								}
							}
						}
						//company.displayMembers();
					}
				}
				else {
					//goto 71;
					 Customer customer=memberList.get(cId);
					 System.out.println("Welcome "+customer.getCustomerName());
					 boolean keepShopping=true;
						while(keepShopping) {
							System.out.println("1.Keep Shopping.");
							System.out.println("2.Generate Bill.");
							int choice=sc.nextInt();
							switch(choice) {
								case 1:{
									company.shop();
									break;
								}
								case 2:{
									keepShopping=company.generateBill(cId,true);
									break;
								}
								default:{
									System.out.println("Please Enter Correct Choice!");
									break;
								}
							}
						}
				}
				//System.out.println("Welcome "+customer.getCustomerName());
				
				break;
			}
			case 2:{
				System.out.println("In 2");
				System.out.println("Enter Item Id:");int itemId=sc.nextInt();
				System.out.println("Enter Item Name");String itemName=sc.next();
				System.out.println("Enter Item Price");int itemPrice=sc.nextInt();
				System.out.println("Enter Quantity:");int itemQuanity=sc.nextInt();
				Item item=new Item(itemId,itemName,itemPrice,itemQuanity);
				company.addItem(item);
				break;
			}
			case 3:{
				System.out.println("Here's your Revenue for the day:");
				company.getTotalWorthOfOrdersPlaced();
				System.out.println("Thank you!");
				flag=false;
				break;
			}
			default:{
				System.out.println("Please Enter Correct Choice!");
				break;
			}
			}
		}
	}
 	
}
