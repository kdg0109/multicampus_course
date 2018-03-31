package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.VisitorDAO;
import model.vo.VisitorVO;

@WebServlet("/grade")
public class EduServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");		//읽고 유니코드(utf-16)를 변환시켜내야함
		int number = Integer.parseInt(request.getParameter("number"));
		String grade = "";
		if(number >= 90){
			grade = "gradeA.jsp";
		}else if(number >= 80){
			grade = "gradeB.jsp";
		}else if(number >= 70){
			grade = "gradeC.jsp";
		}else{
			grade = "gradeD.jsp";
		}
		//forward 는 동일안 컨테스트 안에서만 가능하다. 동일한 웹프로젝트에 있는거만 가능
		request.getRequestDispatcher("/jspexam/" + grade).forward(request, response);
	}
}
