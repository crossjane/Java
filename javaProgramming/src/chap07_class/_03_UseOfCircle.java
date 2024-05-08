package chap07_class;

import chap07_class.circle.Circle;

public class _03_UseOfCircle {

	public static void main(String[] args) {
		
		Circle circle = new Circle(10);   
		// circle클래스파일의 두번째 생성자에 해당됨
		//그래서 radius에 10이 전달됨.
		
		System.out.println(circle.radius);
		System.out.println(circle.dul());
		System.out.println(circle.size());
		
		
		
		
		
		

	}

}
