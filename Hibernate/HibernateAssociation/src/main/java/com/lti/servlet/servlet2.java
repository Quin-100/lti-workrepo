package com.lti.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.lti.model.manytomanyjointable.Reader;
import com.lti.model.manytomanyjointable.Subscription;
import com.lti.model.onetomanyjointable.EmployeeEntity;

import util.HibernateUtil;

public class servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	SessionFactory sf = HibernateUtil.getSessionFactory();
  
    public servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		
		Reader r1=new Reader();
		r1.setEmail("abc@gmail.com");
		r1.setFirstName("abc");
		
		Reader r2=new Reader();
		r2.setEmail("def@gmail.com");
		r2.setFirstName("def");
		
		Reader r3=new Reader();
		r3.setEmail("ghi@gmail.com");
		r3.setFirstName("ghi");	
		
		Subscription s1=new Subscription();
		s1.setTitle("sub1");
		
		Subscription s2=new Subscription();
		s2.setTitle("sub2");

		Subscription s3=new Subscription();
		s3.setTitle("sub3");
		
		r1.setSubsList(Arrays.asList(s1,s2,s3));
		r2.setSubsList(Arrays.asList(s2,s3));
		r3.setSubsList(Arrays.asList(s1,s3));
		
		session.save(r1);
		session.save(r2);
		session.save(r3);
		
		tx.commit();
		
		SQLQuery query = session.createSQLQuery("select r.readerId,firstName,s.title from Reader r  \r\n" 
		+ "inner join Reader_Sub rs on r.readerId= rs.ReaderId \r\n" 
				+ 	"inner join Subscription s on s.subscriptionId = rs.SubscriptionId");
		List<Reader> empList  = query.list();
		
		request.setAttribute("emplist", empList);
		request.getRequestDispatcher("data.jsp").forward(request, response);
		
		session.close();

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
