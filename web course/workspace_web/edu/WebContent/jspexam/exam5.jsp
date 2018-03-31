<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<body>
	<h1>선언문 태그 학습</h1>
	<hr>
	<%!
		int multiply(int n1, int n2) {
			return n1*n2;
		}
	%>
	<% 
		String p1 = request.getParameter("num1");
		String p2 = request.getParameter("num2");
		int result = 0;
		if( p1 != null && p2 != null) {
			result = multiply(Integer.parseInt(p1), Integer.parseInt(p2));
	%>
			<h2><%= "연산 결과 : " + result %></h2>
	<%
		}else {
	%>
			<h2>num1=xx&amp;num2=xx 쿼리를 전달하세요</h2>
	<%
		}
	%>
</body>
</html>