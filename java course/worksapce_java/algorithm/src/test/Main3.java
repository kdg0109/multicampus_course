package test;

import java.util.HashMap;
import java.util.Iterator;

public class Main3 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("�ظ�", 95);
		map.put("�츣�̿´�", 100);
		map.put("��", 85);
		Integer num = map.get("�츣�̿´�");
		int num1 = map.get("�츣�̿´�");
        System.out.println("�츣�̿´��� ������? " + num);
        System.out.println("�츣�̿´��� ������? " + num1);

        System.out.println(map.keySet());
        Iterator<String> it = map.keySet().iterator();
        while(it.hasNext()) {
        	String str = it.next();
        	System.out.println(map.get(str));
        	
        	for(String str1 : map.keySet()) {
        		System.out.println(map.get(str1));
        	}
        }
	}
}