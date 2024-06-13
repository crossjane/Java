package _14_01;

import java.util.Scanner;

public class _05_loop {
	

//--------------------반복문--------------------
//1. 1부터 10까지의 정수의 합을 출력하세요.
//
//2. 2의 거듭제곱을 10회동안 반복하며 출력하세요.(2 * 2 = 4, 2 * 2 * 2 = 8 .....) 10회 반복 출력
//
//3. 사용자가 입력한 정수까지의 모든 소수를 출력하세요.
//
//4. 사용자가 입력한 정수의 약수를  출력하세요.
//
//5. 사용자가 입력한 10개의 정수를 역순으로 출력하세요.(배열 사용)
//
//6. 사용자가 입력한 문자열을 역순으로 출력하세요.
//
//7. 사용자가 입력한 두 정수의 최소공배수와 최대공약수를 출력하세요.
//
//8. 중첩 for문으로 이용해서 다음과 같이 출력하세요.
//
//8-1. *
//     **
//     ***
//     ****
//     *****
//
//8-2. *****
//      ****
//       ***
//        **
//         *
//
//9. 사용자가 q를 입력하기 전까지 계속 반복하면서 입력한 정수의 값을 더해서 출력하세요.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	1. 1부터 10까지의 정수의 합을 출력하세요.
		
//		int sum = 0;
//		
//		for(int i = 1; i<=10; i++) {
//			 sum+=i;
//		}
//		
//		System.out.println(sum);
		
		//2. 2의 거듭제곱을 10회동안 반복하며 출력하세요.(2 * 2 = 4, 2 * 2 * 2 = 8 .....) 10회 반복 출력
//	
//		int num = 2; 
//		
//		for(int i = 1; i <= 10; i++) {
//			// 각 거듭제곱의 결과를 저장할 변수
//			int result = 1;
//			// 곱셈 과정을 저장할 문자열
//			 String process = num + ""; 
//
//			for(int j = 1; j <= i; j++) {
//				result *= num;
//				process += " * " + num;
//		
//				}	
//			
//			process += " = " + result;
//			System.out.println(process);
//	
//		}

		//4. 사용자가 입력한 정수의 약수를  출력하세요.
		
		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
//		for(int i = 1; i < num; i++) {
//			if(num % i == 0) {
//				System.out.println(i);
//			}
//		}
		
		//5. 사용자가 입력한 10개의 정수를 역순으로 출력하세요.(배열 사용)
		
//		int[] numArr = new int[10];
//		
//		for(int i = 0; i < numArr.length; i++) {
//				numArr[i] = sc.nextInt(); 
//			}
//		
//		for(int i = numArr.length-1; i >= 0 ; i--) {
//			System.out.println(numArr[i]);
//		}
	
		
		//6. 사용자가 입력한 문자열을 역순으로 출력하세요.
//		
//		String str = sc.nextLine();
//		
//		// 문자열을 char배열로 변환 .
//		char[] chaArr = str.toCharArray();
//
//		for(int i = chaArr.length - 1; i >= 0 ; i--) {
//			System.out.println(chaArr[i]);
//		}
		
		//8. 중첩 for문으로 이용해서 다음과 같이 출력하세요.
		//	
		//8-1. *
//		       **
//		       ***
//		       ****
//		       *****
		
//		for(int i = 0; i < 5; i++ ) {
//			System.out.println();
//			for(int j = 0; j < i+1; j++) {
//				System.out.print("*");
//			}
//			
//			
//		}
//		
		
		
		

		for(int i = 0; i < 5; i++ ) {
			System.out.println();
			for(int j = 0; j < 5; j++) {
				if(i >= j ) {
				System.out.print("*");
				}
			}
			
			
		}
		
		
		
		//
		//8-2.   *****
//		          ****
//		           ***
//		            **
//		             *	
		
//		for(int i = 0; i < 5; i++) {
//			System.out.println();
//			for(int j = 0; j < 5-i; j++) {
//				System.out.print("*");
//			}
//		}
//		
		
		//9. 사용자가 q를 입력하기 전까지 계속 반복하면서 입력한 정수의 값을 더해서 출력하세요.
		
//		int sum = 0;
//		
//		//무한 반복이기때문에 
//		while(true) {
//			System.out.println("정수를 입력해주세요.");
//			String inputStr = sc.nextLine();
//
//			if(inputStr.equals("q")) {
//				System.out.println("프로그램이 종료되었습니다.");
//				break;
//
//			}
//			
//			//객체를 반환해야하는 래퍼클래스. 
//			Integer number = Integer.valueOf(inputStr);
//			
//			
//			if(number != null) {
//				  sum += number;
//				 
//			} 
//			
//			
//		} System.out.println(" 더한 정수의 값: " + sum);
//		
//		
		
		
		
		
	}
	   
}
