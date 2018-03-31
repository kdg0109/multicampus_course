package core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/basket2")
public class BasketServlet2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		String productID = request.getParameter("productID");
		
		if(productID.equals("delete")){
			session.invalidate();
			out.print("<h1>상품 정보를 삭제했습니다.</h1>");
			out.print("<a href='/edu/htmlexam/productlog.html'>상품선택화면</a>");
			out.close();
		}else{
			if(session.getAttribute("cnt") == null){			//최초 1번 실행
				session.setAttribute("cnt", new int[10]);
			}

			int productNum[] = (int[])session.getAttribute("cnt");
	
			int lastNum = Integer.parseInt(productID.substring(1, productID.length()))-1;
			productNum[lastNum]++;
			out.print("<h1>선택한 상품 리스트</h1>");
			out.print("<h1>------------------------------------------</h1>");
			out.printf("<ul>");
			for(int i = 0; i < productNum.length; i++){
				if(productNum[i] != 0){
					out.printf("<li>p%03d 상품 %d개</li>", (i+1), productNum[i]);
				}
			}
			out.printf("</ul>");
			out.print("<a href='/edu/htmlexam/productlog.html' style=\"margin:20px\">상품선택화면</a>");
			out.print("<a href='/edu/basket2?productID=delete'>상품비우기</a>");
			out.close();
		}
	}
}
