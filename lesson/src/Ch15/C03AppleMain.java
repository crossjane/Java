package Ch15;

class Seller {
	int savedMoney;
	int appleCnt;
	int applePrice;
	// 매개변수 생성자
	public Seller (int savedMoney, int appleCnt, int applePrice	) {
		this.savedMoney = savedMoney;
		this.appleCnt = appleCnt;
		this.applePrice = applePrice;
		
	}
	
	
	public int returnApple (int money) {
		// seller의 보유금액에 덧셈
		savedMoney += money;
		
		// seller의 보유사과개수 뺄셈(money어치만큼)
		int cnt = money / applePrice;
		appleCnt -= cnt;
		return cnt;
		
	}
	
}


class Buyer {
	int myMoney;
	int myApple;
	
	// 매개변수 생성자
	public Buyer(int myMoney, int myApple) {
		this.myMoney = myMoney;
		this.myApple = myApple;
	}
	
	public void pay(Seller seller, int money) {
		// 내 돈에서 2000원 빼는 과정
		myMoney -= money;
		
		// seller에게 2000원 전달 ==> ? 메서드를 만들어야하나!?
		int cnt = seller.returnApple(money);
		
		myApple += cnt;
		
		
		
	}
	
	

	
	
}

public class C03AppleMain {
	
	public static void main(String[] args) {
		Seller youngSmartStore = new Seller(10000, 100, 1000);			// 보유금액, 보유사과개수, 사과 가격
		Buyer person = new Buyer(5000, 0);		// 보유금액, 보유사과개수
		
		person.pay(youngSmartStore, 2000);
		System.out.println(youngSmartStore);// 보유금액, 보유사과개수, 사과 가격
		System.out.println(person); 		// 보유금액, 보유사과개수
	}

}
