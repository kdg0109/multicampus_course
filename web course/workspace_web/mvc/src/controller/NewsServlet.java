package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.NewsDAO;
import model.vo.NewsVO;
/**
 * 
 * 
 * GET 방식 요청 시 기능
		뉴스의 전체 리스트 출력
		제목 선택 시 : 해당 뉴스 id 로 해당 뉴스 내용 출력
		삭제 버튼 클릭시 : 뉴스 삭제

 */
@WebServlet("/news.do")
public class NewsServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		String action = "";
		if(request.getParameter("action") != null)
			action = request.getParameter("action");
		int newsid = 0;
		if(request.getParameter("newsid") != null)
			newsid = Integer.parseInt(request.getParameter("newsid"));

		NewsDAO dao = new NewsDAO();
		NewsVO vo = new NewsVO();
		ArrayList<NewsVO> listAll = null;
		if(action.equals("read")){
			//제목 선택 시 : 해당 뉴스 id 로 해당 뉴스 내용 출력
			vo = dao.listOne(newsid);
			request.setAttribute("listOne", vo);

			request.setAttribute("action", "read");
			if(vo == null){
				//존재하지 않는 게시글 입니다. 라는 모습 보이게 하기
				request.setAttribute("notText", "존재하지 않는 게시글 입니다.");
			}
		}else if(action.equals("delete")){
			//삭제 버튼 클릭 시 : 뉴스 삭제
			dao.delete(newsid);
			request.setAttribute("delText", "삭제했습니다.");
			request.setAttribute("action", "delete");
		}

		
		//뉴스의 전체 리스트 출력				리스트 전체 출력은 계속 나와야 함
		listAll = dao.listAll();
		request.setAttribute("listAll", listAll);
		
		request.getRequestDispatcher("/jspexam/news.jsp").forward(request, response);
	}
	
/**
 * 
 * 	POST 방식 요청 시 기능
		뉴스 작성
		뉴스 수정
 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");		//읽고 유니코드(utf-16)를 변환시켜내야함
		String action = request.getParameter("action");
		
		String newsid = request.getParameter("newsid");
		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String writeDate = request.getParameter("writeDate");
		
		NewsDAO dao = new NewsDAO();
		NewsVO  vo = new NewsVO();
		System.out.println(action);
		if(action == null){
		}else if(action.equals("insert")){
			vo.setWriter(writer);
			vo.setTitle(title);
			vo.setContent(content);
			dao.insert(vo);
		}else if(action.equals("update")){
			vo.setId(Integer.parseInt(newsid));
			vo.setWriter(writer);
			vo.setTitle(title);
			vo.setContent(content);
			vo.setContent(writeDate);
			dao.update(vo);
		}
	
		doGet(request, response);
	}
}
