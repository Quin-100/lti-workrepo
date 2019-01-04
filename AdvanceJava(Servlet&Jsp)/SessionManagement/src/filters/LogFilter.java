package filters;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class LogFilter
 */
public class LogFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LogFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		String un = req.getParameter("username");
		String pw = req.getParameter("password");
		String host = req.getRemoteHost();
		String uri = req.getRequestURI();
		long time = System.currentTimeMillis();
		Date date = new Date(time);
		System.out.println("Values are : "+un + " " + host+" "+ uri + " "+ time +" "+date);
		
		if(un.equals("admin") && pw.equals("admin123"))
			chain.doFilter(request, response);
		else
			response.getWriter().println("<h2>Invalid Credentials</h2>");
			req.getRequestDispatcher("index.jsp").include(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
