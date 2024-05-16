package _14_01;

import java.util.Scanner;

public class _02_change {
	
//	--------------------형 변환--------------------
//	1. 사용자가 두 개의 정수를 입력하면 문자열로 받아서 두 개의 문자열 정수를 정수형으로 변환해서 합을 출력하세요. 
//
//	2. 사용자가 두 개의 정수(a, b)를 입력해서 a / b의 연산결과를 실수로 출력하세요.(단, b는 0을 입력할 수 없습니다.)
//
//	3. 사용자가 실수 한 개를 입력하면 정수형으로 변환해서 출력하세요.
//
//	4. 사용자가 한 개의 실수를 입력하면 그 실수의 제곱의 결과를 문자열로 변환하여 출력하세요.
//
//	5. int형 변수 iNum = 10과 long형 변수 lNum = 20의 값을 서로 교환하세요.
//
//	6. 사용자가 입력한 두 개의 문자 각각의 유니코드를 출력하세요.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수를 입력하세요.");
//		String inputNum1 = sc.nextLine();
//		
//		System.out.println("정수를 입력하세요.");
//		String inputNum2 = sc.nextLine();
//		
//		System.out.println( Integer.parseInt(inputNum1) + Integer.parseInt(inputNum2));
		
		
//		System.out.println("정수를 입력하세요.");
//		int num1 = sc.nextInt();	
//		
//		System.out.println("정수를 입력하세요.");
//		int num2 = sc.nextInt();	
//		if(num2 == 0) {
//			System.out.println("잘못입력하셨습니다.");
//			
//			//리턴을 쓰면 if문 종료할 수 있다.
//			return;
//		}
//		
//		System.out.println((double)(num1/num2));
		
		
//		3. 사용자가 실수 한 개를 입력하면 정수형으로 변환해서 출력하세요.
		
		
//		float fNum = sc.nextFloat();
//		
//		System.out.println((int)fNum);
		
	//	4. 사용자가 한 개의 실수를 입력하면 그 실수의 제곱의 결과를 문자열로 변환하여 출력하세요.	
		

//		float fNum1 = sc.nextFloat();
//		
//		System.out.println(String.valueOf(fNum1*fNum1));
		
//		5. int형 변수 iNum = 10과 long형 변수 lNum = 20의 값을 서로 교환하세요.
		
//		int iNum = 10;
//		long lNum = 20;
//		
//		//임시변수 temp사용
//		
//		int temp = (int)lNum;
//		lNum = iNum;
//		iNum = temp;
//		
//		System.out.println("iNum :" + iNum);
//		System.out.println("lNum :" + lNum);
		
//		6. 사용자가 입력한 두 개의 문자 각각의 유니코드를 출력하세요.
		
		char char1 = sc.nextLine().charAt(0);
		char char2 = sc.nextLine().charAt(0);
		
		System.out.println((int)char1);
		System.out.println((int)char2);
			
	}

}
