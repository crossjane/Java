package Ch18;
class C02Simple {
	int n1;
	static int n2;
	
	void Func1() {
		n1 = 10;
		n2 = 20;
	}
	
	
	static void Func2() {
		
//		n1 = 10;				// Error 발생 Why? : 객체를 만들고 접근 가능한 변수가 n1임.
								// static은 객체가 없어도 부를 수 있어야 해요.
								// 만약에 Func2()에서 n1 =10; 코드가 유효하다면, 어떤 객체에 대한 n1인지 우리는 알 수가 없어요!!
					
		
		n2 = 20;				// 모든 객체의 n2의 정보가 20으로 바뀜.
		
		int num = 10;			// 사용가능, num은 지역변수
	}
	
	
	
}
public class C02Static {
	public static void main(String[] args) {
		C02Simple a = new C02Simple();
		a.n2 = 100;
		System.out.println(C02Simple.n2);
		
		C02Simple b = new C02Simple();
		b.n2 = 200;
		System.out.println(C02Simple.n2);
		
		C02Simple.Func2();
		System.out.println(C02Simple.n2);		
		System.out.println(a.n2);
		System.out.println(b.n2);
	}

}
