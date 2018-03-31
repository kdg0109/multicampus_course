package core;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessiontest")
public class SessionTestServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();				//Session을 만든다.
		String command = request.getParameter("comm");		//comm을 쿼리로 하는 데이터를 변수에 담는다
		String msg = "";
		long time = session.getCreationTime();					//1970. 1.1 GMT 부터 만들어졌을 때까지의 시간을 밀리초 리턴
		if(command.equals("view")) {
			if(session.isNew()) {
				msg = "세션 객체 생성 : ";
			} else {
				msg = "세션 객체 추출 : ";
			}
			msg += "(id : " + session.getId() + ", time : " +	new Date(time);
		}else if (command.equals("delete")) {
			session.invalidate();											//세션 삭제
			msg = "세션 객체 삭제";
		}else {
			msg = "요청 시 comm=view 또는 comm=delete 를 전달해주세요!!";
		}
		out.print("<h1>" + msg + "</h1>");
		out.close();
	}
}
