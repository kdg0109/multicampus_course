package test;

import java.util.Scanner;

public class Main1 {
	public static String dot = "*";   //'*' or ' '
	public static int cnt = 0;
	public static int cycleCnt = 1;				//한싸이클 2일 때 세모 2개 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		cnt = sc.nextInt();

		cycle(1);
	}
	
	public static void cycle(int n){
		if(cnt == 0) return;
		switch (n%6) {
		case 1:
			System.out.printf("%"+(cnt--)+"s", dot);
			if(cycleCnt > 1) {
				dot = "";
				System.out.printf("%6s", dot);
				dot = "*";
				System.out.printf("%6s", dot);
			}
			System.out.println();
			cycle(n+1);
			break;
		case 2:
			System.out.printf("%"+(cnt--)+"s", dot);
			System.out.printf("%s"," ");
			System.out.printf("%"+"s", dot);
			System.out.println();
			cycle(n+1);
			break;
		case 3:
			System.out.printf("%"+(cnt--)+"s", "");
			System.out.printf("%"+"s", dot);
			System.out.printf("%"+"s", dot);
			System.out.printf("%"+"s", dot);
			System.out.printf("%"+"s", dot);
			System.out.printf("%"+"s", dot);
			System.out.println();
			cycle(n+1);
			break;
		case 4:
			System.out.printf("%"+(cnt--)+"s", dot);
			System.out.printf("%5"+"s", dot);
			System.out.println();
			cycle(n+1);
			break;
		case 5:
			System.out.printf("%"+(cnt--)+"s", dot);
			System.out.printf("%s"," ");
			System.out.printf("%"+"s", dot);
			System.out.printf("%3s"," ");
			System.out.printf("%"+"s", dot);
			System.out.printf("%s"," ");
			System.out.printf("%"+"s", dot);
			System.out.println();
			cycle(n+1);
			break;
		case 0:
			System.out.printf("%"+(cnt--)+"s", dot);
			System.out.printf("%"+"s", dot);
			System.out.printf("%"+"s", dot);
			System.out.printf("%"+"s", dot);
			System.out.printf("%"+"s", dot);
			System.out.printf("%s"," ");
			System.out.printf("%"+"s", dot);
			System.out.printf("%"+"s", dot);
			System.out.printf("%"+"s", dot);
			System.out.printf("%"+"s", dot);
			System.out.printf("%"+"s", dot);
			System.out.println();
			cycleCnt++;
			cycle(n+1);
		}
	}
}
