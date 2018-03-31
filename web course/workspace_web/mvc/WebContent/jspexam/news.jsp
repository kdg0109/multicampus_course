<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.vo.NewsVO" import="model.dao.NewsDAO" import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="http://code.jquery.com/jquery-2.1.3.min.js"></script>
<title>커넥티드카 게시판입니다.</title>
<style>

</style>
</head>
<body>
	<h1>뉴스 게시판</h1>
	<hr>
<%

	String action = (String)request.getAttribute("action");
	if((String)request.getAttribute("action") == null){
		action = "";
	}
	ArrayList<NewsVO> list = (ArrayList<NewsVO>)request.getAttribute("listAll");
%>

	<table border="1">
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>작성일</th>
		<th>조회수</th>
	</tr>
<%
	for(NewsVO vo : list){
%>
	<tr id="<%= vo.getId() %>">
		<td><%= vo.getId()%></td>
		<td><%= vo.getTitle()%></td>
		<td><%= vo.getWriter()%></td>
		<td><%= vo.getWritedate()%></td>
		<td><%= vo.getCnt()%></td>
	</tr>
<%
	}
%>
	</table>

<%  
	NewsVO vo = null;
	if(action.equals("read")){
		vo = (NewsVO)request.getAttribute("listOne");
	}
%>
	<input type='button' name = "newsSubmit" id="newsSubmit" value="뉴스 작성">
	
	<form method="post"  id = "displaycheck" style='display:none'">
		<input type="hidden" name="action" value="insert">
		<input type="text" name = "writer" placeholder="작성자명을 입력해주세요."
		
		<%
		if(action.equals("read")){
			%>value="<%= vo.getWriter() %>"<%
		} 
		%>
		
		><br/>
		<input type="text" name = "title" placeholder="제목을 입력해주세요." required
		<%
		if(action.equals("read")){
			%>value="<%= vo.getTitle() %>"<%
		} 
		%>
		><br/>
		<textarea  name="content" placeholder="내용을 입력해주세요." rows="10" cols="50" >
		<%if(action.equals("read")){%><%=vo.getContent()%><%}%></textarea><br>
      	<input type="button" name="ok" id="insert" value="저장">
      	<input type="reset" name="clear" id="clear" value="재작성">
      	<input type="button" name="cancle" id="cancle" value="취소">
      	<input type="button" name="cancle1" id="cancle1" value="확인" style='display:none'">
      	<input type="button" name="update" id="update" value="수정" style='display:none'">
      	<input type="button" name="delete" id="delete" value="삭제" style='display:none'">
      	<input type="hidden" id="<% if(vo != null)%><%= vo.getId() %>" style='display:none'">
      	<input type="hidden" id="<% if(vo != null)%><%= vo.getWritedate() %>" style='display:none'">
	</form>
	<%  
%>
<script>
<%
if(vo!= null){
%>
	alert("<%=vo.getId()%>");
	<%
}
	%>

	alert("dd");
	<%
	if(action.equals("read")){
	%>
		$('#displaycheck').css('display','');
		$('#cancle1').css('display','');
		$('#update').css('display','');
		$('#delete').css('display','');
		
		$('#ok').css('display','none');
		$('#clear').css('display','none');
		$('#cancle').css('display','none');
	<%
	}
	%>
	
	function clickHandler() {
		var a = document.getElementsByTagName("input");
		for(var i = 0; i < a.length; i++){
			a[i].addEventListener("click", action);
		}
		
		var tr = document.getElementsByTagName("tr");
		for(var i = 0; i < tr.length; i++){
			tr[i].addEventListener("click", actionTR);
		}
	}

	//게시물 리스트 클릭했을 때 
	function actionTR() {	
		location.href = "/mvc/news.do?action=read&newsid="+this.id;
	}
	function action() {		
		switch (this.id) {
		case "newsSubmit":		//게시물 작성 버튼 클릭했을 때
			$('#displaycheck').css('display','');
			$('#ok').css('display','');
			$('#clear').css('display','');
			$('#cancle').css('display','');
			
			//게시물 리스트 클릭했을 때 
			$('#update').css('display','none');
			$('#delete').css('display','none');
			$('#cancle1').css('display','none');
			break;
		case "cancle":				//게시물 작성 판에서 다시 취소했을 때
			$('#displaycheck').css('display','none');
			break;
		case "cancle1":			//게시물 리스트 클릭한 뒤 생성된 판에서 그냥 확인 눌렀을 때
			$('#displaycheck').css('display','none');
			break;
		case "delete":
			<% if(vo != null){ %>
			location.href = "/mvc/news.do?action=delete&newsid="+<% vo.getId(); %>;
			<%} %>
			break;
		case "update":
			<% if(vo != null){ %>
			location.href = "/mvc/news.do?action=update&newsid="<% vo.getId(); %>
																					+"&writer="+$('#writer').value
																					+"&title="+$('#title').value
																					+"&content="+$('#content').value
																					+"&writeDate="+<% vo.getWritedate(); %>

			<%} %>
			break;
		case "insert":
			<% if(vo != null){ %>
			location.href = "/mvc/news.do?action=insert&newsid="+<% vo.getId(); %>
																					+"&writer="+$('#writer').value
																					+"&title="+$('#title').value
																					+"&content="+$('#content').value;
			<%} %>
			break;
		}
	}

	window.addEventListener("load", clickHandler);
</script>
</body>
</html>