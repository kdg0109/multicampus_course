package core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/basket1")
public class BasketServlet1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		String productID = request.getParameter("productID");
		int productCnt = 0;
		productCnt++;
		out.print("<h1>" + productID + " 상품 "	+ productCnt + "개!!</h1>");
		out.print("<a href='/edu/htmlexam/productlog.html'>상품선택 화면으로 이동하기</a>");
		out.close();
	}
}
