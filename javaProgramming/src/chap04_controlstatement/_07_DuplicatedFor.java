package chap04_controlstatement;

public class _07_DuplicatedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 중첩 for문 
		for (int i = 0; i< 5; i++) {
			for(int j = 0; j < 5; j++) {
				
				System.out.println("i :" + i + ", j:" + j );
			
			}
			System.out.println("i값 증가");
		}

		
		//2. 2 ~ 9단까지 구구단 출력 
		
		for(int k = 2; k <= 9; k++) {
			System.out.println(k +"단 시작");
			for(int l = 1; l <= 9; l++) {
				System.out.println(k + "*" + l + "=" + (k*l) + "  ");
				
			}
			
			System.out.println(k + "단 끝");
		
		}
		
		//3. 
		//*****
		//*****
		//*****
		//*****
		//*****
		//위 모양대로 출력할 수 있느 중첩 for문을 작성하세요.
		
		
		
		
		for(int line = 1; line <=5; line++) {				//줄바꿈. 
			System.out.println();
			for(int star = 1; star <=5; star++) { 			//별찍기 출력.(내부 포문에서 별을 찍기)
				System.out.print("*");

			}

		}
			
		
//		for(int star = 1; star <=5; star++) {
//			System.out.println("*");              		//내가 푼 문제. ** 오류 .
//			for(int line = 1; line <=5; line++) {
//				System.out.print("*");
//
//			}
//
//		}
		
		
		//  AB +BA= 99를 만족하는 A, B 값을 모두 출력하는 중첩 For 문을 작성하세요 (A,B는 0-9까지의 정수)
			
		for(int a = 0; a <=9; a++) { 
			for(int b =0; b<=9 ; b++) {
				
				
				int result = (10*a+b) +(10*b+a);
				if (result == 99) {
					System.out.println("A :"+ a +" / B :"+ b);
					
				}
				
//				쌤 답변				
//				int numAB = a *10 + b;
//				int numBA = b *10 + a; 
		
			}
			
		}
		
		
			
		
		
		
	}
}
