import java.util.Scanner;

public class Ch07 {
	public static void main(String[] args) {
		
		// 00 분기문
		// 조건문과 반복문 중간에서 코드블럭을 나눠서 처리하는 문법
		// 그 예로는 if문, switch문, for문, while문 등이 있다.
		
		// 01 if문
		// 조건문을 작성할 때 사용하는 구문.
		// 
		// 조건식이 참이라면 코드 블럭을 실행
		// 조건식이 거짓이라면 코드 블럭을 무시(스킵)
		// ++) else문을 통해 조건이 거짓일 경우의 실행코드를 지정 할 수 있다.
		

		// 조건식은 참 또는 거짓을 판단할 수 있는 식이여야만 한다.
		// 참과 거짓, 0과 1
		
		
		// 02 if문의 형식

		// 2-1) if문
		// 
//		 if ( 조건식 ) {
//												//
//												// 조건식이 참이라면 이 실행코드 실행
//												//
//		}
		
		
//		System.out.println("--------------- if문 - 간단 예제 ---------------");
//        Scanner scanner = new Scanner(System.in);
//        if (true) {
//            System.out.println("조건식이 참이고 if문 진입");
//        }
//        System.out.println("if문 처리 이후 실행코드");
//        System.out.println();
//
////        scanner.close();
//        
//        System.out.println("--------------- if문 - 예제 01 ---------------");
////        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("정수를 입력하세요 >>> ");
//        int num = scanner.nextInt();
//
//        // 첫번째 if문: 짝수 여부 체크
//        if (num % 2 == 0) {
//            System.out.println(num + "는 짝수입니다.");
//            System.out.println("첫번째 if문 끝.");
//        }
//
//        // 두번째 if문: 홀수 여부 체크
//        if (num % 2 == 1) {
//            System.out.println(num + "는 홀수입니다.");
//            System.out.println("두번째 if문 끝.");
//        }
//        System.out.println();

//        scanner.close();
        
        
        // 2-2) if문과 else문

        // if ( 조건식 ) {
//        										//
//        										// 조건식이 참이라면 이 실행코드 실행
//        										//
        //} 
        // 
        // else {
//        										//
//        										// 조건식이 거짓이라면 이 실행코드 실행
//        										//
        //}
        
        
        
        
        // 삼항연산자 연장선 예제
        // 두 수를 입력받아 큰수를 출력하세요(if문사용)
        
        
        
        // 두 수 입력 >>> 12 10
        // 큰 수 : 12
        
        // 1. 삼항연산자로 큰 수를 출력
        
//        System.out.println("--------------- if-else문 - 삼항연산자 예제 01 ---------------");
//        
//        System.out.print("두 수 입력: ");
//        int n1 = scanner.nextInt();
//        int n2 = scanner.nextInt();
//
//        // 큰 수를 삼항 연산자로 출력
//        int maxNumber = (n1 > n2) ? n1 : n2;
//        System.out.println("큰 수: " + maxNumber);
//        System.out.println();
        
        
        // if-else 문을 이용해서 큰 수를 출력
        
//        System.out.println("--------------- if-else문 예제 01 ---------------");
//	    System.out.print("두 수 입력: ");
//	    int m1 = scanner.nextInt();
//	    int m2 = scanner.nextInt();
//	
//	    // 큰 수를 출력
//	    if (m1 > m2) {
//	        System.out.println("큰 수: " + m1);
//	    } else {
//	        System.out.println("큰 수: " + m2);
//	    }
//       System.out.println();
//       
//       System.out.println("--------------- if-else문 예제 02 ---------------");
//       System.out.print("정수를 입력하세요 >>> ");
//       int num2 = scanner.nextInt();
//
//       // 짝수 여부 체크하여 출력
//       if (num2 % 2 == 0) {
//           System.out.println(num2 + "는 짝수입니다.");
//       } else {
//           System.out.println(num2 + "는 홀수입니다.");
//       }
//       System.out.println();
       
       
//     IF-ELSE문 문제 01
    // 사용자로부터 두 정수를 입력받는다.
    // 두 수의 합이 짝수면 "두 수의 합은 짝수입니다."
    // 두 수의 합이 홀수면 "두 수의 합은 홀수입니다" 
    // 위와 같은 결과값이 나오도록 코딩하세요 !
       
//       System.out.println("정수 2개를 입력해주세요 >>> ");
//       Scanner sc = new Scanner(System.in);
//       int a = sc.nextInt();
//       int b = sc.nextInt();
//       
//       if((a + b) % 2 == 0) {
//    	   System.out.println("두 수의 합은 짝수입니다.");
//       } else {
//    	   System.out.println("두 수의 합은 홀수입니다.");
//       }
       
       
    // IF-ELSE문 문제 02
       // 사용자로부터 두 정수를 입력받는다.
       // 그 수가 num >= 2 && num <= 20 이면
       // 조건식이 참이면 "2 ~ 20범위 안에 있습니다."
       // 조건식이 거짓이며 "범위를 벗어났습니다."
       // 위와 같은 결과값이 나오도록 코딩하세요 !
       
//       System.out.println("--------------- if-else문 문제 02 ---------------");
//       System.out.print("정수값 입력 >> ");
//       int a = scanner.nextInt();
//
//       // 입력된 정수가 2부터 20까지의 범위에 있는지 체크하여 출력
//       if (a >= 2 && a <= 20) {
//           System.out.println("2 ~ 20 범위 안에 있습니다.");
//       } else {
//           System.out.println("범위를 벗어났습니다.");
//       }
       
       
       
		// 2-3) 중첩 if문
//	     if (조건식1)
//	     {
		
//	    	 //조건이 참인 경우 실행되는 코드 블록
//	     	if (조건식 2) {
//	    		// 조건식1과 조건식 2가 모두 참인 경우 실행되는 코드 블록
//	     	}
//	     }
	       
	    // 2-4) 중첩 if문과 else문

	     //if (조건식1)
	     //{
//	     	// 조건이 참인 경우 실행되는 코드 블록
//	     	if (조건식 2) {
//	     		// 조건식1과 조건식 2가 모두 참인 경우 실행되는 코드 블록
//	     	}
	     //}
	     //else
	     //{
//	     	// 조건식1이 거짓인 경우 실행되는 코드 블록
	     //}
		
//		System.out.println("----------------- 중첩 if-else문 활용 예제 ------------------");
//		Scanner sc = new Scanner(System.in);
//		String id = "javaclass"; 		// ID
//		String pw = "test1234";			// PW
//		
//		System.out.println("ID를 입력하세요 >>>");
//		String inputId = sc.next(); 
//		
//		// 기존 id(javaclass)와 입력한 id(inputId)와 비교
//		
//		if(id.equals(inputId)) {					// Id가 일치한 경우
//			System.out.println("ID가 일치합니다.");
//			
//			System.out.println("PW를 입력하세요 >>>");
//			String inputPw = sc.next();
//			// 기존 pw(test1234)와 입력한 pw(inputPw)를 비교
//			if(pw.equals(inputPw)) {				// ID도 일치하고 PW 일치한 경우
//				System.out.println("PW가 일치합니다!");
//				System.out.println("LOGIN 성공!!!");
//			} else {								// ID는 일치하는데 PW 일치하지 않는 경우
//				System.out.println("PW가 일치하지 않습니다!");
//				
//			}
//		} else {									// Id가 일치하지 않는 경우
//			
//			System.out.println("ID가 일치하지 않습니다!");
//			
//		}
//		
//		System.out.println("프로그램 끝!!!!!");
		
		
		
		
		
//		If문 통합 문제 01)
    //	짝수이면서 3의 배수이면 출력
    //	홀수이면서 5의 배수이면 출력
		
//		
//      System.out.print("정수 : ");
//      int num = scanner.nextInt();
//
//      // 짝수의 여부 체크
//      if (num % 2 == 0) {
//          // 짝수면서 3의 배수 여부 체크
//          if (num % 3 == 0) {
//              System.out.printf("%d는 짝수이면서 3의 배수입니다!\n", num);
//          } else {
//              System.out.printf("%d는 짝수이면서 3의 배수가 아닙니다!", num);
//          }
//      } else {
//          // 홀수면서 5의 배수 여부 체크
//          if (num % 5 == 0) {
//              System.out.printf("%d는 홀수이면서 5의 배수입니다!\n", num);
//          } else {
//              System.out.printf("%d는 홀수이면서 5의 배수가 아닙니다!", num);
//          }
//      }
//      
//      
//      // &&(앤드 연산자) 이용
//      System.out.println("--------------- &&연산자 이용 예제 01 ---------------");
//      System.out.print("정수 : ");
//      int num = scanner.nextInt();
//
//      // 3의 배수이면서 4의 배수인지 체크
//      if (num % 3 == 0 && num % 4 == 0) {
//          System.out.printf("%d는 3의 배수이면서 4의 배수\n", num);
//      }
//
//      // 3의 배수도 아니고 5의 배수도 아닌지 체크
//      if (num % 3 != 0 && num % 5 != 0) {
//          System.out.printf("%d는 3의 배수도 아니면서 5의 배수도 아님\n", num);
//      }
		
       
       
       
       
//		 05 else - if 
//	     다중분기
//	       System.out.println("--------------- else-if문 예제 01 ---------------");
//	       System.out.print("나이 입력 : >>> ");
//	       int age = sc.nextInt();
//
//	       if (age >= 20) {
//	           System.out.println("성인입니다.");
//	       } 
//	       
//	       
//	       else if (age >= 8) {
//	           System.out.println("취학 아동입니다.");
//	       } else {
//	           System.out.println("미취학 아동입니다.");
//	       }
	       
	       
	       
	    // else - if 문 문제 01)
	       //시험 점수를 입력받아 90 ~ 100점은 A,
	   	//80 ~ 89점은 B, 70 ~ 79점은 C,
	   	//60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
	   	
	   	// score >= 90 A
	   	// score >= 80 B
	   	// score >= 70 C
	   	// score >= 60 D
	   	// 그외 F
	   	//or
	   	// score < 60 F
	   	// score < 70 D
	   	// score < 80 C
	   	// score < 90 B
	   	// 그외 A
//       System.out.println("--------------- else-if문 문제 01 ---------------");
//	   	Scanner sc = new Scanner(System.in);
//	   	int score = sc.nextInt();
//	   	if (score >= 90) {
//	   		System.out.println("A");
//	   	}
//	   	else if (score >= 80) {
//	   		System.out.println("B");
//	   	}
//	   	else if (score >= 70) {
//	   		System.out.println("C");
//	   	}
//	   	else if (score >= 60) {
//	   		System.out.println("D");
//	   	}
//	   	else {
//	   		System.out.println("F");
//	   	}
       
       
       
		// 국어(40점) / 영어(40점) / 수학(40점)
		// 한개 과목이라도 40점 미만이면 불합격 또는 평균 60점이 미만이면 불합격
		// 국어 < 40 --> 불합격
		// 영어 < 40 --> 불합격
		// 수학 < 40 --> 불합격
		// 평균 < 60 --> 불합격
		// 그외 : 합격

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		int kor = sc.nextInt(), eng = sc.nextInt(), mat = sc.nextInt();
//		double avg = (double) (kor + eng + mat) / 3;
//		
//		if (kor < 40) {
//			System.out.println("불합격");
//		}
//		else if (eng < 40) { // kor >= 40
//			System.out.println("불합격");
//		}
//		else if (mat < 40) { // kor >= 40 && eng >= 40
//			System.out.println("불합격");
//		}
//		else if (avg < 60) { // kor >= 40 && eng >= 40 && mat >= 40
//			System.out.println("불합격");
//		}
//		else {
//			System.out.println("합격");
//		}
       
		
		
		
		//나이별로 요금을 부과하는 else if문을 만드세요
		//8세 미만  : 요금은 1000원
		//14세미만 : 요금은 2000원
		//20세미만 : 요금은 2500원
		//20세이상 : 요금은 3000원
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//				Scanner sc = new Scanner(System.in);
//				
//				int charge = 0;
//				
//				int age = sc.nextInt();
//				
//				
//				if (age < 8) {
//					charge = 1000;
//				}
//				else if (age < 14) {
//					charge = 2000;
//				}
//				else if (age < 20) {
//					charge = 2500;
//				}
//				else {
//					charge = 3000;
//				}
//				System.out.printf("나이 : %d 요금 : %d\n", age, charge);
		
		
       
       
       
        
        
        
		//문제

		//배달도시락을 주문하는데 10개까지(n<=10)는 개당 2500원이고 10개(n>10)를 초과하는 양에 대해서는 개당
		//2400원이다.배달 도시락의 개수를 입력 받아서 금액을 계산하는 프로그램을 작성합니다
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		        Scanner scanner = new Scanner(System.in);
	//
//		        System.out.print("주문 도시락 수: ");
//		        int num = scanner.nextInt();
	//
//		        if (num <= 10) {
//		            System.out.println("도시락 주문 총액: " + num * 2500);
//		        } else {
//		            System.out.println("도시락 주문 총액: " + num * 2400);
//		        }
		
		
		
		
		

		//디스켓 1통에 5000원한다.그런데 한번에 10통이상(n>=10)을 사면 전체 금액의 10 % 를 할인하여준다
		//그리고 100통이상(n>=100)을 사면 전체 금액의 12 % 를 할인하여 준다 n개의 디스켓을 사려면 얼마가
		//있어야 하는지 계산하세요
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		        Scanner scanner = new Scanner(System.in);
	//
//		        System.out.print("구매 디스크통 개수: ");
//		        int num = scanner.nextInt();
	//
//		        if (num < 10) {
//		            System.out.println("디스크 구매 총액: " + num * 5000);
//		        } else if (num < 100) {
//		            // 개당 가격 5000 * 0.9
//		            System.out.println("디스크 구매 총액: " + (int) ((num * 5000) * 0.9));
//		        } else {
//		            System.out.println("디스크 구매 총액: " + (int) ((num * 5000) * 0.89));
//		        }
        
        
        
        
        
        
		
	}

}
