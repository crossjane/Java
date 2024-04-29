package Ch13;

//문제 1: 사각형 클래스 만들기


//1. Rectangle 클래스를 작성하세요.
//2. width와 height라는 두 개의 속성(멤버 변수)을 가지도록 클래스를 구성하세요.
//3. 생성자를 통해 width와 height를 초기화하세요.
//4. getArea() 메소드를 구현하여 사각형의 넓이를 반환하세요.
//5. getPerimeter() 메소드를 구현하여 사각형의 둘레를 반환하세요.

public class C07PracRectangle {
	private double width;
	private double height;
	
	// 매개변수 생성자
	public C07PracRectangle(double width, double height) {
		this.width = width;
		this.height = height;
		
	}
	
	// 넓이 반환
	public double getArea() {
		return width * height;
	}
	
	// 둘레 반환
	public double getPerimeter() {
		return (width + height) * 2;
	}
	
	public static void main(String[] args) {
		C07PracRectangle myRec = new C07PracRectangle(5.0, 3.0);
		System.out.println("넓이 : " + myRec.getArea());
		System.out.println("둘레 : " + myRec.getPerimeter());
	}
	
	

}
