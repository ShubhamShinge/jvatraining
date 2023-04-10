package com.training.galaxe;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.galaxe.app.ProductApp;
import com.training.galaxe.config.HibernateUtil;
import com.training.galaxe.model.Product;

public class Client {

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Product product = new Product(103,"Britania",20, 100);
		
//		SessionFactory sf=HibernateUtil.getSessionFactory();
//		Session s=sf.openSession();
//		Transaction t=s.beginTransaction();
//		s.save(product);
//		t.commit();
		
		
		
		System.out.println("Welcome To Shubham Store");
		ProductApp productapp=new ProductApp();
		productapp.startProductApp();
		
		
		System.out.println("Thank You...Visit Again!!!");
	}

}
