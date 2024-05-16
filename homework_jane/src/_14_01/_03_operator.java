package _14_01;

import java.util.Scanner;

public class _03_operator {
	
	
//	--------------------연산자--------------------
//
//	1. 사용자가 입력한 두 정수읜 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
//	  (메소드로 따로 만들지 말고 메인메소드에서 구현)
//
//	2. int형 변수 20을 증감연산자를 사용해서 다음과 같은 순서로 출력되도록 구현하세요. 
	//21, 22, 22, 21, 20, 20, 19, 마지막 변수의 값(증감연산자 없이) : 20
//
//	3. 사용자가 입력한 정수가 2와 7의 공배수면 "2와 7의 공배수"라고 출력하고 아니면 "2와 7의 공배수가 아님"이라고
	//출력하세요.
//
//	4. 사용자로부터 입력받은 문자열이 "Hello"인지 아닌지 판별하는 프로그램을 작성하세요.
//
//	5. 삼항연산자를 이용하여 사용자가 입력한 정수가 홀수면 "홀수" 짝수면 "짝수"라고 출력하세요.
//
//	6. 삼항연산자의 중첩을 이용하여 사용자가 입력한 정수가 100보다 크면 "100보다 큼" 작으면
	//"100보다 작음" 같으면 "100"을 출력하세요.
//
//	7. 사용자가 입력한 두 실수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
//
//	8. 사용자가 입력한 하나의 문자열과 하나의 정수로 "입력한 문자열 xxxxx이고, 입력한 숫자는 xxxxxx입니다." 
	//라고 출력하세요.


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수를 입력하세요.");
//		int inputNum1 = sc.nextInt();
//		
//		System.out.println("정수를 입력하세요.");
//		int inputNum2 = sc.nextInt();
//		
//		System.out.println(inputNum1 + inputNum2);
//		System.out.println(inputNum1 - inputNum2);
//		System.out.println(inputNum1 * inputNum2);
//		
//		
//		if(inputNum1 == 0 || inputNum2 == 0) {
//			System.out.println("0은 나눌 수 없습니다.");
//			}else {
//			System.out.println(inputNum1 / inputNum2);
//			}
//		
//		System.out.println(inputNum1 % inputNum2);
//		
//		if(inputNum1 == 0 || inputNum2 == 0) {
//			System.out.println("0은 나눌 수 없습니다.");
//			}else {
//			System.out.println(inputNum1 % inputNum2);
//			}
//		
		
//		2. int형 변수 20을 증감연산자를 사용해서 다음과 같은 순서로 출력되도록 구현하세요. 
		//21, 22, 22, 21, 20, 20, 19, 마지막 변수의 값(증감연산자 없이) : 20
		
//		int inVar = 20;
//		
//		System.out.println(++inVar);
//		System.out.println(++inVar);
//		System.out.println(inVar--);
//		System.out.println(--inVar);
//		System.out.println(inVar--);	
//		System.out.println(inVar--);
//		System.out.println("마지막 변수의 값: " + 20);
		
		
//		3. 사용자가 입력한 정수가 2와 7의 공배수면 "2와 7의 공배수"라고 출력하고 아니면 "2와 7의 공배수가 아님"이라고
		//출력하세요
		
//		int num = sc.nextInt();
//		
//		
//		if(num % 2 ==0 && num % 7 == 0 ) {
//			System.out.println("2와 7의 공배수");
//		} else {
//			System.out.println("2와 7의 공배수가 아님");
//		}
		
//		4. 사용자로부터 입력받은 문자열이 "Hello"인지 아닌지 판별하는 프로그램을 작성하세요.
		
//		String inputStr = sc.nextLine(); 
//		boolean isStr = inputStr.equals("Hello");
//		
//		if(isStr) {
//			System.out.println("입력한 문자가 Hello가 맞습니다.");
//		} else {
//			System.out.println("입력한 문자가 Hello가 아닙니다.");
//		}
//	
//		//5. 삼항연산자를 이용하여 사용자가 입력한 정수가 홀수면 "홀수" 짝수면 "짝수"라고 출력하세요.	
//		
//		int num1 = sc.nextInt();
//		
//		String result =  (num1 % 2 == 0) ? "짝수" :"홀수";
//		System.out.println(result);
		
//		6. 삼항연산자의 중첩을 이용하여 사용자가 입력한 정수가 100보다 크면 "100보다 큼" 작으면
		//"100보다 작음" 같으면 "100"을 출력하세요.
		
//		int num3 = sc.nextInt();
//		
//		String result2 = (num3 > 100)? "100보다 큼" :(num3 < 100)? "100보다 작음" :"100";
//		System.out.println(result2);
		
		//	7. 사용자가 입력한 두 실수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
		
//		float num4 = sc.nextFloat();
//		float num5 = sc.nextFloat();
//		
//		System.out.println(num4 + num5);
//		System.out.println(num4 - num5);
//		System.out.println(num4 * num5);
//		
//		if(num4 == 0 || num5 == 0) {
//			System.out.println("0은 나눌 수 없습니다.");
//			}else {
//			System.out.println(num4 / num5);
//			}
//		
//		if(num4 == 0 || num5 == 0) {
//			System.out.println("0은 나눌 수 없습니다.");
//			}else {
//			System.out.println(num4 % num5);
//			}

		
//		8. 사용자가 입력한 하나의 문자열과 하나의 정수로 "입력한 문자열 xxxxx이고, 입력한 숫자는 xxxxxx입니다." 
		//라고 출력하세요.
		
		System.out.println("문자열을 입력하세요.");
		String str2 = sc.nextLine();
		System.out.println("정수를 입력하세요.");
		int num6 = sc.nextInt();
		System.out.println("입력한 문자열은 " + str2 +"이고, 입력한 숫자는 " + num6 + "입니다.");
		
		
	}

}
