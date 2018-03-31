package day4;

public class ArrayTest4 {
	public static void main(String[] args) {
		int nums[ ] = {10, 5, 7, 15, 12, 20, 14, 8, 25, 19};	// 선언과 함께 초기화
		// 첫번째 원소
		System.out.println(nums[0]);
		
		// 마지막 원소
		System.out.println(nums[nums.length-1]);
		
		// 첫번째 원소부터 마지막 원소까지 한 행에 출력
		for(int i = 0; i < nums.length; i++)
			System.out.print(nums[i] + "\t");
		System.out.println();
		
		// 마지막 원소부터 첫번째 원소 순으로 한 행에 출력
		for(int i = nums.length-1; i >= 0; i--)
			System.out.print(nums[i] + "\t");
		System.out.println();
		
		// 홀수번째 원소값만 한 행에 출력
		for(int i = 0; i < nums.length; i+= 2)			//nums[0]이 첫번째 배열 값이니까 인덱스 0이 홀수...2, 4, 6..
			System.out.print(nums[i] + "\t");
		System.out.println();
		
		// nums 에서 최고값을 추출하여 maxNum 저장
		int maxNum;
		maxNum = nums[0];
		for(int i = 0; i < nums.length; i++){
			if(maxNum < nums[i]){
				maxNum = nums[i];
			}
		}
		System.out.println("원소들 중에서 최고값 : " + maxNum);
		
		// nums 에서 최소값을 추출하여 minNum 저장
		int minNum;
		minNum = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (minNum > nums[i]) {
				minNum = nums[i];
			}
		}
		System.out.println("원소들 중에서 최소값 : " + minNum);
	}
}
