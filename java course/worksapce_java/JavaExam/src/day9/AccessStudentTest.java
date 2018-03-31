package day9;
import day6.Student;
public class AccessStudentTest {
	public static void main(String[] args) {
		Student st = new Student();			// st는 4바이트 공간 배열도 똑같음. 주소값을 가리킴
		st.studentInfo();
		st.study();
	}
}
