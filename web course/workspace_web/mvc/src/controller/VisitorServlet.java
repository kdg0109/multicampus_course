package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.VisitorDAO;
import model.vo.VisitorVO;

@WebServlet("/visitor")
public class VisitorServlet extends HttpServlet {
	//DB의 리스트를 읽어서 html로 뿌릴 것
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; charset=utf-8");
		String searchText = request.getParameter("searchText");
		ArrayList<VisitorVO> list = null;
		if(searchText == null){
			list = new VisitorDAO().list();
		}else{
			list = new VisitorDAO().listByName(searchText);
		}
		if(list.size() == 0){
			request.setAttribute("isNaA", "검색결과가 없습니다.");
		}else{
			request.setAttribute("isNaA", "");
			request.setAttribute("arrayList", list);
		}
		request.setAttribute("type", "select");
		request.getRequestDispatcher("/jspexam/visitorview.jsp").forward(request, response);
	}
	
	//visitor.html에 데이터를 받아서 디비에 넣을것
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");		//읽고 유니코드(utf-16)를 변환시켜내야함
		String name = request.getParameter("name");
		String memo = request.getParameter("memo");
		
		VisitorDAO dao = new VisitorDAO();
		VisitorVO  vo = new VisitorVO();
		
		vo.setName(name);
		vo.setMemo(memo);
		
		boolean result = dao.insert(vo);

		request.setAttribute("result", result);
		request.setAttribute("name", name);

		request.setAttribute("type", "insert");
		request.getRequestDispatcher("/jspexam/visitorview.jsp").forward(request, response);
		
	}
}
