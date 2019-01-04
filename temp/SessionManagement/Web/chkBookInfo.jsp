<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="book1" class="model.Book" scope="session"></jsp:useBean>
<jsp:setProperty name="book1" property="name" param="name"/>
<jsp:setProperty name="book1" property="author" param="author"/>
<jsp:setProperty name="book1" property="price" param="price"/>
<a href="SessionServlet4">Click here to chk Book Info </a>
</body>
</html>
