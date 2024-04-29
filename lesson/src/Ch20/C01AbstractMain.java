package Ch20;



class Super01 {
	void func1() {
		
	}
	
}

class Sub01 extends Super01 {
	void func1() {
		System.out.println("지금 내 마음대로 재정의하고 출력하는 코드입니다!");
		
	}
}

//----------------------추상 클래스 상속관계 ------------------------------
abstract class Super02 {
	abstract void func2();
}

class Sub02 extends Super02 {

	@Override
	void func2() {
		System.out.println("지금 강제로 재정의하고 출력하는 코드입니다!!");
	}
}

public class C01AbstractMain {
	
	public static void main(String[] args) {
		Super01 obj1 = new Sub01();			// 업캐스팅
		obj1.func1();
		
		C01AbstractMain test = new C01AbstractMain();
		
	
//		Super02 obj2 = new Super02();		// ERROR : 객체 생성 X
		Super02 obj3 = new Sub02();			// 업캐스팅
		obj3.func2();
		
		
		
		
	}

}
