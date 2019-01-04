package lti.com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;


@WebServlet("/SessionServletLogin")
public class SessionServletLogin extends HttpServlet {
	
	
    private static HttpSession session;
    private User user,user1;
   
    public SessionServletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		session = request.getSession(true);
		System.out.println(session);
		PrintWriter out = response.getWriter();
		
		String uname = request.getParameter("username");
		String password = request.getParameter("password");
		
		user=new User(uname,password);

		session.setAttribute("sessionuser", user);
		
		user1=(User)session.getAttribute("sessionuser");
		
		out.println("Welcome : "+user1.getUsername());
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
