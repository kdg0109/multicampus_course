package test;

import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char abc = ' ';
		
		loop : while(sc.hasNext()) {
			String tmp = sc.next();
			abc = tmp.charAt(0);
			if(tmp.length() > 1) {
				continue loop;
			}
			if((abc >= 'a' && abc <= 'z') ) {}
			else if( abc >= 'A' && abc <= 'Z'){}
			else if(abc >= '0' && abc <= '9') {}
			else {
				continue loop;
			}
			break;
		}
		System.out.print((int)abc);

	}
}