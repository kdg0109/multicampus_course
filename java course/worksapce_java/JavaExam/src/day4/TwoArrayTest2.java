package day4;

public class TwoArrayTest2 {
	public static void main(String[] args) {
		//���� ���  (��� ���� ������ ����)
		int[][] nums = {
								{ 1,	2, 	3,	4  }
							,	{ 5, 	6, 	7,	8  }
							,	{ 9,	10,	11, 12 }
							,	{ 13, 	14, 15, 16 }
						};
		
//		// 2�� 3���� ����� ����.
//		System.out.println(nums[1][2]);
//		
//		// 4���� ����� ����. (�ϳ��� �࿡)
//		for(int i = 0; i < nums[3].length; i++){
//			System.out.print(nums[3][i] + "\t");
//		}
//		
//		System.out.println();
//		
//		//3���� ��� �����͸� ����� ����. (�ϳ��� �࿡)
//		for(int i = 0; i < nums.length; i++){
//			System.out.print(nums[i][2] + "\t");
//		}
		
//		//��� ��� ��� ���� ���(�� ������ ���� ó���Ͽ�)
//		for(int i = 0; i < nums.length; i++){			//���� ���� ��ŭ
//			for(int j = 0; j < nums[i].length; j++)	//���� ���� ��ŭ
//				System.out.print(nums[i][j] + "\t");
//			System.out.println();
//		}
		
		for(int i = 0; i < nums.length; i++){
			for(int j = 0; j < nums[i].length; j++)	{
				// ���� �밢���� ���鸸 ������� ���	1, 6, 11, 16
				if(i == j)
					System.out.print(nums[i][j] + "\t");
			}
		}
		
		System.out.println();
		for(int i = 0; i < nums.length; i++){
			for(int j = 0; j < nums[i].length; j++)	{
				// ������ �밢���� ���鸸 ������� ���	4, 7, 10, 13
				if(i+j == nums[i].length-1)
					System.out.print(nums[i][j] + "\t");
			}
		}

		System.out.println();
		int sum = 0;
		for(int i = 0; i < nums.length; i++){
			for(int j = 0; j < nums[i].length; j++)	{
				// ������ �밢���� ���鸸 ������� ���	4, 7, 10, 13
				if(i > j)
					sum += nums[i][j];
			}
		}

		System.out.print(sum + "\t");
	}
}