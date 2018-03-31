package day12;

import java.util.*;

public class GenericTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();			// < > �� ���ָ� ��� Object�� �ν��ϰ� �ȴ�.
		list.add("java");
		list.add(100);
		list.add("servlet");
		list.add("jdbc");
		/*
		 * 
		 * �ε����� �ʿ���
		 * 
		 */
		//get�� �̿��Ͽ� ����
		for(int i = 0; i < list.size(); i++) 
			System.out.println(list.get(i));
		System.out.println();
		
		/*
		 * 
		 * �ε����� �ʿ���� ��� ������� ����
		 * �ӵ��� get�̿��ؼ� ������ �ͺ��� ���� ��~�� ū ���̴� ����
		 * 
		 */
		//���������� Iterator�� �����
		for(Object value : list) {
			String s = (String)value;
			System.out.println(s);
		}
		System.out.println();
		
		Iterator iter = list.iterator();
		while(iter.hasNext()) {
			String s = (String)iter.next();
			System.out.println(s);
		}
	}
}
