package core;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.CountVO;
//session 브라우저가 종료되기 전까지 계속 남음!
@WebServlet("/share2")
public class ShareObjectServlet2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(session.getAttribute("count2") == null)
				session.setAttribute("count2",  new CountVO());
		CountVO vo = (CountVO)session.getAttribute("count2");
		vo.setNumber(1000);
		request.setAttribute("count1", vo);
		request.getRequestDispatcher("/jspexam/countView2.jsp").forward(request, response);
	}
}
