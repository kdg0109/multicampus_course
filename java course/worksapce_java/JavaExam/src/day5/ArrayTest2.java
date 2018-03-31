package day5;

public class ArrayTest2 {
	public static void main(String[] args) {
		int score[ ] = new int[5];
		//enhanced for statement		for-each	읽어오는 것만 가능
		for(int data : score)
			System.out.println(data);
		score[0] = 100;
		score[1] = 200;
		score[2] = 300;
		score[3] = 400;
		score[4] = 500;
		for(int data : score)
			System.out.println(data);
		for(int data : score)
			System.out.println(++data);
	}
}
