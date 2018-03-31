package test;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		int[] em = new int[8];
		int cnt = 0;
		int startNum = 0;
		int tmpNum = 0;
		Scanner sc = new Scanner(System.in);
		
		while(cnt < 8) {
			em[cnt] = sc.nextInt();
			cnt++;
		}
		int result = 0;
		if(em[0] == 1) {
			result = getAscending(em);
		}else if(em[0] == 8) {
			result = getDescending(em);
		}else {
			result = 0;
		}
		
		switch (result) {
		case 1:
			System.out.print("ascending");
			break;
		case 2:
			System.out.print("descending");
			break;
		case 0:
			System.out.print("mixed");
		}
	}

	private static int getDescending(int[] em) {
		int startNum = 0;
		int tmpNum = 0;
		
		startNum = 8;
		tmpNum = startNum-1;
		for(int i = 1; i <em.length; i++) {
			if(em[i] == tmpNum) {
				tmpNum--;
			}else {
				return 0;
			}
		}
		return 2;
	}

	private static int getAscending(int[] em) {
		int startNum = 0;
		int tmpNum = 0;
		
		startNum = 1;
		tmpNum = startNum+1;
		for(int i = 1; i <em.length; i++) {
			if(em[i] == tmpNum) {
				tmpNum++;
			}else {
				return 0;
			}
		}
		return 1;
	}
}