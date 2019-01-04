package com.lti.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.lti.model.onetomanyjointable.AccountEntity;
import com.lti.model.onetomanyjointable.EmployeeEntity;

//import com.lti.model.AccountEntity;
//import com.lti.model.EmployeeEntity;



import util.HibernateUtil;


public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	SessionFactory sf = HibernateUtil.getSessionFactory();
   
    public servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		EmployeeEntity emp = new EmployeeEntity();
		emp.setFirstName("Amar");
		emp.setLastName("Singh");
		
		List<AccountEntity> accList = new ArrayList<AccountEntity>();
		AccountEntity acc1 = new AccountEntity();		
		acc1.setAccNo("1357908642");
		accList.add(acc1);
		AccountEntity acc2 = new AccountEntity();		
		acc2.setAccNo("2468097531");	
		accList.add(acc2);
		
		emp.setAccountEntity(accList);
		
		session.save(emp);
		//session.save(accList);
		session.save(acc1);
		session.save(acc2);
		
		tx.commit();
		
		
		Query query = session.createQuery("from EmployeeEntity");
		List<EmployeeEntity> empList  = query.list();
		
		request.setAttribute("emplist", empList);
		request.getRequestDispatcher("data.jsp").forward(request, response);
		
		session.close();
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
