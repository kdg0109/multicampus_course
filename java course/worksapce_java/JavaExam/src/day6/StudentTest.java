package day6;
public class StudentTest {
	public static void main(String[] args) {
		Student st1 = new Student();
		st1.name = "��ũ";
		st1.age = 22;
		st1.project = "�ڹ�";
		st1.studentInfo();
		st1.study();
		
		Student st2 = new Student();
		st2.name = "�Ѹ�";
		st2.age = 22;
		st2.project = "����";
		st2.studentInfo();
		st2.study();
		System.out.println(st1);		//day6.Student@15db9742	���� �ɺ� @ 16���� ���� �ּ�
		System.out.println(st2);		//day6.Student@6d06d69c
		System.out.println("st2 = st1 ����");
		st2 = st1;
		System.out.println(st1);
		System.out.println(st2);
	}
}