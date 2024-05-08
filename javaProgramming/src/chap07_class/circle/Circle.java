package chap07_class.circle;

public class Circle {
	
//	필드는 선언과 동시에 초기화된 상수PI(3.14), 
//	int radius 두개를 만들고 기본생성자 하나랑 int 값을 받아서 radius 필드를
//	초기화하는 생성자를 만드세요. 기능으로는 원의둘레(2*PI*radius)를 계산해서
//	double형으로 리턴하는 메소드와 원의 넓이(PI*radius*radius)를 계산해서
//	double 형으로 리턴하는 메소드를 만드세요.
	
	public final double PI = 3.14;
	public int radius;
	
	public Circle() {		//기본생성자.
	}
	
	public Circle(int radius) {	//필드를 초기화하는 생성자.
								//생성자는 클래스명이랑 항상(대소문자)ㄴ 같아야함. 
									//메소드는 앞에 자료형이 추가된 형태임.
		this.radius = radius;
		//생성자를 호출하면 객체가 생성되는데 
		//this는 생성된 객체를 받아온다.
	}
	
	public double dul() {
		return 2* PI *radius;
	}
	
	public double size() {
		return PI* radius *radius;
	}
	
	
	
	
	

}
