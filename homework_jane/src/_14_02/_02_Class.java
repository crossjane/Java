package _14_02;

import java.util.Scanner;

public class _02_Class {
	
//	-------------------클래스--------------------
//	1. 학생의 이름, 학번, 학과를 속성으로 가지고 학생의 정보를 저장하는 메소드와 학생의 정보를 출력하는 메소드를 갖는 학생 클래스를 생성하세요.
//
//	2. 도서의 제목, 저자, 출판사, 가격을 속성으로 가지고 정보를 저장하는 메소드와 정보를 출력하는 메소드를 갖는 도서 클래스를 생성하세요.
//
//	3. 두 문자열을 전달받아 합쳐진 새로운 문자열을 리턴하는 메소드를 구현하세요.
//
//	4. 정수 한 개와 실수 한 개를 전달받아 소수점 두자리까지만 가지는 곱의 결과를 리턴하는 메소드를 구현하세요.
//
//	5. 반지름을 속성으로 갖는 원클래스를 만들고 사용자가 입력한 반지름이 생성자를 통해 속성에 저장되며 원의 넓이와 둘레를 구해서 리턴하는 메소드를 각각 구현하세요.
//
//	6. 잔액을 속성으로 가지고 입금, 출금, 잔액 조회를 메소드로 갖는 계좌 클래스를 생성하세요.
//
//	7. Add라는 클래스를 만들고 정수형 매개변수 2개를 받아서 합을 리턴하는 add 메소드를 구현하세요. 
//	    그리고 오버로딩을 통해 정수형 매개변수 세개를 받아서 각각의 제곱의 합을 리턴하는 add메소드도 구현하세요.

	
//	3. 두 문자열을 전달받아 합쳐진 새로운 문자열을 리턴하는 메소드를 구현하세요.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//3.
		
//		String str1 = sc.nextLine();
//		String str2 = sc.nextLine();
//		
//		_02_Class concat = new _02_Class();
//		
//		System.out.println(concat.concatString(str1, str2));
		
		//4. 
		
		System.out.println("정수를 입력하세요.");
		int a = sc.nextInt();
		System.out.println("실수를 입력하세요.");
		float b = sc.nextFloat();
		
		_02_Class mul = new _02_Class();
		
		System.out.println(mul.mul(a,b));
	
		
	}
	public String concatString(String str1, String str2) {
		return str1+str2;
		
		
	}
	
//	4. 정수 한 개와 실수 한 개를 전달받아 소수점 두자리까지만 가지는 곱의 결과를 리턴하는 메소드를 구현하세요.
	
	public double mul(int a, float b) {
		return Math.round((a * b) * 100) / 100.0;  
		
	}
	
//	5. 반지름을 속성으로 갖는 원클래스를 만들고 사용자가 입력한 반지름이 생성자를 통해 속성에 저장되며 원의 넓이와 둘레를 구해서 리턴하는 메소드를 각각 구현하세요.	
	
//		_03_Circle 파일에 있음 . 

	}
	

}
