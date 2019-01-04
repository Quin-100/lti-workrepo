package com.lti.test;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.lti.model.AccountEntity;
import com.lti.model.EmployeeEntity;

import util.HibernateUtil;

public class TestEmpAcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		EmployeeEntity emp = new EmployeeEntity("Amit","Bhadana");
		AccountEntity acc = new AccountEntity("1234567891");
		emp.setAccountEntity(acc);
		
		session.save(acc);
		session.save(emp);
		
		
		tx.commit();
		
		
		Query query = session.createQuery("from EmployeeEntity");
		List<EmployeeEntity> empList = query.list();
		
		for(EmployeeEntity employee : empList) {
			System.out.println(employee);
		}
		
		session.close();
	}

}
