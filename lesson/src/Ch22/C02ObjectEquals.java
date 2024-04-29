package Ch22;
class C02Simple {
	int n ;
	public C02Simple(int n) {
		this.n = n;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof C02Simple	 ) {
			C02Simple down = (C02Simple) obj;
			System.out.println("받은 객체는 C02Simple클래스의 인스턴스는 맞다.");
			boolean flag = (this.n == down.n);
			return flag;
		}
		System.out.println("받은 객체는 C02Simple클래스의 인스턴스가 아니다.");
		return false;
		
	}
	
	
	
}

class ABC  extends C02Simple{
	int x;
	public ABC(int n, int x) {
		super(n);
		this.x = x;
	}
}


public class C02ObjectEquals {
	
	public static void main(String[] args) {
		C02Simple ob1 = new C02Simple(10);
		C02Simple ob2 = new C02Simple(10);
		
		ABC ob3 = new ABC(10, 20);
		
		System.out.println(ob2.equals(ob3));
		
	}

}
