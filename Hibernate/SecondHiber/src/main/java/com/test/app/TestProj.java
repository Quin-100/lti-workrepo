package com.test.app;

import java.sql.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.lti.model.Module;
import com.lti.model.Project;
import com.lti.model.School;
import com.lti.model.Task;

import hibernate.util.HibernateUtil;

public class TestProj {
	
	public static void main(String[] args) {
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();		
		
		Project p1=new Project();
		p1.setStartdate(Date.valueOf("2018-04-03"));
		p1.setTitle("Banking");
	
		int id =  (Integer) session.save(p1);
		
		Module m1=new Module();
		m1.setProjectid(id);
		m1.setModuleName("Withdrawal");
		
		session.save(m1);
		
		Task t1=new Task();
		t1.setProjectid(id);
		t1.setModuleName(m1.getModuleName());
		t1.setTaskName("Inheritance");
		
		session.save(t1);
		
		Project p2=new Project();
		p2.setStartdate(Date.valueOf("2017-05-02"));
		p2.setTitle("ECommerce");
		
		int id2 =  (Integer) session.save(p2);
	
		Module m2=new Module();
		m2.setProjectid(id2);
		m2.setModuleName("Shpping Cart");
		
		session.save(m2);
		
		Task t2=new Task();
		t2.setProjectid(id2);
		t2.setModuleName(m2.getModuleName());
		t2.setTaskName("Documentation");
		
		session.save(t2);		
	
		System.out.println("Project data saved.....");
		System.out.println("Transaction committing.....");		
		tx.commit();	
			
		Query query = session.createQuery("from Project p");
		List<Project>	c = query.list();	
		for(Project cust : c)
		{
			System.out.println(cust);
		}   		
	
		
		System.out.println("Closing session.....");			
		session.close();
		
		
	}

}
