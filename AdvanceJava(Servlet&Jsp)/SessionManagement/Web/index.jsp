<%@ page  language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<br><br>
<form action="SessionServlet"  method="POST">
 Username<input type="text" name="username"><br><br>
 Password<input type="password" name="password"><br><br>
 
  <input type="submit" value="Submit"><br><br>  
</form>
<a href="bookInfo.jsp">Click here to chk Book Info </a>

</body>
</html>