package day12;
import java.util.*;
public class SetExample1 {
    public static void main(String args[]) {
        HashSet<String> set = new HashSet<>();
        System.out.println(set.size());
        System.out.println(set.add("�ڹ�"));
        System.out.println(set.size());
        System.out.println(set.add("īǪġ��"));
        System.out.println(set.size());
        System.out.println(set.add("����������"));
        System.out.println(set.size());
        System.out.println(set.add("�ڹ�"));
        System.out.println(set.size());
        System.out.println("����� �������� �� = " + set.size());
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }
        for( String data : set)
        	System.out.println(data);
        System.out.println(set);
    }
}













