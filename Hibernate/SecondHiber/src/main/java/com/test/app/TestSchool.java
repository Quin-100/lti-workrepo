package com.test.app;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.lti.model.Customer;
import com.lti.model.School;
import com.lti.model.SchoolDetail;

import hibernate.util.HibernateUtil;

public class TestSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		School school = new School("Podar International");
		SchoolDetail schooldetail = new SchoolDetail();
		schooldetail.setAddress("Malad");
		schooldetail.setStudentcount(15000);
		schooldetail.setPublicschool("false");
		school.setSchoolDetail(schooldetail);
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(school);
		System.out.println("Customer data saved.....");
		System.out.println("Transaction committing.....");		
		tx.commit();	
			
		Query query = session.createQuery("from School");
		List<School>	c = query.list();	
		for(School cust : c)
		{
			System.out.println(cust);
		}   		
	
		
		System.out.println("Closing session.....");			
		session.close();
		
	}

}
