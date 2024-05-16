package _14_01;

import java.util.Scanner;

public class _01_var {
	
	
//	--------------------변수--------------------
//	1. 사용자가 입력한 이름, 나이, 성별을 출력하세요.
//
//	2. 사용자가 입력한 두 개의 정수와 문자(char) 연산자를 받아 두 정수로 해당 연산을 진행한 결과를 출력하세요.
//
//	3. 반지름이 20인 원의 넓이와 둘레를 출력하세요.(넓이 : 2 * 3.14 * 반지름 ^ 2, 둘레 : 4 * 3.14 * 반지름)
//	    단, 원주율 3.14는 상수로 선언하세요.
//
//	4. 사용자가 입력한 5개의 정수의 합계와 평균을 출력하세요.
//
//	5. 사용자가 입력한 세 정수의 최소 값, 중간 값, 최대 값을 출력하세요.
//
//	6. 사용자가 입력한 정수의 구구단을 출력하세요.(출력 양식 => 2를 입력했을 때 2 * 1 = 2
//												  2 * 2 = 4
//												  .....
//												  2 * 9 = 18 
//

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("이름을 입력하세요.");
//		String inputName = sc.nextLine();
//		
//		System.out.println(inputName +"님의 나이를 입력하세요.");
//		String inputAge = sc.nextLine();
//		
//		System.out.println(inputName +"님의 성별을 입력하세요.(형식 :남/여)");
//		String inputGender = sc.nextLine();
//		while(true) {
//		if(inputGender.equals("남") || inputGender.equals("여")) {
//			System.out.println("입력이 완료되었습니다.");
//			break;
//		} else {
//			System.out.println("잘못입력하셨습니다. 남 / 여의 형식으로 다시입력해주세요.");
//			//while(); //재귀메소드?
//		}		
//		}
		
//		2. 사용자가 입력한 두 개의 정수와 문자(char) 연산자를 받아 두 정수로 해당 연산을 진행한 결과를 출력하세요.
		
//		System.out.println("정수를 입력해주세요.");
//		int inputNum1 = sc.nextInt();
//		System.out.println("정수를 입력해주세요.");
//		int inputNum2 = sc.nextInt();
//		System.out.println("연산자를 입력해주세요.");
//		char inputChar = sc.next().charAt(0);
		
//		1. next() 메서드
//
//		next() 메서드는 사용자 입력을 공백 문자(스페이스, 탭, 엔터 등)까지만 읽어들입니다.
//		따라서 사용자가 입력한 문자열 중 공백 문자 이전까지의 부분만 가져옵니다.
//		예를 들어 사용자가 "Hello World"를 입력했다면, next()는 "Hello"만 가져옵니다.
//		2. nextLine() 메서드
//
//		nextLine() 메서드는 사용자 입력을 줄 바꿈 문자(엔터)까지 모두 읽어들입니다.
//		따라서 사용자가 입력한 문자열 전체를 가져옵니다.
//		예를 들어 사용자가 "Hello World"를 입력했다면, nextLine()은 "Hello World"를 모두 가져옵니다.
//		3. 왜 next()를 사용했을까?
//
//		이 코드에서는 사용자가 입력한 연산자 문자 하나만 필요하기 때문에 next()를 사용했습니다.
//		next()는 공백 문자까지만 읽어들이므로, 사용자가 입력한 연산자 문자 하나만 가져올 수 있습니다.
//		반면 nextLine()은 줄 바꿈 문자까지 모두 읽어들이므로, 사용자가 입력한 문자열 전체를 가져오게 됩니다.
//		따라서 이 코드에서는 연산자 문자 하나만 필요하므로 next()를 사용한 것이 적절한 선택이었습니다.
		
		
//		int result = 0; 
//		
//		switch(inputChar) {
//			case '+': 
//				result = inputNum1 + inputNum2;
//				break;
//			case '-': 
//				result = inputNum1 - inputNum2;
//				break;
//			case '*': 
//				result = inputNum1 * inputNum2;
//				break;
//			case '/': 
//				result = inputNum1 / inputNum2;
//				break;
//			default : 
//				System.out.println("올바른 연산자를 입력하세요.");
//		}
		
		
	//	System.out.println("값:"+result);
		


		
//		7. 사용자가 입력한 정수로 해당 정수의 팩토리얼을 계산하여 출력하세요.(재귀메소드 없이, while이나 for 반복문을 사용)
		
		
//		System.out.println("정수를 입력하세요");
//		int num = sc.nextInt();
//		
//		int result1 = 1;
//		
//		
//		for(int i = 1 ; i <= num; i++) {
//			result1 *= i;
//
//			} 
//		System.out.println(result1); 
//			
		
		


		

		
	}

}
