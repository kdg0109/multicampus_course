package workshop6.exception;

public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account("441-0290-1203", 500000, 7.3);
		System.out.println("계좌정보 : " + account.getAccount() + " " + account.getBalance()  + " " +  account.getInterestRate());
		System.out.println(account.toString());		//Object의 toString을 오버라이딩
		try {
		account.deposit(-1);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			account.withdraw(600000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("이자 : " + account.calculateInterest());
	}
}
