package _14_01;

import java.util.Scanner;

public class _01_var_08 {

	
		// TODO Auto-generated method stub

//		8. 사용자가 입력한 10개의 정수 중 소수의 개수를 출력하세요.(소수는 1이랑 본인 말고는 나눠떨어지는 값이 없는 수입니다.)
//		   사용자가 입력할 수 있는 값은 2 ~ 30로 제한
		//재귀함수라 뺴야 편함.

		int cnt = 0;
		boolean isPrime = true;
		int[] numArr = new int[10];
	
		static boolean isPrime(int num){
			
			 if(num <= 1) {
				 isPrime = false;
			 }else {
				 for(int j = 2; j < num; j++) {
					 if(num % j == 0) {
						 isPrime = false;
						 break;
					 }
				 }
			 }
			 return true;
		}

			

		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//정수를 입력받음
		System.out.println("정수10개를 입력하세요.(2~30사이의 값)");
			for(int i = 0; i < 10; i++) {
				 int num = sc.nextInt();
				 if(num < 2 || num > 30) {
					 System.out.println("잘못입력하셨습니다. 2~30사이의 값으로 다시 입력해주세요.");
					 i--;
					 continue;
				 }
		
	
			
			 
			 if(isPrime) {
				 numArr[cnt] = num;
				 cnt++;
				
				 
			 }
			 
			}
			
		for(int a : numArr) {
			System.out.println("소수 목록 :"+ a);
		}
			
		System.out.println("소수의 갯수는 : " + cnt++);
	
		
	}

}
