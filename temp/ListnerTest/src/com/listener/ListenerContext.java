package com.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class ListenerContext
 *
 */
public class ListenerContext implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ListenerContext() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent contextevent)  { 
         // TODO Auto-generated method stub
    	contextevent.getServletContext().setAttribute("last_username","oracle");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent contextevent)  { 
         // TODO Auto-generated method stub
    	contextevent.getServletContext().setAttribute("username","java");
    }
	
}
