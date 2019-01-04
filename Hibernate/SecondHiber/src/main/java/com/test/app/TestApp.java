package com.test.app;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.lti.model.Customer;

import hibernate.util.HibernateUtil;

public class TestApp {
	
	public static void main(String[] args) {
		/*AnnotationConfiguration acfg = new AnnotationConfiguration();
		acfg.configure().buildSessionFactory();
		acfg.addAnnotatedClass(Customer.class);*/
		
		Customer customer = new Customer("Mark Wiens","Thailand",230,30);
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		int id = (Integer) session.save(customer);
		System.out.println("Customer data saved.....");
		System.out.println("Transaction committing.....");		
		
		Customer customer1 = new Customer("Mark Wiens1","Thailand",1230,30);
		Customer customer2 = new Customer("Mark Wiens2","Thailand",2230,30);
		Customer customer3 = new Customer("Mark Wiens3","Thailand",230,30);
		Customer customer4 = new Customer("Mark Wiens4","Thailand",230,30);
		
		session.save(customer1);
		session.save(customer2);
		session.save(customer3);
		session.save(customer4);
		
		tx.commit();
		
		/*System.out.println("Before changes : ");		
		Query query = session.createQuery("from Customer");
		List<Customer>	c = query.list();	
		for(Customer cust : c)
		{
			System.out.println(cust);
		}   */
		
		List<Customer>	c = new ArrayList<Customer>();
		Criteria custcriteria=session.createCriteria(Customer.class);
		custcriteria.add(Restrictions.gt("creditScore", 1000));
		c=custcriteria.list();
	
		System.out.println("Customers having score greater than 1000");
		for(Customer cust : c)
		{
			System.out.println(cust);
		} 
		
		session.close();
		
		
		
		Session session1 = sf.openSession();	
		
		Transaction tx1 = session1.beginTransaction();
		
		Customer customer5 = (Customer) session1.load(Customer.class,customer.getCustId());

		customer5.setAddress("New York");
		customer5.setCreditScore(400);
		
		
	    session1.saveOrUpdate(customer5);
	  
	    System.out.println("After changes : ");	
	    Query query1 = session1.createQuery("from Customer");
		List<Customer>	c1 = query1.list();	
		for(Customer cust : c1)
		{
			System.out.println(cust);
		}    
	    tx1.commit();
		System.out.println("Closing session.....");			
		session1.close();
		
	}
}
