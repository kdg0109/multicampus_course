package core;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


@WebServlet("/part")
@MultipartConfig			//이를 이용하여 파일을 손 쉽게 가져올 수 있음
public class PartTestServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Collection<Part> parts = request.getParts();
		System.out.println("========== 요청 받음 ==========");
		for(Part part : parts) {
			System.out.print("name : ");
			System.out.println(part.getName());
			System.out.println("[ 헤더 정보] ");
			for(String headerName : part.getHeaderNames()) {
				System.out.print(headerName + " : ");
				System.out.println(part.getHeader(headerName));
			}
			System.out.print("size: ");
			System.out.print(part.getSize());
			System.out.print("------------------------------------");
		}
	}

}
