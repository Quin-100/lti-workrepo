<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<%@page  import="java.util.*" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<sql:setDataSource var="ds" driver="oracle.jdbc.driver.OracleDriver"
 url="jdbc:oracle:thin:@localhost:1521:xe" user="hr" password="hr" scope="session"/>
    <!-- for selection -->
 <sql:query var="query" sql="select first_name,salary from employees" 
  dataSource="${ds}" scope="session" startRow="1" maxRows="10">
  </sql:query>
  
  <c:forEach items="${query.rows}" var="row"> 
 <c:out value="${row.first_name}"></c:out> 
  <c:out value="${row.salary}"></c:out> 
</c:forEach> 
<br><br>
  <!--  selection end       -->
  
  <!-- for inserion -->
<%--   <sql:update var="query1" sql="insert into userInfo values('Winni99','123')" 
   dataSource="${ds}" scope="session" >   
  </sql:update>
   <sql:query var="query2" sql="select * from userInfo where username='Winni99'" 
  dataSource="${ds}" scope="session" >
  </sql:query>
  
  <c:forEach items="${query2.rows}" var="row2">
  <c:out value="${row2.username}"></c:out>
  <c:out value="${row2.password}"></c:out>
  </c:forEach> --%>
<!--  insertion end       -->

<c:set var="str" value="Winni99-hackermaan" scope="session"></c:set>
<c:if test="${fn:contains(str,'hack')}" >
	<br><br>
	<c:out value="Winni99 is a hackerman"></c:out>
</c:if>

</body>
</html>