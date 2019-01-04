package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	 
	private static final SessionFactory sessionFactory;
	static {
		 try {
		 sessionFactory=new Configuration().configure().buildSessionFactory();
		 
		 }
		 catch(Throwable ex)
		 {
			 System.err.println("Session Factory creation Failed"+ex);
			 throw new ExceptionInInitializerError(ex);
			 
		 }
		       
	}
	
	public static SessionFactory getSessionFactory() {

		   return sessionFactory;
	}
		
		
		
		
		
	}
	
	


