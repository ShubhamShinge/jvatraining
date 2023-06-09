package com.training.galaxe.config;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.training.galaxe.model.Contract_Employee;
import com.training.galaxe.model.Employee;
import com.training.galaxe.model.Product;
import com.training.galaxe.model.Regular_Employee;
 
public class HibernateUtil {
	
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {

		Configuration configuration = new Configuration();

//		Hibernate settings equivalent to hibernate.cfg.xml's properties
		Properties settings = new Properties();
		settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		settings.put(Environment.URL, "jdbc:mysql://localhost:3306/galaxe?useSSL=false");
		settings.put(Environment.USER, "root");
		settings.put(Environment.PASS, "root");
		settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");

		settings.put(Environment.SHOW_SQL, "true");

		settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

		settings.put(Environment.HBM2DDL_AUTO, "update");

		configuration.setProperties(settings);

		// ***
		configuration.addAnnotatedClass(Product.class);
		configuration.addAnnotatedClass(Employee.class);
		configuration.addAnnotatedClass(Contract_Employee.class);
		configuration.addAnnotatedClass(Regular_Employee.class);

		// required for mysql 8
		
		  ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder() //
		  .applySettings(configuration.getProperties()).build(); // sessionFactory =
		  configuration.buildSessionFactory(serviceRegistry);
		 		 
		 //mySQL5
		sessionFactory = configuration.buildSessionFactory();

		return sessionFactory;

	}
}