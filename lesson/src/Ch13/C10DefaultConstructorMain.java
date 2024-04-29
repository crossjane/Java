package Ch13;

class C10Constructor {
	private int value;

	// 디폴트 생성자
	public C10Constructor() {
		this.value = 0;
		System.out.println("디폴트 생성자 호출");
	}
	
	// 매개변수 생성자
	public C10Constructor(int value) {
		this.value = value;
		System.out.println("매개변수 생성자 호출 with value : " + value);
	}
	
	// Getter 메서드
	public int getValue() {
		return value;
	}
	
	// Setter 메서드
	public void setValue(int value) {
		this.value = value;
	}
}

public class C10DefaultConstructorMain {
	public static void main(String[] args) {
		// 디폴트 생성자 호출
		C10Constructor a = new C10Constructor();
		
		//매개변수 생성자 호출
		C10Constructor b = new C10Constructor(42);
		
		System.out.println();
		
		
		// 값을 가져와서 출력
		System.out.println("Default Constructor 객체 값 : " + a.getValue());
		System.out.println("Parameterized Constructor 객체 값 : " + b.getValue());
		System.out.println();
		
		// 값을 변경하고 출력
		a.setValue(10);
		b.setValue(99);
		
		System.out.println("수정된 Default Constructor 객체 값 : " + a.getValue());
		System.out.println("수정된 Paramterized Constructor 객체 값 : " + b.getValue());
		System.out.println();
	}

}
