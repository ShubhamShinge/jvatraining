package com.training.galaxe.app;

import java.util.List;
import java.util.Scanner;

import com.training.galaxe.dao.ProductDAO;
import com.training.galaxe.dao.ProductDAOImpl;
import com.training.galaxe.model.Product;

public class ProductApp {
	Scanner sc=new Scanner(System.in);
	int productId,price,quantityOnHand;
	String productName;
	ProductDAO productDAO=new ProductDAOImpl();
	public ProductApp() {
		// TODO Auto-generated constructor stub
	}
	public void startProductApp() {
		boolean flag=true;
		while(flag) {
		System.out.println("\n##########Welcome User##########");
		System.out.println("1.Add New Product.");
		System.out.println("2.Update Product.");
		System.out.println("3.Delete Product.");
		System.out.println("4.Search Product.");
		System.out.println("5.Get Products List.");
		System.out.println("6.Get Products List By Name.");
		System.out.println("7.Get Products List Within Price Range.");
		System.out.println("8.Get Products In Stock.");
		System.out.println("9.E X I T");
		System.out.println("Enter Your Choice:");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("*****Welcome To Add Product.*****");
			System.out.println("Enter Product Details");
			System.out.print("Enter Product Id:");productId=sc.nextInt();
			if(productDAO.isProductExist(productId)) {
				System.out.println("Product With productId:"+productId+" Already Exists;Hence Cannot Be Added.");
				break;
			}
			System.out.print("Enter Product Name:");productName=sc.next();
			System.out.print("Enter Product Price:");price=sc.nextInt();
			System.out.println("Enter Product Quantity:");quantityOnHand=sc.nextInt();
			
			Product product=new Product(productId,productName,price,quantityOnHand);
			productDAO.saveProduct(product);
			System.out.println("Product with name: "+productName+" Added SuccesFully!!");
			break;
		}
		case 2:{
			System.out.println("*****Welcome To Update Product*****");
			System.out.println("Enter Product Details");
			System.out.print("Enter Product Id to Update:");productId=sc.nextInt();
			if(!productDAO.isProductExist(productId)) {
				System.out.println("Product With productId:"+productId+" Does Not Exists;hence Cannot Be Updated.");
				break;
			}
			System.out.print("Enter New Product Name:");productName=sc.next();
			System.out.print("Enter New Product Price:");price=sc.nextInt();
			System.out.println("Enter New Product Quantity:");quantityOnHand=sc.nextInt();
			
			Product product=new Product(productId,productName,price,quantityOnHand);
			productDAO.updateProduct(product);
			System.out.println("Product with name: "+productName+" Updated SuccesFully!!");
			break;
		}
		case 3:{
			System.out.println("*****Welcome To Delete Product*****");
			System.out.println("Enter Product Id To Delete:");
			productId=sc.nextInt();
			if(!productDAO.isProductExist(productId)) {
				System.out.println("Product With productId:"+productId+" Does Not Exists;Hence Cannot Be Deleted.");
				break;
			}
			productDAO.deleteProduct(productId);
			System.out.println("Product Deleted Succesfully");
			break;
		}
		case 4:{
			System.out.println("*****Welcome To Get Products.*****");
			System.out.println("Enter Id of Product You Want:");
			productId=sc.nextInt();
			Product product=productDAO.getProduct(productId);
			System.out.println(product);
			break;
		}
		case 5:{
			System.out.println("*****Getting All The Products Info.*****");
			List<Product>productArray=productDAO.getProduct();
			System.out.println("Following is List of Products:");
			for(Product p:productArray)
				System.out.println(p);
			break;
		}
		case 6:{
			System.out.println("*****Getting All Products With Same Name*****");
			System.out.println("Enter Name of Product You Want:");
			productName=sc.next();
			List<Product>productArray=productDAO.searchProduct(productName);
			System.out.println("Following is List of Products:");
			for(Product p:productArray)
				System.out.println(p);
			break;
			
		}
		case 7:{
			System.out.println("*****Getting All Products Within Range*****");
			System.out.println("Enter Min Range of Price You Want:");
			int min=sc.nextInt();
			System.out.println("Enter Max Range of Price You Want:");
			int max=sc.nextInt();
			List<Product>productArray=productDAO.searchProduct(min,max);
			System.out.println("Following is List of Products:");
			for(Product p:productArray)
				System.out.println(p);
			break;
			
		}
		case 8:{
			System.out.println("*****Getting All Products Within Stock*****");
			System.out.println("Enter Min Range of Stock You Want:");
			int minStock=sc.nextInt();
			List<Product>productArray=productDAO.checkStockStatus(minStock);
			System.out.println("Following is List of Products:");
			for(Product p:productArray)
				System.out.println(p);
			break;
		}
		case 9:{
			System.out.println("Data Saved");
			flag=false;
			break;
		}
		}
		}
	}

}
