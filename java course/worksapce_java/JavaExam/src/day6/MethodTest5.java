package day6;

import day5.MethodLab3;

public class MethodTest5 {

	public static void main(String[] args) {
		printNumbers(new int[0]);							//원소가 하나도 없는 배열
		printNumbers(new int[3]);							//default로 0 채워짐
		printNumbers(new int[]{111,222});					//default로 0 채워짐
		printNumbers(getNumbers(20, 20));
		printNumbers(getNumbers(10, 10));
		printNumbers(getNumbers(5, 5));
	}
	
	//1부터 limit 값까지의 난수를 count 갯수만큼 배열로 리턴
	public static int[] getNumbers(int count, int limit){
		int nums[] = new int[count];
		for(int i = 0; i < nums.length; i++)
			nums[i] = MethodLab3.getRandom(limit);
		
		return nums;
	}
	public static void printNumbers(int nums[]){
		if(nums.length == 0){
			System.out.println("원소가 없음");
			return;		//리턴값 명시하지 않았기에 숫자 안씀. 그냥 끝냄. 호출한 곳으로 되돌아감
		}
		for(int num : nums)
			System.out.print(num + " ");
		System.out.println();
		//return
	}
}