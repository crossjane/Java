
public class Ch11 {
	public static void main(String[] args) {
		

		// 01 제어문 - break
		// 제어문은 반복문과 조건문에 필터링 기능을 부여하는 방법
		// 1. 반복문 탈출에 사용
		// 2. switch문 Case 탈출에 사용
		
		
		
		// 02 while - 무한 루프
		
				System.out.println("--------------- while - 무한 루프 예제 ---------------");
//		 중첩 while 문 전체 벗어나기
//		 5 x 5 = 25 까지 출력하고 나머지 출력 X
		        int dan = 2;
		        int i = 1;
		        boolean flag = false;  // dan과 i가 모두 5라면 flag를 true로 만들어주고 break;
		                               // flag가 true라면 반복문 전체 break;

		        while (dan <= 9) {
		            i = 1;
		            while (i <= 9) {
		                System.out.printf("%d x %d = %d\n", dan, i, dan * i);
		                if (dan == 5 && i == 5) {
		                    flag = true;
		                    break;
		                }
		                i++;
		            }
		            if (flag) {
		                break;
		            }
		            System.out.println();
		            dan++;
		        }
				
				
			// 03 제어문 - continue;
			// continue 아래 코드 무시 및 반복문의 조건식으로 회기하여 다음 반복 실행.
			// 
			// ### break와 continue의 차이점 ###
			// break는 소속된 코드 블럭을 즉시 탈출
			// continue는 소속된 코드 블럭(현재 실행중인 반복문)을 무시하고 조건식으로 돌아가 다음 반복을 시작
		        
		        
		        
		     // 문제 01

				// 사용조건 : while, if, continue, break

				// 1부터 100까지의 수 중에서 5의 배수만 더하고, 50을 넘어가면 반복문을 중단

				// 1~50 까지 출력 (단, 5의 배수는 출력되지 말아야함.)
				// 5의 배수의 합도 출력

				// hint : 5의 배수의 합에 대한 처리를 해줄 변수가 필요

				// [결과값]

				//1
				//2
				//3
				//4
				//6
				//7
				//8
				//9
				//11
				//12
				//13
				//14
				//16
				//17
				//18
				//19
				//21
				//22
				//23
				//24
				//26
				//27
				//28
				//29
				//31
				//32
				//33
				//34
				//36
				//37
				//38
				//39
				//41
				//42
				//43
				//44
				//46
				//47
				//48
				//49
				//5의 배수의 총합 : 275
				
		
	}

}
