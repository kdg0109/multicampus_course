<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<body>
	<h1>Query 문자열 처리 JSP 테스트</h1>
	<hr>
	<% request.setCharacterEncoding("utf-8"); %>
	<% String name = request.getParameter("guestName"); %>
	<h3>당신의 이름은 <%= name %>입니다.. </h3>
	<h3>당신이 좋아하는 숫자는 <%= request.getParameter("num") %>입니다...</h3>
</body>
</html>