package hibernate.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import hibernate.model.Person;
import hibernate.model.PersonDetail;
import hibernate.util.HibernateUtil;

public class addPerson extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private SessionFactory sf = HibernateUtil.getSessionFactory();
    private Session session;
    
    public addPerson() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.setName(request.getParameter("name"));
		
		PersonDetail pd = new PersonDetail();
		pd.setAadhar(request.getParameter("aadhar"));
		pd.setSalary(Float.parseFloat(request.getParameter("salary")));
		
		p1.setPdetails(pd);                //till this time p1 is transient ,not attached to  any session/persistence mechanism
		session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		
		session.save(p1);  //p1 will have persistence state 
		tx.commit();
		session.close();  //p1 will be in detached state
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
