package day4;

import java.util.HashMap;

public class LottoMachine1 {
	public static void main(String[] args) {
		int lotto[ ] = new int[6];
		int lottoTmp;
		
		while(lotto[lotto.length-1]== 0){
			lottoTmp = (int)(Math.random()*45)+1;

			for(int i = 0; i < lotto.length; i++){
				if(lottoTmp == lotto[i]){
					break;
				}else if(lotto[i] == 0) {
					lotto[i] = lottoTmp;
					break;
				}
			}
		}
		
		System.out.print("오늘의 로또 번호 - ");
		for(int j = 0; j < lotto.length; j++){
			System.out.print(lotto[j]);
			
			if(j+1 != lotto.length){
				System.out.print(", ");
			}
		}
		
		
		/**
		 * 
		 * 
		 * 모범 답압
		 * 
		 * 
		 * 
		 */
//		int lotto[ ] = new int[6];
//		int cnt = 0;
//		int tmp;
//		boolean b = false;
//		
//		while(cnt < 6){
//			tmp = (int)(Math.random()*45)+1;
//			b = false;
//			for(int i = 0; i < cnt; i++){
//				if(tmp == lotto[i]){
//					b = true;
//					break;
//				}
//			}
//			if(!b)
//				lotto[cnt++] = tmp;
//		}
//		
//		System.out.print("오늘의 로또 번호 - ");
//		for(int j = 0; j < lotto.length; j++){
//			System.out.print(lotto[j]);
//			
//			if(j+1 != lotto.length){
//				System.out.print(", ");
//			}
//		}
	}
}
