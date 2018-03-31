import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet( {"/first1", "/first2", "/first3"})	//매핑영역을 여러개 두고 싶을 때, 배열처럼 {"/first1", "/first2", "/first3", ... }
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");	//이 servlet의 응답은 html이면서 utf-8이다
		PrintWriter out = response.getWriter();
		out.print("<h2>FirstServlet 수행 완료</h2>");
		out.print("<hr>");
		out.print("<h2>현재시간 : " + java.time.LocalTime.now() + " </hr>");
	}
}