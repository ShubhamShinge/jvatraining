package com.training.galaxe.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.training.galaxe.config.HibernateUtil;
import com.training.galaxe.model.Product;

public class ProductDAOImpl implements ProductDAO {

	public ProductDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveProduct(Product product) {
		// TODO Auto-generated method stub
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		s.save(product);
		t.commit();
		
		s.close();
		sf.close();
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		s.update(product);
		t.commit();
		
		s.close();
		sf.close();
	}

	@Override
	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
		Product product=new Product();
		product.setProductId(productId);
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		s.delete(product);
		t.commit();
		
		s.close();
		sf.close();
	}

	@Override
	public Product getProduct(int productId) {
		// TODO Auto-generated method stub
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();//we need to start transaction wherever we will modify data
		//return s.load(Product.class,productId);
		Product result=new Product();//new Object (phase)
		result.setPrice(10);//It will change in only result as it is not synced with databses.
		//This will sync product with row in databases....meaning change in this product will affect in the databse before closing.
		result=s.get(Product.class,productId);//get method will shift phase new object to transient object (e.g.-- get/load/find/iterate)
		
		result.setPrice(12345);//It will change in both result and database.
		System.out.println(result);
		t.commit();
		s.close();
		result.setPrice(3000);//It will change only in result.
		return result;//will return with value 3000.
	}

	@Override
	public List<Product> getProduct() {
		// TODO Auto-generated method stub
		//return session.createQuery("SELECT a FROM Student a", Student.class).getResultList(); 
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session s=sf.openSession();
		
			//JPQL Case Sensitive.
			//return s.createQuery("SELECT a FROM Product a",Product.class).getResultList();
	
		//Another method
		Query q=s.createQuery("FROM Product");
		List<Product> productArray=q.list();
		s.close();
		
		return productArray;
	}

	@Override
	public List<Product> searchProduct(String productName) {
		// TODO Auto-generated method stub
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session s=sf.openSession();
		
		//Using Query
//		Query query=s.createQuery("FROM Product WHERE productName='"+productName+"'");
//		List<Product> productArray=query.list();
//		return productArray;
		
	
		Criteria c=s.createCriteria(Product.class);
		return c.add(Restrictions.eq("productName", productName)).list();
	}

	@Override
	public List<Product> searchProduct(int min, int max) {
		// TODO Auto-generated method stub
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session s=sf.openSession();
		
		
//		Query query=s.createQuery("FROM Product WHERE price>="+min+"AND price<="+max);
//		List<Product> productArray=query.list();
//		return productArray;
		
		//Simpler Way-----> Another Way Using Criteria
		Criteria criteria=s.createCriteria(Product.class);//will return all data in objects format
		List<Product> productAll=criteria.list(); //Will convert all product data into list
		
		List<Product> productWithinRange=criteria.add(Restrictions.between("price",min, max)).list(); //Will Give Product List within Range
		return productWithinRange;
		
		
	}

	@Override
	public List<Product> checkStockStatus(int minStock) {
		// TODO Auto-generated method stub
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session s=sf.openSession();
//		Using Queries
//		Query query=s.createQuery("FROM Product WHERE quantityOnHand>="+minStock);
//		List<Product> productArray=query.list();
//		return productArray;
		
		Criteria criteria=s.createCriteria(Product.class);
		List<Product> productArray=criteria.add(Restrictions.ge("quantityOnHand",minStock)).list();
		return productArray;
	}

	@Override
	public boolean isProductExist(int productId) {
		// TODO Auto-generated method stub
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session s=sf.openSession();
		
		//return s.load(Product.class,productId);
		
		Product result=s.get(Product.class,productId);
		s.close();
		if(result==null)
			return false;
		else
			return true;
	}
	
	

}
