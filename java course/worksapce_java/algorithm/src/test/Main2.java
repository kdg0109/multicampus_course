package test;

import java.util.Scanner;

public class Main2 {
/**
 * 영어 대소문자와 띄어쓰기만으로 이루어진 문장이 주어진다. 
 * 이 문장에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.

입력
첫 줄에 영어 대소문자와 띄어쓰기로 이루어진 문장이 주어진다. 
이 문장의 길이는 1,000,000을 넘지 않는다. 단어는 띄어쓰기 한 개로 구분된다.

출력
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String abc = "";
		String[] result;
		loop : while(sc.hasNextLine()) {
			abc = sc.nextLine();
			if(abc.length() > 1000000) {
				continue loop;
			}
			for(int i = 0; i < abc.length(); i++) {
				if(abc.charAt(i) >= 'a' && abc.charAt(i) <= 'z') { }
				else if(abc.charAt(i) >= 'A' && abc.charAt(i) <= 'Z') { }
				else if(abc.charAt(i) == ' ') { }
				else {
					continue loop;
				}
			}
			
			result = abc.split(" ");
			int count = result.length;
			for(int i = 0; i< result.length;i++) {
				if(result[i].length() == 0) {
					count--;
				}
			}
			System.out.print(count);
			break;
		}
	}

}
