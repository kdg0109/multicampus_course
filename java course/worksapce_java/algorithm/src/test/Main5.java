package test;

import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = -1;
		}
		
		
		for(int i = 0; i < nums.length; i++) {
			int tmp = sc.nextInt();
			if(tmp < 0 || tmp > 100 || tmp%5 != 0) {
				i--;
			}else if(tmp < 40) {
				nums[i] = 40;
			}else {
				nums[i] = tmp;
			}
		}
		int sum = 0;
		for(int j = 0; j < nums.length; j++) {
			sum += nums[j];
		}
		System.out.print(sum/5);
	}
}