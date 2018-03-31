package day6;

public class MethodTest6 {

	/*	인아웃 방법
		매서드의 매개변수로 배열을 전달하면 return 없어도 수행 결과를 받을 수 있다.
		(배열을 주소를 가르키기 때문 메서드 속에서 바로 값변환하면 호출했을 때 배열 값도 바뀜) 리터블하다.
		리터블 메서드
	*/
	public static void main(String[] args) {
		int[] ary = {1,2,3,4,5};
		MethodTest5.printNumbers(ary);
		updateArray(ary);
		MethodTest5.printNumbers(ary);		//ary의 내용이 바뀜
	}
	
	public static void updateArray(int[] ary){
		for(int i = 0; i < ary.length; i++)
			ary[i] *= 10;
	}

}