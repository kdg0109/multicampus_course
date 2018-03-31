<!-- 파일명 : greeting.jsp -->
<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<HTML>
<HEAD>
<META charset="UTF-8">
<TITLE>감사인사</TITLE>
</HEAD>
<BODY>
<%
if(request.getParameter("country").equals("korea")) {
%>
   <%= "감사합니다." %>
<%	
}
else if(request.getParameter("country").equals("english")) {
%>
   <%= "Thank You." %>
<%
}
else if(request.getParameter("country").equals("japan")) {
%>
    <%= "ありがとうございます" %>
<%
}
%>
</BODY>
</HTML>
