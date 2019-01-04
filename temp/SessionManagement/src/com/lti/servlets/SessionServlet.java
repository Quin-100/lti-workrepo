package com.lti.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;


public class SessionServlet extends HttpServlet {
	
       private static User user;
       private static HttpSession session;
   
    public SessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		/*session = request.getSession(true);
		System.out.println(session);
		PrintWriter out = response.getWriter();
		out.println("I am from session servlet");
		String uname = request.getParameter("username");
		String password = request.getParameter("password");		
		
		user=new User(uname,password);
		
		session.setAttribute("sessionuser", user);*/
		
	//	System.out.println("Hiiiii222");
		
		request.getRequestDispatcher("new.jsp").include(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
