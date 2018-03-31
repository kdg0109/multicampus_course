package test;

import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String abcd = "";

		loop : do {
			abcd = sc.nextLine();
			for(int i = 0; i < abcd.length(); i++) {
				if((abcd.charAt(i) >= 'a' && abcd.charAt(i) <= 'z') ) {}
				else {
					continue loop;
				}
			}
		}while(abcd.length() > 100);
		
		int size = 'z'-'a'+1;
		for(int  j = 0; j < size; j++) {
			char chr = (char)(97+j);
			System.out.print(abcd.indexOf(Character.toString(chr)));
			if(j < size-1)
				System.out.print(" ");
		}
	}
}