package day8;
public class BlockTest {
	static int cnt = 0;
	static {										//main이 시작되기 전에 실행
		System.out.println(cnt++ + " static 블럭 수행");
	}
	{												//객체 생성될 때마다 실행
		System.out.println(cnt++ + " instance 블럭 수행");
	}
	public BlockTest(){
		System.out.println(cnt++ + " 생성자 수행");
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
