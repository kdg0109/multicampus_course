<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<body>
<h2>JSP에서의 멤버변수와 지역변수</h2>
<hr>
<%! int member_v = 0; %>	<!--  선언 (멤버변수)-->
<% int local_v = 0; %>	<!--  수행 (지역변수)	메서드 안에 작성할 수 있는 코드는 모두 가능!!!! 모두! -->
<h3>member_v : <%= ++member_v %></h3>	<!--  표현식 어떠한 식을 꼭 써야함. 이 식이 out.print의 아규먼트로 들어감-->
<h3>member_v : <%= ++local_v %></h3>	<!--  표현식11 -->
<h3>member_v : <%-- ++local_v --%></h3>
</body>
</html>