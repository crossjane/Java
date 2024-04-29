package Ch13;





// 예시 클래스
public class C03AccessModifier {
	// public 접근 제어자
	public int publicField;
	
	// protected 접근 제어자
	protected int protectedField;
	// default (package-private) 접근 제어자
	int defaultField;
	// private 접근 제어자
	private int privateField;
	
	// 생성자
	public C03AccessModifier(int publicField, int protectedField, int defaultField, int privateField) {
		
		this.publicField = publicField;
		this.protectedField = protectedField;
		this.defaultField = defaultField;
		this.privateField = privateField;
	}
	
	
	// 메서드
	public void publicMethod() {
		System.out.println("1. Public Method");
	}
	
	protected void protectedMethod() {
		System.out.println("2. protected Method");
	}
	
	void defaultMethod() {
		System.out.println("3. default Method");
	}
	
	private void privateMethod() {
		System.out.println("4. private Method");
	}
	
//	### Getter와 Setter ###
	// 객체 지향 프로그래밍에서 클래스의 속성(멤버 변수)에 접근하거나 값을 설정하기 위한 메서드
	
	// Getter() 메서드( == 접근자 메서드 ) 지정
	// Getter는 클래스의 private 속성 값을 읽어오는 메서드
	// 일반적으로 속성 이름 앞에 "get"을 붙여서 메서드 이름을 지정함
	// Getter 메서드는 주로 해당 속성의 값을 반환
	public int getPrivateField() {
		return privateField;
	}
	
	
	// Setter() 메서드( == 설정자 메서드 ) 지정
	// Setter는 클래스의 private 속성 값을 설정하는 메서드
	// 일반적으로 속성 이름 앞에 "set"을 붙여서 메서드 이름을 지정함
	// Setter 메서드는 주로 해당 속성에 값을 설정
	public void setPrivateField(int privateField) {
		this.privateField = privateField;
	}
	
	
	
	
	
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		//문제
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

		//1. C03AccessModifier 클래스를 완성하세요
		//2. 네가지 속성(속성 이름과 타입은 상관 X)을 정의하되, 각각 접근제어자를 달리 설정해주세요!
		//3. 또, 네가지 기능(기능의 로직은 상관 X)을 정의하되, 각각 접근제어자를 달리 설정해주세요!
		//4. Private 접근 제어자로 설정되어 있는 멤버속성에 대한 Setter와 Getter를 설정해주세요!
	
	public static void main(String[] args) {
		
		// C03AccessModifier의 인스턴스 생성
		C03AccessModifier myObject = new C03AccessModifier(1,2,3,4);
		
		
		
		// public 메서드 호출
		myObject.publicMethod();
		// protected 메서드 호출 (같은 패키지 내에서 가능)
		myObject.protectedMethod();
		// default 메서드 호출 (같은 패키지 내에서 가능)
		myObject.defaultMethod();
		// private 메서드 호출 (동일 클래스 내에서만 가능)
		myObject.privateMethod();
		
		
		System.out.println();
		
		// C03AccessModifier의 필드에 접근
		System.out.println("Public Field : " + myObject.publicField);
		System.out.println("Protected Field : " + myObject.protectedField);
		System.out.println("Default Field : " + myObject.defaultField);
		System.out.println("Private Field : " + myObject.privateField);
		
		// private 필드는 클래스 내에서만 접근 가능
		System.out.println("------------- GETTER와 SETTER 사용 ---------------");
		
		System.out.println("Private Field : " + myObject.getPrivateField());
		myObject.setPrivateField(5);
		System.out.println("Private Field : " + myObject.getPrivateField());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	

}
