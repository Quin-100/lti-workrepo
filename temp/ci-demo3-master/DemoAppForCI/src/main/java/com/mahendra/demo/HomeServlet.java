package com.mahendra.demo;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String env;

	/**
	 * Default constructor.
	 */
	public HomeServlet() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		env = config.getServletContext().getInitParameter("ENVIORNMENT");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user = "Mahendra";
		Date date = new Date();
		request.setAttribute("user", user);
		request.setAttribute("date", date);
		request.setAttribute("msg", "You are in " + env + " enviornment!");

		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/page.jsp");
		view.forward(request, response);
	}

}
