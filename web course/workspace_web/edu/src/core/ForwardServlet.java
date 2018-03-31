package core;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/forward")	//매핑영역을 여러개 두고 싶을 때, 배열처럼 {"/first1", "/first2", "/first3", ... }
public class ForwardServlet extends HttpServlet { 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ForwardServlet 수행");
		RequestDispatcher rd = request.getRequestDispatcher("공항.jpg");		//포워드 대상은 반드시 URL임. /first.html 이런거 안댐
		rd.forward(request, response);
	}
}