<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file ="header.jsp" %>
<h2>Login</h2>
    <form action="/login" method="post"></form>
        <div>
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>
        </div>
        <div>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
        </div>
        <div>
            <input type="submit" value="Login">
        </div>
        <div>
        	<label>if not an Existing user then <a href="Registration">Register</a> first to Move Forward<br></label>
        </div>
</body>
</html>