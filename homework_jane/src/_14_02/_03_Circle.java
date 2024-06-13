package _14_02;

import java.util.Scanner;

public class _03_Circle {
	
	final double pie = 3.14;
public static void main(String[] args) {
	

	Scanner sc = new Scanner(System.in);
	System.out.println("반지름을 입력하세요.");
	int num1 = sc.nextInt();
	
	_03_Circle cir = new _03_Circle();
	
	System.out.println(cir.dul(num1));
	System.out.println(cir.size(num1));
	
	

	
}
//	5. 반지름을 속성으로 갖는 원클래스를 만들고 사용자가 입력한 반지름이 생성자를 통해 속성에 저장되며 원의 넓이와 둘레를 구해서 리턴하는 메소드를 각각 구현하세요.	
	
	public double dul(double num1) {
							
			return 2 * 3.14 * num1; 

	}
	

	public double size(double num1) {
		return  num1 * num1 * pie;
	}


	
}
