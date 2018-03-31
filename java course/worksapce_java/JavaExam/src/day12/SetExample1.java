package day12;
import java.util.*;
public class SetExample1 {
    public static void main(String args[]) {
        HashSet<String> set = new HashSet<>();
        System.out.println(set.size());
        System.out.println(set.add("자바"));
        System.out.println(set.size());
        System.out.println(set.add("카푸치노"));
        System.out.println(set.size());
        System.out.println(set.add("에스프레소"));
        System.out.println(set.size());
        System.out.println(set.add("자바"));
        System.out.println(set.size());
        System.out.println("저장된 데이터의 수 = " + set.size());
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













