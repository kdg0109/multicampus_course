package day11;

import java.util.Random;

class DuplicateException extends Exception {
	DuplicateException() {
		super("중복된 로또 번호가 발생했습니다.");
	}
}

class LottoMachine {
	private int[] nums;
	public LottoMachine() {
		nums = new int[6];
	}
	public void createLottoNums() {
		int cnt = 0;
		int lottoNum;
		Random r = new Random();
		while(cnt < 6) {
/*			lottoNum = (int)(Math.random()*20)+1;
			nums[cnt++] = lottoNum;*/
			nums[cnt++] = r.nextInt(20)+1;
		}
	}
	public void checkLottoNums() throws DuplicateException{
		for(int i = 0; i<nums.length; i++) {
			for(int j = i+1; j<nums.length; j++) {
				if(nums[i] == nums[j]) {
					throw new DuplicateException();
				}
			}
		}
	}
	public int[] getNums() {
		return nums;
	}
}
public class LottoGame {
	public static void main(String[] args) {
		LottoMachine lottoMachine = new LottoMachine();
		try {
			lottoMachine.createLottoNums();
			lottoMachine.checkLottoNums();
			for(int i = 0; i<lottoMachine.getNums().length; i++) {
				System.out.print(lottoMachine.getNums()[i]);
				
				if(i != lottoMachine.getNums().length-1) {
					System.out.print(", ");
				}
			}
		}catch(DuplicateException e) {
			System.out.println(e.getMessage());
		}
	}
}
