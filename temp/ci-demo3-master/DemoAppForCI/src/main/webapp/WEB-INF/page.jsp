<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome to Site</title>
</head>
<body>
<h2>${requestScope.msg }</h2>
<p>
Welcome ${requestScope.user },<br/>
Time on Server ${requestScope.date}
</p>
</body>
</html>
