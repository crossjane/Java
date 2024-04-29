package Ch13;


class C12Simple extends Object {
	// 속성
	int x;				// 0
	double y;			// 0.0
	char z;				// ' '
	boolean b;			// false
	String str;			// null
	
	
	// 디폴트 생성자
	public C12Simple() {
		System.out.println("디폴트 생성자 호출!");
	}


	@Override
	public String toString() {
		return "C12Simple [x=" + x + ", y=" + y + ", z=" + z + ", b=" + b + ", str=" + str + "]";
	}


	
	
	
	
}
public class C12ConstructorMain {
	public static void main(String[] args) {
		
		C12Simple obj = new C12Simple();			// C11 Simple() == 생성자 함수
		System.out.println(obj.toString());
		System.out.println(obj);
		
	}

}
