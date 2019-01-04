<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.lti.model.EmployeeEntity"%>
<%@page import="java.util.*" %>
<%@page import="com.lti.model.manytomanyjointable.Reader" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- Emp Data:
<%List<EmployeeEntity>empList=(List<EmployeeEntity>)request.getAttribute("emplist");%>
<%=empList %> --%>

Reader Subscription info:
<%List<Reader>readerList=(List<Reader>)request.getAttribute("emplist");%>
<%=readerList.toString() %>

</body> 
</html>