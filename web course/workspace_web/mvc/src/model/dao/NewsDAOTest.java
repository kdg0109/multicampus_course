package model.dao;

import java.util.ArrayList;

import org.junit.Test;

import model.vo.NewsVO;

public class NewsDAOTest {

	@Test
	public void dbTest() {	//메서드 이름은 임의 수정 가능
		// 여기에 테스트할 코드를 추가
		NewsDAO dao = new NewsDAO();
		NewsVO vo = new NewsVO();
		//1.  insert 테스트
//		vo.setWriter("또치");
//		vo.setTitle("ㅋㅋㅋ");
//		vo.setContent("마마잃은중천공");
//		dao.insert(vo);

		//2.  update 테스트
//		vo.setId(4);
//		vo.setWriter("또치");
//		vo.setTitle("컴플레인");
//		vo.setContent("분노의 이태우");
//		vo.setCnt(0);
//		dao.update(vo);

		//3.  delete 테스트
//		dao.delete(4);

		//4.  listOne 테스트
//		vo = dao.listOne(5);
//		System.out.println(vo);
			

		//4.  listAll 테스트
//		ArrayList<NewsVO> myList = dao.listAll();
//		System.out.println(myList.size());
//		
//		4 빼고 나머지 가능
		ArrayList<NewsVO> myList = dao.listAll();
		for(NewsVO data : myList){
			System.out.println(data);
		}
	}
}
