package day12;

import java.util.*;

public class GenericTestNew {

	public static void main(String[] args) {
//		ArrayList<String> list = new ArrayList<String>();			//��������� <String>�� �����ν� ���� ���� Ȯ���ϰ� ������ �� ����
//		list.add("java");
//		list.add("100");
//		list.add("servlet");
//		list.add("jdbc");
//		/*
//		 * 
//		 * �ε����� �ʿ���
//		 * 
//		 */
//		//get�� �̿��Ͽ� ����
//		for(int i = 0; i < list.size(); i++) 
//			System.out.println(list.get(i));
//		System.out.println();
//		
//		/*
//		 * 
//		 * �ε����� �ʿ���� ��� ������� ����
//		 * �ӵ��� get�̿��ؼ� ������ �ͺ��� ���� ��~�� ū ���̴� ����
//		 * 
//		 */
//		//���������� Iterator�� �����
//		for(String s : list) {
//			System.out.println(s);
//		}
//		System.out.println();
//		
//		Iterator<String> iter = list.iterator();
//		while(iter.hasNext()) {
//			String s = iter.next();
//			System.out.println(s);
//		}
		
		HashSet<String> set = new HashSet<String>();
		set.add("�ڹ�");
		set.add("īǪġ��");
		set.add("����������");
		set.add("�ڹ�");
		for(String abc : set){
			System.out.println(abc);
		}
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()){
			String s = iter.next();
			System.out.println(s);
		}

		for(int i = 0; i < set.size(); i++) {
			System.out.println(set.toArray()[i]);
		}
	}
}
