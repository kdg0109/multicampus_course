package day8;

import java.util.Scanner;

class GradeExpr {
	int[] jumsu;
	
	GradeExpr(int[] jumsu) {
		this.jumsu = jumsu;
	}
	double getAverage() {
		return (double)getTotal()/jumsu.length;
	}
	int getTotal() {
		int sum = 0;
		for(int num : jumsu)
			sum += num;
		return sum;
	}
	int getGoodScore() {
		int max = jumsu[0];
		for(int num : jumsu) {
			if(max < num) {
				max = num;
			}
		}
		return max;
	}
	int getBadScore() {
		int min = jumsu[0];
		for(int num : jumsu) {
			if(min > num) {
				min = num;
			}
		}
		return min;
	}
}
public class GradeTest {
	public static void main(String[] args) {
		int[] array = null;
		array = setDataIndex(array);
		cleanConsole();
		
		setGradeExpr(array);
		GradeExpr gradeExpr = new GradeExpr(array);
		System.out.println();
		System.out.printf("총점 : %d\n", gradeExpr.getTotal());
		System.out.printf("평균 : %.2f\n", gradeExpr.getAverage());
		System.out.printf("최고 점수 : %d\n", gradeExpr.getGoodScore());
		System.out.printf("최저 점수 : %d\n", gradeExpr.getBadScore());
		
	}
	public static int[] setDataIndex(int[] array){
		int index;
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("처리하려는 데이터의 입력 갯수 : ");
			index = scan.nextInt();
			if(index <= 0){
				System.out.println("0 이상의 숫자를 입력해주세요..");
				continue;
			}
			array = new int[index];
			break;
		}
		int cnt = 0;
		while(cnt < array.length){
			System.out.println(cnt+1 + "번째 숫자 입력 : ");
			array[cnt++] = scan.nextInt();
		}
		scan.close();
		return array;
	}
	public static void setGradeExpr(int[] array){
		System.out.print("점수들 : ");
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i]);
			if(i+1 < array.length){
				System.out.print(", ");
			}
		}
	}
	public static void cleanConsole(){
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
}
