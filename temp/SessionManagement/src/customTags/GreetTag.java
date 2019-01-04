package customTags;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class GreetTag extends SimpleTagSupport{

	StringWriter writer = new StringWriter();
	public void doTag() throws JspException,IOException{
		JspWriter out = getJspContext().getOut();
		out.println("<h1 style='color:red'>Greetings</h1>");
		
		getJspBody().invoke(writer);
		getJspContext().getOut().println("<h2 style='height:40px; width:300px; border:1px solid red'>"+writer.toString()+"</h2>"); 
	}
}
