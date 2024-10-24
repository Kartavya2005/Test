<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.jsp" %>
<h1>Registration</h1>
<form action="Registration" method="post">
<input type="text" name="ename" placeholder="Emp Name" /><br/><br/>
<input type="text" name="ecity" placeholder="Emp City" /><br/><br/>
<input type="text" name="emob" placeholder="Emp Mob" /><br/><br/>
<input type="text" name="unm" placeholder="User Name" /><br/><br/>
<input type="password" name="pw" placeholder="pw" /><br/><br/>
<input type="submit" value=" Reg " />
</body>
</html>