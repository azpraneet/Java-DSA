

<%@page import="java.sql.Date"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="t1.txt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% for(int i=0;i<5;i++){
		out.println(i);
	} %>
	<%! public int x=10;
		public static int y=20;
		public int test(){
			return 100;
		}
	%>
	<%
		out.println(x);
		out.println(y);
		out.println(test());
	%>
	<%=x %>
	<%=y %>
	<%=test() %>
	<%= new File("F:\\test\\test1.txt") %>
	
</body>
</html>