package model;


import java.sql.Date;
import java.util.GregorianCalendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		
		Configuration config=new Configuration();
		SessionFactory sfactory=config.configure().buildSessionFactory();
		Session session=sfactory.openSession();
		Transaction tx=session.beginTransaction();
		
		e1.setEmail("mm@gmail.com");
		e1.setEmp_joinDate(new GregorianCalendar(2018,10,3));
		e1.setEmp_login(Date.valueOf("2018-10-03"));
		e1.setName("Mina");
		e1.setPassword("kumari");
		e1.setPermanent(true);
		
		int id = (int) session.save(e1);	

		System.out.println("Id of the newly created object : " +id);
		tx.commit();
		session.close();
		/*
		e1.setEmail("nn@gmail.com");
		e1.setEmail("oo@gmail.com");
		
		Session session1 = sfactory.getCurrentSession();	
		
		Employee e2 = session1.load(Employee.class, id);
		System.out.println("Before changes : " +e2);		
	    session1.saveOrUpdate(e1);
	  
	    System.out.println("After changes : ");		
	    Employee e3 = session1.load(Employee.class, id);
		System.out.println("Before changes : " +e3);	
		
		session1.close(); */

	}

}
