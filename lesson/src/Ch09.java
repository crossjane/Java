import java.util.Scanner;

public class Ch09 {

	public static void main(String[] args) {
		// 00 반복문
		// 반복적인 실행이 필요할 때 반복문을 사용함.
		
		// 01 while문의 구조
		// 조건식이 참인 경우 반복적으로 코드를 실행한다.

		//while (조건) {
//			반복 실행 코드;			// 예) 조건이 참이면 코드 실행
//											//     조건이 거짓이면 반복문 종료
		//}
		
		
//		System.out.println("----------------------------- while문 예제 01 -----------------------------");
//		
//		// 탈출용 변수
//		int i = 1;
//		
//		// 탈출용 조건식
//		while (i <= 10) {
//			System.out.println("Hello world");
//			
//			
//			// 탈출을 위한 연산식
//			i++;
//		}
		
		
		
		
//		System.out.println("----------------------------- while문 예제 02 -----------------------------");
		// 1부터 10까지의 합 구하기
//		int i = 1;
//		int sum = 0;
//		
//		
//		sum = 12;
//		
//		
//		while (i <= 10) {
//			sum += i;
//			System.out.println("i = " + i);
//			
//			
//			i++;			// 후치연산
			
			
//		}
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		System.out.println("while 종료 후 i의 값 = " + i);
//		System.out.println("1부터 10까지의 합 = " + sum);
//		
//		
//		 System.out.println("--------------- while문 예제 03 ---------------");
//	      1부터 N(입력한 수)까지의 합 구하기 
//       int i = 1;      // 탈출용 변수
//       int sum = 0;    // 누적용 변수
//
//       Scanner scanner = new Scanner(System.in);
//
//       System.out.print("정수 입력: ");
//       int num = scanner.nextInt();
//
//       while (i <= num) {
//           System.out.println("i의 값: " + i);
//           sum += i;
//           i++;
//       }
//
//       System.out.println("1부터 " + num + "까지의 합: " + sum);
		 
		 
		 
		 
		 
		 
		 //문제
//        System.out.println("--------------- while문 문제 01 ---------------");
//        //정수 두개를 입력 받아(n,m) n부터 m까지의 합을 구하세요
//        //이때 받는 수는 n이 m보다 작아야 합니다(제약조건)
//        
//        Scanner sc = new Scanner(System.in);
//        System.out.println("정수1을 입력하세요 >>>");
//        int n = sc.nextInt();
//        System.out.println("정수2를 입력하세요 >>>");
//        int m = sc.nextInt();
//        
//        int sum1 = 0;
//        
//        
//        if (n < m) {
//        	while (n < m) {
//    			sum1 += n;
//    			n++;
//            }
//    		System.out.println("sum의 합 : " + sum);
//        	
//        } else if (n > m) {
//        	while(m < n) {
//        		sum1 += m;
//        		m++;
//        		
//        	}
//        	
//        } else {
//        	System.out.println("n과 m이 같습니다");
//        }
        
        
        // 1. if문과 else if문을 사용했다면 나머지 경우의 수가 없는지 꼭 확인을 해주셔야 해요!
//        if (n < m) {
//        	while (n < m) {
//    			sum1 += n;
//    			n++;
//            }
//    		System.out.println("sum의 합 : " + sum);
//        	
//        } else if (n > m) {
//        	while(m < n) {
//        		sum1 += m;
//        		m++;
//        		
//        	}
//        	
//        } else {						// n == m의 경우를 따로 else 구문으로 처리
//        	System.out.println("n과 m이 같습니다");
//        }
        
        
        
        // 2. 아예 else if문을 사용하지말고 else 구문으로 처리하는 방법도 하나의 방법이다.
        
//        if (n < m) {
//        	while (n < m) {
//    			sum1 += n;
//    			n++;
//            }
//    		System.out.println("sum의 합 : " + sum);
//        	
//        } else {					// n == m의 경우를 포함 
//        	while(m < n) {
//        		sum1 += m;
//        		m++;
//        		
//        	}
//        	
//        } 
        
        
        
        // 3. 또는 else if문의 조건식에 아예 나머지 경우의 수까지 처리를 해주는 방법도 하나의 방법이다.
//        if (n < m) {
//        	while (n < m) {
//    			sum1 += n;
//    			n++;
//            }
//    		System.out.println("sum의 합 : " + sum);
//        	
//        } else if (n >= m) {			// n == m이 같은 경우를 포함
//        	while(m < n) {
//        		sum1 += m;
//        		m++;
//        		
//        	}
//        	
//        } 
        
        	
		// 02 do-while문의 구조

		 // while문은 조건식이 거짓이면 실행 X
		 // do - while문은 무조건 한번 실행 후 조건식 판별

//		do {								// 일단 해라.
//			조건식 판별 전 실행할 코드;		// 조건식 상관없이 실행
//			반복적으로 실행될 코드;			// 조건식에 따라 실행
//		} while (조건);
		 
//			System.out.println("--------------- do-while문 예제 ---------------");
//			Scanner scanner = new Scanner(System.in);
//			int number;
//	
//	        do {
//	            System.out.print("양수를 입력하세요: ");
//	            number = scanner.nextInt();
//	
//	            if (number <= 0) {
//	                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
//	            }
//	        } while (number <= 0);
//	
//	        System.out.println("입력한 양수: " + number);
	        
        
        
      
		//03  while - 무한 루프 이용하기
        System.out.println("--------------- while - 무한 루프 예제 ---------------");
     // 값을 사용자로부터 입력받아 모두 더하는 프로그램을 만들어보자 !!
     // 값이 -1이라면 프로그램 종료 !!
        
        
//        Scanner scanner = new Scanner(System.in);
//
//        int sum = 0; // 값 누적용
//        int num; // 키보드 값 받기용
//
//        while (true) {
//            System.out.print("정수 입력(종료는 -1입니다!) : ");
//            num = scanner.nextInt();
//
//            if (num == -1) {
//                break;
//            }
//
//            sum = sum + num;
//        }
//
//        System.out.println("누적된 총합 : " + sum);
        
        
        
        //04 while - if 문 삽입
//        System.out.println("--------------- while - if문 삽입 예제 ---------------");
//        int i = 1;
//
//        while (i <= 10) {
//            if (i % 3 == 0) {
//                System.out.println("i 값 : " + i);
//            }
//            i++;
//        }
        //문제 
//        System.out.println("--------------- while - if문 문제 01 ---------------");
//        //입력한 1부터 입력 수중(x)에 3의 배수의 합을 출력
//        
//        // 일단 입력을 받아야한다? ==> Scanner를 사용해야한다.
//        Scanner sc = new Scanner(System.in);
//        
//        // 입력 받는 수 (n)에 사용자로 부터 입력받는 코드를 작성하자
//        int n = sc.nextInt();		
//        
//        // 가정 : n이 10이라면 문제의 의도가 뭘까?
//        // ==> 1 ~ 10까지의 수 중에서 3의 배수의 합을 출력해라 라는 문제네!
//        // ==> 1부터 10 사이의 3의 배수는 3, 6, 9 이고 얘네들을 더해서 출력해야겠다!
//        
//        // ==> 1부터 10까지의 수를 반복해서 그 사이에 3의 배수일 때 그 수를 더해줘야지!
//        
//        int i = 1;
//        int sum = 0;
//        while (i <= n) {
//        	// i가 1일때 해야할 일
//        	// ==> 3의 배수가 아니니깐 그냥 다음 i 반복 실행하자
//        	// ==> i를 증가시키자
//        	// ==> 1일 때 필요한 코드는 i++;이네
//        	
//        	// i가 2일때 해야할 일
//        	// ==> 3의 배수가 아니니깐 그냥 다음 i 반복 실행하자
//        	// ==> i를 증가시키자
//        	// ==> 2일 때 필요한 코드는 i++;이네
//        	
//        	// i가 3일때 해야할 일 (i가 3일 때 == 3의 배수라는걸 가정)
//        	// ==> 3의 배수네!?
//        	// ==> 3의 배수의 합을 저장해줄 변수가 하나 필요하겠구나!? why? : 3의 배수의 '합'을 구하는게 목표
//        	// 위에 가서 sum 변수를 하나 선언해주자!
//        	// 어떤 코드가 필요할까?
//        	// ==> sum += i;
//        	
//        	// i가 4일때 해야할 일
//        	// ==> 3의 배수가 아니니깐 그냥 다음 i 반복 실행하자
//        	// ==> i를 증가시키자
//        	// ==> 4일 때 필요한 코드는 i++;이네
//        	
//        	if(i % 3 == 0) {			// i가 3 일때, 6 일때, 9 일때 실행되는 코드
//        		sum += i;
//        	}
//        	
//        	i++;	// i가 1증가
//        	
//        }
//        
//        // 3의 배수의 총합에 대한 출력
//        System.out.println("1부터 " + n + "까지의 수중에서 3의 배수의 총합 : " + sum);
        
        
        
        //문제 
        System.out.println("--------------- while - if문 문제 02 ---------------");
        //-1을 입력하기전까지 계속 정수를 받습니다
        // 그리고 입력한 수중의 짝수의합과 홀수의 합을 따로 구해서 출력
        
//      Scanner scanner = new Scanner(System.in);
//      int num = 0;    // 키보드 값 받기
//      int sum1 = 0;   // 짝수 합 저장용
//      int sum2 = 0;   // 홀수 합 저장용
//
//      while (true) {
//          System.out.print("정수 입력(종료 : -1) : ");
//          num = scanner.nextInt();
//
//          if (num == -1) {
//              break; // while 탈출
//          } else if (num % 2 == 0) {
//              // 입력한 수가 짝수일때 처리
//              sum1 += num;
//          } else {
//              // 입력한 수가 홀수일때 처리
//              sum2 += num;
//          }
//      }
//
//      System.out.println("짝수의 합 : " + sum1);
//      System.out.println("홀수의 합 : " + sum2);
        
        
        
        //문제
        //1부터 100까지 수중에 3의 배수이면서 4의 배수를 출력합니다
        
//      int i = 1;
//
//      while (i <= 100) {
//          if (i % 3 == 0 && i % 4 == 0) {
//              System.out.println("i 값: " + i);
//          }
//          i++;
//      }
        
        
      //문제
        System.out.println("--------------- while - if문 문제 04 ---------------");
       // 소수를 판별하는 코드를 만드세요
       // 소수 : 1과 자기자신으로만 나누어떨어지는 수 , % 연산자사용합니다)
//        
//        Scanner sc = new Scanner(System.in);
//        System.out.print("소수를 판별하는 프로그램입니다.\n");
//        System.out.print("정수 하나를 입력해주세요 >>> ");
//        int num = sc.nextInt();
//        int count = 0;
//        
//        
//        // 1. 1로 나누어 떨어져야 한다.
////        num % 1 == 0;
//        // 2. num으로 나누어 떨어져야 한다.
////        num % num == 0;
//        // ==> 모든 수는 1, 자기자신으로 나누어 떨어진다 == 위와 같은 조건식으로는 조건식이 성립 X
//        
//        int i = 1;
//        while (i <= num	) {					// i = 1, i = 2, i = 3, ... i = num
//        	if(num % i == 0) {
//        		// 17 : 17 % 1 == 0, 17 % 17 == 0  --> 2번만
//        		// 4 : 4 % 1 == 0, 4 % 2 ==0, 4 % 4 == 0  --> 3번
//        		System.out.println("나누어 떨어지는 수 : " + i);
//        		System.out.println("COUNT UP");
//        		System.out.println();
//        		count++;
//        	}
//        	i++;
//        	
//        }
//        
//        System.out.println("총 나누어 떨어진 횟수 : " + count );
//        
//        if(count == 2) {
//        	System.out.println(num + "는 소수입니다.");
//        } else {
//        	System.out.println(num + "는 소수가 아닙니다.");
//        }
//       
        
        
        // 1과 num으로 나누었을 때만 count 수를 증가시키고 count가 2번이라면 소수
        
        
        
        
        //05 continue 예약어

//        System.out.println("--------------- while - continue 예제 ---------------");
//        // 1부터 10까지의 수중에 3의 배수를 제외하고 출력
//        
//        int i = 1;
//        while (i <= 10) {
//        	if(i % 3 == 0) {
//        		i++;
//        		continue;
//        	} 
//			System.out.println(i);
//			i++;
//        	
//        }
        
        
        
        
        
     // 문제(★★★)
        // 입력한 수를 거꾸로 출력 (%연산자로 끝자리)
        // [출력 예]
        // 수 입력 : 123
        // 출력 : 321
        // 123의 자릿수 : 3
        
        
        
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();				// 12
//        int tmp = num;
//        int count = 0;
//        
////        num / 10 = 몫이 0이 아니라면   ==> num이 십의 자리 수
////        		   = 몫이 0이라면		 ==> num이 일의 자리 수 
//        
//        
//        //만약에 num을 반복해서 나눈다면 언젠간 0이 될꺼다! == 일의 자리 수 / 10 일 때 몫 == 0
//        
//        
//        while( tmp != 0) {			// 0일때 까지 반복하겠다!
//        	
////        	// 끝 자리 출력
////        	System.out.print(tmp % 10);
//        	
//        	// 끝 자리 제거
//        	tmp = tmp / 10;
//        	count++;
//        	
//        }
//        
//        System.out.printf("%d의 자릿수 : %d\n", num, count);
//        
        
        
        
        
        
        
        
        
        
		
		
		

	}

}
