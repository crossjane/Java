package Ch21;

// 인터페이스 정의
interface Shape01 {
	double calculateArea();			// 추상 메서드
	void display();					// 추상 메서드
}
// 원 클래스
class Circle01 implements Shape01 {
	private double radius;

	public Circle01(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
		
	}

	@Override
	public void display() {
		System.out.println("원의 넓이 : "  + calculateArea());
		
	}
	
}
// 사각형 클래스
class Rectangle01 implements Shape01 {
	private double length;
	private double width;
	public Rectangle01(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double calculateArea() {
		return length * width;
	}
	
	@Override
	public void display() {
		System.out.println("사각형의 넓이 : " + calculateArea());
	}
	
	
}
public class C01InheritanceMain2 {
	public static void main(String[] args) {
		// 원 객체 생성 및 사용
		Circle01 circle = new Circle01(5);
		circle.display();
		
		// 사각형 객체 생성 및 사용
		Rectangle01 rectangle = new Rectangle01(4, 6);
		rectangle.display();
	}

}
