package BankAccount;

import java.util.Scanner;

public class Account {
 
	private String account_num;
	private String name;
	private int balance;
	private int money;
	
	public Account() {
		
	}
	public Account(String account_num, String name, int balance) {
		this.account_num = account_num;
		this.name = name;
		this.balance = balance;
	
	}

	public String getAccount_num() {
		return account_num;
	}

	public void setAccount_num(String account_num) {
		this.account_num = account_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	private static void createAccount(String account_num, String name, int balance){
		//값을 case 3 에서 받아와서 세개의 정보들을 저장하는기능만 만들고 싶음. 어디에 저장?
		account.setAccount_num();
		
		
	}
	
	private static void accountList() {
		
		
		
	}
	
//	//메서드만들려다 포기하고 case에 집어넣기로
//	private static void deposit(double money) {
//		 if (money > 0) {
//	            this.balance += money;
//	            System.out.println(money + "원이 입금되었습니다."); 
//	        } else {
//	            System.out.println("입금할 금액이 없습니다.");
//	        }
//	    }
//		
//	
//
//	private static void witdraw() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("출금할 금액을 입력해주세요.");
//		int money = sc.nextInt();
//		Account account = new Account(money);
//		account.getBalance();
//	}
//	
//	public static showInfo() {
//		
//	}
	
	
}


