package day8;

import java.io.IOException;

import day5.MethodLab3;

class GuGu {
	private int dan;
	private int number;
	GuGu() {
	}
	GuGu(int dan) {
		this.dan = dan;
	}
	GuGu(int dan, int number) {
		this.dan = dan;
		this.number = number;
	}
	void printPart() {
		if (number == 0) {
			for (int n = 1; n <= 9; n++)
				System.out.print("\t" + dan + "*" + n + "=" + dan * n);
			System.out.println();
		} else {
			System.out.println(dan * number);
		}
	}
}

class GuGuDan extends GuGu{
	GuGuDan() {
		super();
	}

	GuGuDan(int dan) {
		super(dan);
	}

	GuGuDan(int dan, int number) {
		super(dan, number);
	}
	public static void printAll() {
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= 9; j++){
				System.out.print(i + " * " + j + " = " + i*j + "\t");
			}
			System.out.println();
		}
	}
}

public class GuGuDanTest{
	public static void main(String[] args) {
		int dan = MethodLab3.getRandom(20);
		int number = MethodLab3.getRandom(20);
		GuGuDan guguDan = null;
		if(dan < 10 && number < 10){
			guguDan = new GuGuDan(dan, number);
			System.out.print(dan + " * " + number + " = ");
			guguDan.printPart();
		}else if(dan < 10 && number >= 10){
			guguDan = new GuGuDan(dan);
			System.out.print(dan + "´Ü :");
			guguDan.printPart();
		}else if(dan >= 10){
			GuGuDan.printAll();
		}
	}
}