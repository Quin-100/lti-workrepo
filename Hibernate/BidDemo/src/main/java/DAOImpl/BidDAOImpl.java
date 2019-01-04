package DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import IDAO.IBidDAO;
import hibernate.util.HibernateUtil;
import model.Bid;


public class BidDAOImpl implements IBidDAO{
	
	SessionFactory sf = HibernateUtil.getSessionFactory();

	public void addBid(Bid bid) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();		
		
		int id = (Integer) session.save(bid);		
	
		System.out.println("Bid Successfully added with BidId : "+id);
		tx.commit();
		session.close();
		
	}

	public void updateBid(Bid bid , int bidId) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();	
		
		Transaction tx1 = session.beginTransaction();
		
		Bid bid1 = (Bid) session.load(Bid.class,bidId);
		bid.setBidId(bidId);
		bid1 = bid;
		session.saveOrUpdate(bid1);
		tx1.commit();
		session.close();
	}

	public void deleteBid(int bidId) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();	
		
		Transaction tx1 = session.beginTransaction();
		
		Bid bid1 = (Bid) session.load(Bid.class,bidId);	
		session.delete(bid1);
		
		tx1.commit();
		session.close();
	}

	public List<Bid> allBid() {
		// TODO Auto-generated method stub
		Session session = sf.openSession();	
		
		Transaction tx = session.beginTransaction();
		
		Query query = session.createQuery("from Bid");
		List<Bid> c1 = query.list();	
		
		return c1;
	}

	public Bid allBidById(int bidId) {
		// TODO Auto-generated method stub
		List<Bid> c = new ArrayList<Bid>();
		Bid b = new Bid() ;
		Session session = sf.openSession();	
		
		Transaction tx = session.beginTransaction();	
		
		Criteria custcriteria=session.createCriteria(Bid.class);
		custcriteria.add(Restrictions.eq("bidId", bidId));
		c=custcriteria.list();	
		
		for(Bid cust : c)
		{
			b = cust;
		}  
		return b;
	}
	

}
