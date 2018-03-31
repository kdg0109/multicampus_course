package day6;

public class MethodLab5 {
	public static void main(String[] args) {
		int r1[] = powerArray(2);
		int r2[] = powerArray(3);
		int r3[] = powerArray(4);
		printNumbers(r1);
		printNumbers(r2);
		printNumbers(r3);
	}
	public static int[] powerArray(int num){
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for(int i = 0; i < nums.length; i++)
			nums[i] *= num;
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