<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head></head>
<body>
<%@include file="header.jsp"%>
<h1>This is home page</h1>
<h1>Called by index controller</h1>
<h1>url /home</h1>

<%
	String name= (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	List<String> friends = (List<String>) request.getAttribute("f");
	
%>
<%
if (friends != null) {
    for (String s : friends) {
%>
        <h1><%=s%></h1>
<%
    }
} else {
%>
<%
}
%>

</body>
</html>