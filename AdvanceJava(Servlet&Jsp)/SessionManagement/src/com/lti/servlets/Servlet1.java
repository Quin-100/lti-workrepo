package com.lti.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet1 extends HttpServlet {
	
       
   
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = getInitParameter("username");
		String password = getInitParameter("password");
	
		
		Cookie cookie1 = new Cookie("name", username);
		response.addCookie(cookie1);
     
		
		PrintWriter out = response.getWriter();
		//out.println("Hello");
		out.println("<a href='Servlet2'>Click Here</a>");
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
