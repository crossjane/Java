package Ch19;


class A {
	int n1 = 10;
}

class B extends A {
	int n2 = 20;
}
class C extends A {
	int n3 = 30;
}
class D extends B {
	int n4 = 40;
}
class E extends C {}
class F extends E {}

public class C06Upcasting {
	public static void UpcastingTest(A tmp) {// A tmp = obj
		System.out.println(tmp.n1);
		// instanceof
		if (tmp instanceof B) {
			B down = (B) tmp;
			System.out.println(down.n2);
		}
		if (tmp instanceof C) {
			C down = (C) tmp;
			System.out.println(down.n3);
		}
		if (tmp instanceof D) {
			D down = (D)tmp;
			System.out.println(down.n4);
		}
	}
	public static void main(String[] args) {
		B obj = new B();
		C obj1 = new C();
		D obj2 = new D();
		E obj3 = new E();
		F obj4 = new F();
		UpcastingTest(obj);
		UpcastingTest(obj1);
		UpcastingTest(obj2); 		// A가 B에 걸리고, B가 D에 걸림. 
									// 출력 결과 : 10, 20, 40
		UpcastingTest(obj3);
		UpcastingTest(obj4);
		
		
		
		
	}

}
