package BankAccount;

import java.util.Scanner;

public class BankApplication {
	//메소드? 생성자? 헷갈림. 기능 구조.
	
	
	
//	객체 자체를 static 으로 하면 됨.. 
	
	
	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
	
	Account account = new Account();
	배열.. // 자료형 혼합으로 받기??어떻게 해죠?힌트.
	
	
	System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5. 종료");
	int inputNum = sc.nextInt();

	switch(inputNum) {
	
	case 1: 
		//계좌번호 입력
		System.out.println("계좌번호를 입력해주세요.");
		String account_num = sc.nextLine();
		account.setAccount_num(account_num);
		
		//이름입력
		System.out.println("이름을 입력해주세요.");
		String name = sc.nextLine();
		account.setName(name);
		
		//초기 예금
		System.out.println("초기 입금액");
		int balance = sc.nextInt();
		account.setBalance(balance);
		
		
		for(int i =0; )
		
		System.out.println("계좌가 생성되었습니다.");
		
		
		
		break;
	case 2:
		System.out.println("현재 계좌 목록: " );
		break;
		
	case 3:
		//왜 오류..? ㅠ
		System.out.println("현재 잔고: " + account.setBalance());
		System.out.println("예금할 금액을 입력해주세요.");
		int money = sc.nextInt();
		System.out.println("예금후 잔액: " + account.setBalance()+money);
		break;
		
	case 4:
		System.out.println("출금할 금액을 입력해주세요.");
		int money2 = sc.nextInt();
		System.out.println("출금후 잔액: " + account.setBalance()-money2);
		break;
		
	case 5:
		System.out.println("종료되었습니다.");
		break;
	
	} sc.close();
		
		
}
	
	
	
}
