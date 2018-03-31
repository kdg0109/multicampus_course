<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.vo.MemberVO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
<style>
	h1 {
		font-size : 3em;
	}
</style>
</head>
<body>
	<h1>★★회원 정보(스크립팅)★★</h1>
	<hr>
<%
	MemberVO vo = (MemberVO)request.getAttribute("member1");
%>
	<ul>
	<li>회원 이름 : <%= vo.getName() %></li>
	<li>회원 계정 : <%= vo.getUserId() %></li>
	<li>회원 암호 : <%= vo.getUserPass() %></li>
	<li>회원 전화번호 : <%= vo.getTel() %></li>
	</ul>
	
	
	<h1>★★회원 정보(표준액션태그)★★</h1>
	<hr>
	<jsp:useBean id="member1" class="model.vo.MemberVO" scope="request"/>
	<ul>
	<li>회원 이름 : <jsp:getProperty name="member1" property="name" /></li>
	<li>회원 계정 : <jsp:getProperty name="member1" property="userId" /></li>
	<li>회원 암호 : <jsp:getProperty name="member1" property="userPass" /></li>
	<li>회원 전화번호 : <jsp:getProperty name="member1" property="tel" /></li>
	</ul>
	
	
	
	
	<h1>★★회원 정보(EL)★★</h1>
	<hr>
	<ul>
	<li>회원 이름 : ${ requestScope.member1.name }</li>
	<li>회원 계정 : ${ requestScope.member1.userId }</li>
	<li>회원 암호 : ${ requestScope.member1.userPass }</li>
	<li>회원 전화번호 : ${ requestScope.member1.tel }</li>
	</ul>
</body>
</html>