package day6;

public class MethodTest6 {

	/*	�ξƿ� ���
		�ż����� �Ű������� �迭�� �����ϸ� return ��� ���� ����� ���� �� �ִ�.
		(�迭�� �ּҸ� ����Ű�� ���� �޼��� �ӿ��� �ٷ� ����ȯ�ϸ� ȣ������ �� �迭 ���� �ٲ�) ���ͺ��ϴ�.
		���ͺ� �޼���
	*/
	public static void main(String[] args) {
		int[] ary = {1,2,3,4,5};
		MethodTest5.printNumbers(ary);
		updateArray(ary);
		MethodTest5.printNumbers(ary);		//ary�� ������ �ٲ�
	}
	
	public static void updateArray(int[] ary){
		for(int i = 0; i < ary.length; i++)
			ary[i] *= 10;
	}

}