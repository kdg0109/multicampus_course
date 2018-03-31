package core;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/memberlocal")	//매핑영역을 여러개 두고 싶을 때, 배열처럼 {"/first1", "/first2", "/first3", ... }
public class MemberLocalServlet extends HttpServlet {
	int member_v; //메서드 밖에서 선언되는 변수는 멤버 변수
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");	//이 servlet의 응답은 html이면서 utf-8이다
		PrintWriter out = response.getWriter();
		int local_v = 0;
		member_v += 10;
		local_v += 10;
		out.print("<h2>member_v : " + member_v +  "</h2>");
		out.print("<h2>local_v : " + local_v + "</h2>");
		out.close();
	}
}