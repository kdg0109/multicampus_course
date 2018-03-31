package day6;

import day5.MethodLab3;

public class MethodTest5 {

	public static void main(String[] args) {
		printNumbers(new int[0]);							//���Ұ� �ϳ��� ���� �迭
		printNumbers(new int[3]);							//default�� 0 ä����
		printNumbers(new int[]{111,222});					//default�� 0 ä����
		printNumbers(getNumbers(20, 20));
		printNumbers(getNumbers(10, 10));
		printNumbers(getNumbers(5, 5));
	}
	
	//1���� limit �������� ������ count ������ŭ �迭�� ����
	public static int[] getNumbers(int count, int limit){
		int nums[] = new int[count];
		for(int i = 0; i < nums.length; i++)
			nums[i] = MethodLab3.getRandom(limit);
		
		return nums;
	}
	public static void printNumbers(int nums[]){
		if(nums.length == 0){
			System.out.println("���Ұ� ����");
			return;		//���ϰ� ������� �ʾұ⿡ ���� �Ⱦ�. �׳� ����. ȣ���� ������ �ǵ��ư�
		}
		for(int num : nums)
			System.out.print(num + " ");
		System.out.println();
		//return
	}
}