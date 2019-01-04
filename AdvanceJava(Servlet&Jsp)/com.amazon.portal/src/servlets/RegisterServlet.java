package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import utils.ConnectionManager;


@WebServlet({ "/RegisterServlet", "/register" })
public class RegisterServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;
	 private static Connection conn;       
     private static PreparedStatement ps = null;
     private static ResultSet result = null;
     private static String sql = "insert into users(username,password) values(?,?)";
     private static RequestDispatcher reqDisp = null;
     User user = new User();
     private static PrintWriter out = null;
     
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		conn = ConnectionManager.getConnection();		
		out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String password2 = request.getParameter("password2");
		if(password.equals(password2)) {
			//user = new User(username,password);	
			user.setUsername(username);
			user.setPassword(password);
			
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, user.getUsername());
				ps.setString(2, user.getPassword());
				
				int res = ps.executeUpdate();
				
				if(res == 1) {
					response.setContentType("text/html");	
					request.setAttribute("UserObj", user);
					out.println("You have successfully registered");	
					reqDisp = request.getRequestDispatcher("index.jsp");
					reqDisp.include(request, response); 
				}
				else {
					out.println("Some error in registration");		
					reqDisp = request.getRequestDispatcher("register.jsp");
					reqDisp.include(request, response); 
				}	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			out.println("Password don't match");		
			reqDisp = request.getRequestDispatcher("register.jsp");
			reqDisp.include(request, response); 
		}	
	}

}
