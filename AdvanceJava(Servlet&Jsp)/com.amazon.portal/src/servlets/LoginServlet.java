package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utils.ConnectionManager;

@WebServlet({ "/LoginServlet", "/login" })
public class LoginServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;
      private static Connection conn;       
      private static PreparedStatement ps = null;
      private static ResultSet result = null;
      private static String sql = "select * from users where username = ? and password = ?";
      private static RequestDispatcher reqDisp = null;
      
	//constructor should be public as tomcat creates a object
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
    	
    }	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		conn = ConnectionManager.getConnection();		
		
		try {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			
			result = ps.executeQuery();
			System.out.println("Hi2");
			while(result.next()) {
				
				request.setAttribute("req_user", username);
				reqDisp = request.getRequestDispatcher("success.jsp");
				reqDisp.forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
