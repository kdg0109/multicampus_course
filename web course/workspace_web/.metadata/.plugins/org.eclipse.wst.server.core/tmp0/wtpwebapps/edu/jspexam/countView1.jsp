<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.CountVO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<body>
	<h2>request scope 객체 공유</h2>
	<hr>
<%
	CountVO vo = (CountVO)request.getAttribute("count1");
%>
	<h2>추출된 카운트 값 : <%= vo.getNumber() %></h2>
</body>
</html>