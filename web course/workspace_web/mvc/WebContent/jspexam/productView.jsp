<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.vo.ProductVO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
<style>
	a {
		text-decoration: none;
		background: linear-gradient(to right, orange, pink, yellow); 
	}
</style>
</head>
<body>

<%
	ProductVO vo = (ProductVO)session.getAttribute("proVO");
	String delete =  (String)session.getAttribute("delete");
	if(delete != null){
%>
	<h1>선택된 정보는 다음과 같습니다.</h1>
	<hr>
	<p>선택된 사과의 개수 : <%= vo.getCntApple() %></p>
	<p>선택된 바나나의 개수 : <%= vo.getCntBanana()%></p>
	<p>선택된 한라봉의 개수 : <%= vo.getCntHalabong()%></p>
<%
	}else{
%>
		<h1>모두 삭제했습니다!!</h1>
<%
	}
%>
	<hr>
	<a href="/mvc/htmlexam/product.html" >상품 선택화면</a>
</body>
</html>