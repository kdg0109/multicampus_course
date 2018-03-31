package day8;
public class BlockTest {
	static int cnt = 0;
	static {										//main�� ���۵Ǳ� ���� ����
		System.out.println(cnt++ + " static �� ����");
	}
	{												//��ü ������ ������ ����
		System.out.println(cnt++ + " instance �� ����");
	}
	public BlockTest(){
		System.out.println(cnt++ + " ������ ����");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cnt++ + " BlockTest bt = new BlockTest();");
		BlockTest bt = new BlockTest();
		System.out.println(cnt++ + " " + bt);
		System.out.println(cnt++ + " BlockTest bt2 = new BlockTest();");
		BlockTest bt2 = new BlockTest();
		System.out.println(cnt++ + " " + bt2);
	}
}
