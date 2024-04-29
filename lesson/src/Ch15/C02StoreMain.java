package Ch15;
class Customer {
	// 속성
	int myMoney;			// 보유금액
	int colaCnt;			// 콜라보유개수
	
	// 기능
	// 매개변수 
	public Customer(int myMoney, int colaCnt) {
		super();
		this.myMoney = myMoney;
		this.colaCnt = colaCnt;
	}
	// 구매하기
	void pay(Store store, int money) {
		if(myMoney >= money) {
			// 1. 내 보유금액에서 money 차감
			myMoney -= money;
			// 2. 지정된 store에 money를 전달하고 콜라 개수를 리턴받음.
			int cnt = store.returnCola(money);
			
			// 3. 콜라보유개수에 콜라개수를 누적
			colaCnt += cnt;
		} else {
			System.out.println("[SYSTEM] : 돈이 부족합니다. 통장잔고를 확인해주세요.");
			return ;
			
			
		}
		
		
		
	}
	
	@Override
	public String toString() {
		return "Customer [myMoney=" + myMoney + ", colaCnt=" + colaCnt + "]";
	}
	
}

class Store {
	// 속성
	int savedMoney;			// 보유금액
	int colaCnt;			// 콜라재고량
	int price;				// 콜라가격
	
	// 기능
	
	public Store(int savedMoney, int colaCnt, int price) {
		super();
		this.savedMoney = savedMoney;
		this.colaCnt = colaCnt;
		this.price = price;
	}
	
	
	int returnCola(int money) {
		// 1. 보유금액에 받은 금액 추가
		savedMoney += money;
		
		// 2. 받은 금액만큼 콜라재고량 감소
		int cnt = money / price;
		colaCnt -= cnt;
		
		// 3. 콜라 개수 리턴
		return cnt;
		
	}

	@Override
	public String toString() {
		return "Store [savedMoney=" + savedMoney + ", colaCnt=" + colaCnt + ", price=" + price + "]";
	}
	
	
}


public class C02StoreMain {
	public static void main(String[] args) {
		// 고객 객체
		Customer hong = new Customer(10000, 0);
		Customer dong = new Customer(99999, 3);
		
		
		// 편의점 객체
		Store GS대구 = new Store(100000, 100, 1000); // 보유금액, 콜라보유량, 콜라가격
		Store GS서울 = new Store(300000, 1000, 3000); // 보유금액, 콜라보유량, 콜라가격
		
		hong.pay(GS서울, 9000);
		dong.pay(GS서울, 90000);
		
		hong.pay(GS대구, 1000);
		
		
		System.out.println("------------------고객 정보 확인-----------------------");
		System.out.println(hong);
		System.out.println(dong);
		System.out.println("------------------편의점 정보 확인-----------------------");
		System.out.println(GS대구);
		System.out.println(GS서울);
		
		
		
		
		
		
		
	}

}
