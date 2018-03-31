<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.vo.VisitorVO" import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<body>
	<h1>방명록 리스트</h1>
	<hr>
<%

	String type = (String)request.getAttribute("type");
	if(type.equals("select")){
		String isNaA =  (String)request.getAttribute("isNaA");
		
		if(isNaA.length() > 1){
%>
		<h3><%= isNaA  %></h3>
<%
		}else{
			ArrayList<VisitorVO> list = (ArrayList<VisitorVO>)request.getAttribute("arrayList");
%>
			<table border="1">
<%
			for(VisitorVO vo : list){
%>
			<tr>
				<td><%= vo.getName()%></td>
				<td><%= vo.getWriteDate()%></td>
				<td><%= vo.getMemo()%></td>
			</tr>
<%
			}
%>
			</table>
<%
		}
%>
		<hr><a href='/mvc/htmlexam/visitor.html'>방명록 쓰기</a><br>
		<form method="get" action="/mvc/visitor">
		<input type='search' name = "searchText" >
		<input type='submit' name="ok" value="검색">
		</form>

<%	
	}else if(type.equals("insert")){

		boolean result = (boolean)request.getAttribute("result");
		String name = (String)request.getAttribute("name");
		
		if(result) {
%>
			<h2><%= name %> 님의 글이 저장되었습니다. </h2>
<%
		}else{
%>
			<h2><%= name %> 님!! 오류가 발생했어요... </h2>
<%
		}
		%>
		<a href='/mvc/visitor'>방명록 리스트 보기</a><br>
		<form method="get" action='/mvc/visitor'>
		<input type='search'  id = "searchId" name = "searchText" >
		<input type='submit' name="ok" value="검색">
		<%
		
	}
%>	
	</form>
</body>
</html>