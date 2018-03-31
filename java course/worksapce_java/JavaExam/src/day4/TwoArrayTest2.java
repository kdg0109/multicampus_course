package day4;

public class TwoArrayTest2 {
	public static void main(String[] args) {
		//정방 행렬  (행과 열의 갯수가 같다)
		int[][] nums = {
								{ 1,	2, 	3,	4  }
							,	{ 5, 	6, 	7,	8  }
							,	{ 9,	10,	11, 12 }
							,	{ 13, 	14, 15, 16 }
						};
		
//		// 2행 3열을 출력해 본다.
//		System.out.println(nums[1][2]);
//		
//		// 4행을 출력해 본다. (하나의 행에)
//		for(int i = 0; i < nums[3].length; i++){
//			System.out.print(nums[3][i] + "\t");
//		}
//		
//		System.out.println();
//		
//		//3열의 모든 데이터를 출력해 본다. (하나의 행에)
//		for(int i = 0; i < nums.length; i++){
//			System.out.print(nums[i][2] + "\t");
//		}
		
//		//모든 행과 모든 열을 출력(행 단위로 개행 처리하여)
//		for(int i = 0; i < nums.length; i++){			//행의 갯수 만큼
//			for(int j = 0; j < nums[i].length; j++)	//열의 갯수 만큼
//				System.out.print(nums[i][j] + "\t");
//			System.out.println();
//		}
		
		for(int i = 0; i < nums.length; i++){
			for(int j = 0; j < nums[i].length; j++)	{
				// 왼쪽 대각선의 값들만 행단위로 출력	1, 6, 11, 16
				if(i == j)
					System.out.print(nums[i][j] + "\t");
			}
		}
		
		System.out.println();
		for(int i = 0; i < nums.length; i++){
			for(int j = 0; j < nums[i].length; j++)	{
				// 오른쪽 대각선의 값들만 행단위로 출력	4, 7, 10, 13
				if(i+j == nums[i].length-1)
					System.out.print(nums[i][j] + "\t");
			}
		}

		System.out.println();
		int sum = 0;
		for(int i = 0; i < nums.length; i++){
			for(int j = 0; j < nums[i].length; j++)	{
				// 오른쪽 대각선의 값들만 행단위로 출력	4, 7, 10, 13
				if(i > j)
					sum += nums[i][j];
			}
		}

		System.out.print(sum + "\t");
	}
}