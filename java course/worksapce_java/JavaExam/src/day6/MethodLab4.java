package day6;

public class MethodLab4 {
	public static void main(String[] args) {
		int[] arrayA = {10, 20, 30};
		int[] arrayB = {100, 500, 300, 200, 400};
		int[] arrayC = {1, 10, 3, 4, 5, 8, 7, 6, 9, 2};
		System.out.println("���� ū ���� " + maxNumArray(arrayA) + "�Դϴ�.");
		System.out.println("���� ū ���� " + maxNumArray(arrayB) + "�Դϴ�.");
		System.out.println("���� ū ���� " + maxNumArray(arrayC) + "�Դϴ�.");
	}
	public static int maxNumArray(int[] array){
		int max = -9999;
		for(int num : array){
			if(num > max){
				max = num;
			}
		}
		return max;
	}
}