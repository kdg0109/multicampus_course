package core;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/redirect")	//매핑영역을 여러개 두고 싶을 때, 배열처럼 {"/first1", "/first2", "/first3", ... }
public class RedirectServlet extends HttpServlet { 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("RedirectServlet 수행");
//		response.sendRedirect("/edu/first.html");
		response.sendRedirect("http://www.naver.com");
	}
}