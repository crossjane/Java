package _14_01;

import java.util.Scanner;

public class _04_Condtional {
	
//	--------------------조건문--------------------
//	1. 사용자가 입력한 두 정수 중에서 큰 정수를 출력하세요.
//
//	2. 사용자가 입력한 정수가 양수면 "양수" 음수면 "음수"라고 출력하세요.
//
//	3. 사용자가 입력한 문자열이 "Java"인 경우 "좋아하는 언어입니다."를 출력하고, 
	//"Python"인 경우 "공부중인 언어입니다."를 출력하고, 그렇지 않은 경우 "다른 언어를 공부해보세 
//	     요."를 출력하세요.(switch~case~default 사용)
//
//	4. 사용자가 입력한 숫자가 3의 배수면 "3의 배수입니다."라고 출력하고 3의 배수가 아니면 "3의 배수가 아닙니다."를
	//출력하세요.(switch~case~default 사용)
//
//	5. 사용자가 입력한 숫자가 홀수인 경우 "홀수입니다."를 출력하고, 짝수인 경우 "짝수입니다."를
	//출력하는 프로그램을 작성하세요.
//
//	6. 사용자가 입력한 5개의 정수중 가장 큰 수를 출력하세요.
//
//	7. 사용자가 입력한 문자열이 "Yes"인 경우 "예"를 출력하고, "No"인 경우 "아니오"를 출력하고, 
	//그 외의 경우에는 "잘못 입력하셨습니다."를 출력하세요.
//
//	8. 사용자가 입력한 두 정수를 비교하여 같으면 "두 수가 같습니다." 첫 번째 수가 더 크면 "첫 번째 수가 더 큽니다.
	//" 두 번째 수가 더 크면 "두 번째 수가 더 큽니다."를 출력하세요.
//
//	9. 사용자가 입력한 세 정수가 모두 짝수인 경우 "모두 짝수입니다." 모두 홀수인 경우 "모두 홀수입니다."
	//그 외의 경우 "짝수 : xxx개, 홀수 : xxx개 입니다."를 출력하세요.



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		if(num1 > num2) {
//			System.out.println(num1);
//		}else if (num1 < num2) {
//			System.out.println(num2);
//		}else {
//			System.out.println("같은 값입니다.");
//		}
		
//		2. 사용자가 입력한 정수가 양수면 "양수" 음수면 "음수"라고 출력하세요.
		
//		int num3 = sc.nextInt();
//		
//		String result = (num3 < 0)? "음수" :(num3 > 0 )? "양수" : "0";
//		System.out.println(result);
		
//		3. 사용자가 입력한 문자열이 "Java"인 경우 "좋아하는 언어입니다."를 출력하고, 
		//"Python"인 경우 "공부중인 언어입니다."를 출력하고, 그렇지 않은 경우 "다른 언어를 공부해보세 
//		     요."를 출력하세요.(switch~case~default 사용)
		
//		String str = sc.nextLine();
//		switch(str) {
//			case "Java" :
//				System.out.println("좋아하는 언어입니다.");
//				break;
//			
//			case "Python" :
//				System.out.println("공부중인 언어입니다.");
//				break;
//				
//			default : 
//				System.out.println("다른 언어를 공부해보세요.");
//				break;
//			}
		
//		4. 사용자가 입력한 숫자가 3의 배수면 "3의 배수입니다."라고 출력하고 3의 배수가 아니면 "3의 배수가 아닙니다."를
		//출력하세요.(switch~case~default 사용)
//	
//		int num4 = sc.nextInt();
//		
//		switch(num4 % 3){
//			case 0:
//				System.out.println("3의 배수입니다.");
//				break;
//			
//			default : 
//				System.out.println("3의 배수가 아닙니다.");
//				break;
//		}
		
//		5. 사용자가 입력한 숫자가 홀수인 경우 "홀수입니다."를 출력하고, 짝수인 경우 "짝수입니다."를
		//출력하는 프로그램을 작성하세요.
		
//		int num5 = sc.nextInt();
//		
//		String result2 = (num5 % 2 ==0)? "짝수입니다." : "홀수입니다.";
//		System.out.println(result2);
		
//		6. 사용자가 입력한 5개의 정수중 가장 큰 수를 출력하세요.
		
//		int[] inputNumArr = new int[5];
//	
//		for(int i = 0; i < 5; i++) {
//			 inputNumArr[i] = sc.nextInt();
//		}
//		
//		int max = inputNumArr[0]; // 첫 번째 값을 초기 최대값으로 설정
//		
//		for(int i = 0; i < inputNumArr.length; i++) {
//			if(max < inputNumArr[i]) {
//				max = inputNumArr[i];
//				}
//			}
//		System.out.println(max);
		
//		7. 사용자가 입력한 문자열이 "Yes"인 경우 "예"를 출력하고, "No"인 경우 "아니오"를 출력하고, 
		//그 외의 경우에는 "잘못 입력하셨습니다."를 출력하세요.
		
//		String str4 = sc.nextLine();
//		
//		switch(str4) {
//		
//		case "Yes" : 
//			System.out.println("예");
//			break;
//		
//		case "No" :
//			System.out.println("아니오");
//			break;
//		default : 
//			System.out.println("잘못입력하셨습니다.");
//			break;
//	
//		}
		
//		8. 사용자가 입력한 두 정수를 비교하여 같으면 "두 수가 같습니다." 첫 번째 수가 더 크면 "첫 번째 수가 더 큽니다.
		//" 두 번째 수가 더 크면 "두 번째 수가 더 큽니다."를 출력하세요.
//		
//		int num5 = sc.nextInt();
//		int num6 = sc.nextInt();		
//		
//		if(num5 == num6) {
//			System.out.println("두 수가 같습니다.");
//		} else if (num5 > num6) {
//			System.out.println("첫 번째 수가 더 큽니다.");
//		} else {
//			System.out.println("두 번째 수가 더 큽니다.");
//		}
//		
		
		//	9. 사용자가 입력한 세 정수가 모두 짝수인 경우 "모두 짝수입니다." 모두 홀수인 경우 "모두 홀수입니다."
		//그 외의 경우 "짝수 : xxx개, 홀수 : xxx개 입니다."를 출력하세요.
		
		int[] numArr = new int[3];
		
		int evenCnt = 0; 
		int oddCnt = 0;
		
		for(int i = 0; i < 3; i++) {
			numArr[i] = sc.nextInt();
		}
		for(int i = 0; i < 3; i++) {
			if(numArr[i] % 2 ==0) {
				evenCnt++;
			} else {
				oddCnt++;
			}
		} 
		
		if(evenCnt == 3) {
			System.out.println("모두 짝수입니다.");
		}else if(oddCnt == 3) {
			System.out.println("모두 홀수입니다.");
		} else {
			System.out.println("짝수 : " + evenCnt +"개 , 홀수 : "+ oddCnt +"개 입니다.");
			
		}
		
		
		
		
	}
		
}


