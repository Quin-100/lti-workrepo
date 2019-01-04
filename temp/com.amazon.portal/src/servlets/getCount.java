package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/getCount")
public class getCount extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Cookie cookie;
   private static int ctr = 0;
    public getCount() {
        super();
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*String name = cookie.getName();
		if(name != null) {
			if(cookie.getName().equals("HitCount")) {
				ctr = Integer.parseInt(cookie.getValue()) ;
				cookie.setValue(String.valueOf(ctr++));
			}
		}		
		else {
			cookie = new Cookie("HitCount","1");
		}*/
		ctr++;
		response.setContentType("text/html");	
		//request.setAttribute("HitCount", cookie.getValue());
		request.setAttribute("HitCount", ctr);
		 request.getRequestDispatcher("hitCount.jsp").forward(request, response); 
		//System.out.println(cookie.getName() +"  --"+ cookie.getValue());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}

}
