package day12;

import java.util.HashSet;
import java.util.Random;

public class LottoSet {
	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<>();
		int nums = 0;
		Random r = new Random();
		while(hashSet.size() != 10) {
//			nums = (int)(Math.random()*21)+10;
			nums =  r.nextInt(21)+10;			//0~ 20까지 + 10
			hashSet.add(nums);
		}
		System.out.print("오늘의 로또 번호 : ");
		for(int lottoNum : hashSet) {
			System.out.print(lottoNum);
			if(lottoNum != (int)hashSet.toArray()[hashSet.toArray().length-1]) {
				System.out.print(", ");
			}
		}
	}
}
