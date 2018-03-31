package core;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/count")	//매핑영역을 여러개 두고 싶을 때, 배열처럼 {"/first1", "/first2", "/first3", ... }
public class CountServlet extends HttpServlet {
	/* 메서드 밖에서 선언되는 변수는 멤버 변수
	메모리영역을 계속 유지하지만, 여러 클라이언트에 의해 공유 
	그래서 읽는 상수 처럼 변하지 않는 것을 이용할 때 사용 
	세션을 객체 상태로 보관해야 각자의 장바구니를 가질 수 잇음 
	지역변수는 각자 장바구니이긴 하지만, 새로고침하면 다 삭제되니까 오직 하나만 담을 수 있는 장바구니임!*/
	int member_v; 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");	//이 servlet의 응답은 html이면서 utf-8이다
		PrintWriter out = response.getWriter();
		int local_v = 0;
		HttpSession session = request.getSession();
		if(session.getAttribute("cnt") == null){			//최초 1번 실행
			session.setAttribute("cnt", new int[1]);
		}
		int session_v[] = (int[])session.getAttribute("cnt");
		session_v[0]++;		//세션
		member_v++;			//멤버변수
		local_v++;				//지역변수
		out.print("<h2>session_v[0] : " + session_v[0] +  "</h2>");
		out.print("<h2>member_v : " + member_v +  "</h2>");
		out.print("<h2>local_v : " + local_v + "</h2>");
		out.close();
	}
}