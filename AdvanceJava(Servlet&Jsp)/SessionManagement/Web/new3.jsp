<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user1" scope="session" class="model.User"></jsp:useBean>
<h1>Welcome : <jsp:getProperty property="username" name="user1"/></h1>
<h1>your password is  : <jsp:getProperty property="password" name="user1"/></h1>

</body>
</html>