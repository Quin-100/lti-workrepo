package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/getHeaders")
public class getHeaders extends HttpServlet {	
	private Enumeration<String> headerlist=null;
       private static PrintWriter out=null;
    
    public getHeaders() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		headerlist=request.getHeaderNames();
		//out=response.getWriter();
		HashMap<String, String> headerhash = new HashMap<>();
		while(headerlist.hasMoreElements()) {
			String header = headerlist.nextElement();
			String value = request.getHeader(header);			
			headerhash.put(header, value);		
		}				
		response.setContentType("text/html");	
		request.setAttribute("HeaderHash", headerhash);
		 request.getRequestDispatcher("header.jsp").forward(request, response); 
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
