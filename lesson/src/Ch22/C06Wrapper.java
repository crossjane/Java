package Ch22;
//### Wrapper Class ###

//Wrapper 클래스는 자바에서 기본 데이터 타입(primitive types)을 객체로 감싸기 위한 클래스들을 말함. 
//기본 데이터 타입에 해당하는 int, char, boolean, double, 등을 객체로 다루기 위해 제공되는 클래스.
//이러한 Wrapper 클래스들은 해당 기본 데이터 타입의 값을 갖고 있고, 각종 유용한 메서드를 제공하여 객체로서의 동작을 가능하게 함.

//1. Integer		: int의 Wrapper 클래스
//2. Long			: long의 Wrapper 클래스
//3. Float			: float의 Wrapper 클래스
//4. Double		: double의 Wrapper 클래스
//5. Character		: char의 Wrapper 클래스
//6. Boolean		: boolean의 Wrapper 클래스
//7. Byte			: byte의 Wrapper 클래스
//8. Short			: short의 Wrapper 클래스

//Wrapper 클래스는 객체이므로 null도 가질 수 있고, 기본 데이터 타입의 값을 객체로 다룰 수 있음.
//또한, 자동 박싱(autoboxing)과 자동 언박싱(autounboxing)이라는 개념이 O
//==> 기본 데이터 타입과 Wrapper 클래스 간에 자동으로 변환될 수 있음.

////자동 박싱 (Autoboxing)
//Integer intObject = 42; // int를 Integer로 자동으로 변환
//
////자동 언박싱 (Autounboxing)
//int intValue = intObject; // Integer를 int로 자동으로 변환




public class C06Wrapper {
	public static void main(String[] args) {
		
		// Boxing (자료 --> Integer 정수형 객체로 변환)
		Integer obj1 = new Integer(100);
		// The constructor Integer(int) has been deprecated since version 9 and marked for removal
		
		Integer obj2 = new Integer("200");
		// Integer(String) 생성자의 내부 로직 : Integer.parseInf(String)이 담겨있음.
		System.out.println(obj2 + 10);
		
		
		
		
		
		int intValue = 100;
		Integer obj3 = Integer.valueOf(intValue);
		// Integer(int) 생성자 == deprecated(쓸모없음)
		// 대신해서 valueOf(int)메서드를 사용하여 새로운 방식으로 Integer 객체를 생성하라 !!
		
		
		// UnBoxing(Integer자료 --> 일반자료형)
		
		int value1 = obj1.intValue();
		
		System.out.println(value1);
		
		
		
		// 자동 Boxing
		Integer obj = 100;	// autoBoxing
		int n1 = obj + 10;	// autoUnboxing
		
		
		
		
		
		
		
		
	}
}
