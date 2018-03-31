package workshop6.exception;

public class Account {
	private String account;
	private double balance;
	private double interestRate;
	
	public Account() { }
	public Account(String account, double balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	@Override //에노테이션 : 코드를 설명하는 구문
	public String toString() {
		return "계좌정보 : " + account + " " + balance + " " + interestRate;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	//현재 잔액 기준 이자 계산
	public double calculateInterest() {
		return balance*interestRate/100;
	}
	//입금 통해 잔액 정보 증가
	public void deposit(double money) throws Exception {
		if(money < 0) {
			throw new Exception("입금 금액이 0보다 적습니다.");
		}else{
			balance += money;
		}
	}
	//출금 통해 잔액 정보 감소
	public void withdraw(double money) throws Exception {
		if(money < 0 || balance < money) {
			throw new Exception("출금 금액이 0보다 적거나 현재 잔액보다 많습니다.");
		}else{
			balance -= - money;
		}
	}
}
