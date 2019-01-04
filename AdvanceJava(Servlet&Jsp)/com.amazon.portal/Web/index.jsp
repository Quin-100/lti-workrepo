<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="model.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br>
This is one way to see the username of User obj
${ requestScope.UserObj.username }


<a href="preRegister">Register</a>
<br><br>
<form action="LoginServlet"  method="POST">
 Username<input type="text" name="username"><br><br>
 Password<input type="password" name="password"><br><br>
 
  <input type="submit" value="Submit"><br><br>
  
</form>

<a href="getHeaders">GetHeaders</a>

<br>
<br>

<a href="getCount">Page Hits</a>

</body>
</html>