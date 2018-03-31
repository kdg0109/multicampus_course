<%@ page contentType="text/html; charset=utf-8" import="java.time.LocalDate"%>
<!DOCTYPE html>
<html>
<HEAD>
<meta charset="UTF-8">
<TITLE>JSP 예제</TITLE>
</HEAD>
<BODY>
<%
	LocalDate ld = LocalDate.now();
%>
<%= ld.getYear() %> 년
<%= ld.getMonthValue() %> 월
<%= ld.getDayOfMonth() %> 일
</BODY>
</HTML>