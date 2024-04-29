package Ch13;

//class Bank{
//
//	// 속성(멤버 변수) 선언
//	// 계좌번호
//	private String accountNumber;
//	// 계좌잔액
//	private double balance;
//	
//	// 기능(멤버 메서드) 선언
//	
//	// 생성자
//	public Bank(String accountNumber, double balance) {
//		this.accountNumber = accountNumber;
//		this.balance = balance;
//		
//	}
//	
//	// 입금 메서드
//	public void deposit(double amount) {
//		balance += amount;
//		System.out.println("[SYSTEM] : 입금 완료.");
//		System.out.println("현재 잔액 : $" + balance);
//		
//	}
//	
//	// 출금 메서드
//	public void withdraw(double amount) {
//		if(balance >= amount) { // 출금하려는 돈이 딱 맞춰서 있거나 그보다 많을경우
//			balance -= amount;
//			System.out.println("[SYSTEM] : 출금 완료.");
//			System.out.println("현재 잔액 : $" + balance);
//		} else {			 	// 돈이 부족한 경우
//			System.out.println("[SYSTEM] : 잔액이 부족합니다.");
//			
//		}
//		
//		
//	}
//	
//	// 계좌번호 확인 메서드 (Getter)
//	public String getAccountNumber() {
//		return accountNumber;
//	}
//	// 계좌번호 설정 메서드 (Setter)
//	public void setAccountNumber(String accountNumber) {
//		this.accountNumber = accountNumber;
//	}
//	// 잔액 확인 메서드 (Getter)
//	public double getBalance() {
//		return balance;
//	}
//	// 잔액 설정 메서드  (Setter)
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
//	
//}

public class C05AccountMain {

	// 속성(멤버 변수) 선언
	// 계좌번호
	private String accountNumber;
	// 계좌잔액
	private double balance;
	
	// 기능(멤버 메서드) 선언
	
	// 생성자
	public C05AccountMain(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		
	}
	
	// 입금 메서드
	public void deposit(double amount) {
		balance += amount;
		System.out.println("[SYSTEM] : 입금 완료.");
		System.out.println("현재 잔액 : $" + balance);
		
	}
	
	// 출금 메서드
	public void withdraw(double amount) {
		if(balance >= amount) { // 출금하려는 돈이 딱 맞춰서 있거나 그보다 많을경우
			balance -= amount;
			System.out.println("[SYSTEM] : 출금 완료.");
			System.out.println("현재 잔액 : $" + balance);
		} else {			 	// 돈이 부족한 경우
			System.out.println("[SYSTEM] : 잔액이 부족합니다.");
			
		}
		
		
	}
	
	// 계좌번호 확인 메서드 (Getter)
	public String getAccountNumber() {
		return accountNumber;
	}
	// 계좌번호 설정 메서드 (Setter)
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	// 잔액 확인 메서드 (Getter)
	public double getBalance() {
		return balance;
	}
	// 잔액 설정 메서드  (Setter)
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	
	public static void main(String[] args) {
		// Account 클래스와 인스턴스 생성
		C05AccountMain myAccount = new C05AccountMain("123456789", 100000.0);
		
		
		//입금
		myAccount.deposit(1000.0);
		
		
		// 잔액 확인
		System.out.println("현재 잔액 : $" + myAccount.getBalance());
		
		
		
		// 출금
		myAccount.withdraw(102000.0);
		
		
		// 잔액 확인
		System.out.println("현재 잔액 : $" + myAccount.getBalance());
	}

	
	
	

}
