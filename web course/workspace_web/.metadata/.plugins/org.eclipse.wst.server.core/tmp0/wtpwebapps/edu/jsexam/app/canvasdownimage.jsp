<%@ page language="java" contentType="text/plain; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.io.*"%>
<%
	String path = "C:/uploadtest/canvastest/";
    FileReader reader = new FileReader(path+"test.png");
    char[] buffer = new char[(int)(new File(path+"test.png").length())];
    reader.read(buffer);
    out.println(buffer);
	reader.close();
%>