<%@ page import="java.time.LocalDateTime" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<h1> 
Hello My name is :
${name}
</h1>
<h1>
This is Marks page
</h1>
<h1>
my rollnumber is 
<%-- <%=name %> --%>
${name}
</h1>
<h1>
Date and time is <%-- <%=time.toString()%> --%>
${time}
</h1>
<hr><br><br>

<h1>${marks }</h1>
<c:forEach var ="item" items="${marks}">
<h1>Mark= ${item}</h1>
</c:forEach>
</body>
</html>