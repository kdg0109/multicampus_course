package test;

import java.util.Scanner;

public class Main2 {
/**
 * ���� ��ҹ��ڿ� ���⸸���� �̷���� ������ �־�����. 
 * �� ���忡�� �� ���� �ܾ ������? �̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù �ٿ� ���� ��ҹ��ڿ� ����� �̷���� ������ �־�����. 
�� ������ ���̴� 1,000,000�� ���� �ʴ´�. �ܾ�� ���� �� ���� ���еȴ�.

���
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
