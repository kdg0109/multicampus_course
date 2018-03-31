package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.vo.ProductVO;

@WebServlet("/cart")
public class ProductServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String pid = request.getParameter("pid");
		if(pid.equals("ok")){
			session.invalidate();
		}else{
			if(session.getAttribute("proVO") == null){			//최초 1번 실행
				session.setAttribute("proVO", new ProductVO());
				session.setAttribute("delete", "delete");
			}

			ProductVO vo = (ProductVO)session.getAttribute("proVO");
				
			switch (pid) {
			case "p001":
				vo.setCntApple(1);
				break;
			case "p002":
				vo.setCntBanana(1);
				break;
			default:
				vo.setCntHalabong(1);
			}
			session.setAttribute("ProductVO", vo);
		}
		request.getRequestDispatcher("/jspexam/productView.jsp").forward(request, response);
	}
}
