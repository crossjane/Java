import java.util.*;
// import java.util.Scanner;

// import : 불러오겠다.
// java라는 폴더 .(안에) util .(안에) 있는 모든것(*)을 추가하겠다.
// 모든 것 중에 하나가 Scanner 그래서 java.util.Scanner; 라고 적어도 Okay

		
		
		

// @@@@@@@@@@@@@@@@@@@@@
// @@@ 복습 시 확인사항 @@@
// ctrl + shift + o  ==> import 시켜주는 단축키
// @@@@@@@@@@@@@@@@@@@@@


public class Ch05 {

	public static void main(String[] args) {
		
		// 00 입력문(값 입력 받기, Scanner)
		
		// System.out			: 표준 출력 스트림 생성 - 모니터
		// System.in			: 표준 출력 입력 스트림 생성 - 키보드
		
		// 실수
		// nextDouble()
		// nextFloat()
		
		// 정수
		// nextInt()
		// nextLong()
		// nextByte()
		// nextShort()
		
		// 논리
		// nextBoolean()
		
		// 한 단어(String)
		// next()
		
		// 한 줄(String)
		// nextLine()
		
		
		Scanner sc = new Scanner(System.in);
		
		
		// 일단 외워주세요 :)
		// Scanner 장치를 생성해 사용할 수 있도록 참조변수 sc 생성 및 연결
//		System.out.println("------------------------ Scanner 예제01 --------------------------");
//		System.out.println("정수를 하나 입력하세요 >>> ");
//		String s = sc.nextLine(); 			// 밑에 실행창의 오른쪽 상단에 젤 왼쪽 보면 빨간불 들어와있는데 '실행중'이라는 의미
//											// next() : 한 문자열(단어), 띄워쓰기 기준으로 한 문자열만 가능
//											// nextLine() : 한 줄
//											// nextInt() : 숫자로 나옴. 대신 변수 앞에 String이 아니라 int로 바꿔야함.
		
//		
//		System.out.println("입력한 문자열 : " + s);
//		System.out.println();
		
		
		System.out.println("------------------------ Scanner 예제 02 ---------------------------");
		System.out.println("정수 세개를 입력해주세요 >>> ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		System.out.println(sum);
		
		
//		sc.close(); //객체생성하고 사용하지 않으면 제거하는 작업이 필요함
					// 이 밑으로는 Scanner 사용하지 않겠다.
		
		
		
//		System.out.println("--------------- Scanner 예제 03 ---------------");
////		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 :");
//		int number1 = sc.nextInt();
//		System.out.println("입력된 정수 값 :" + number1);
//		
//		
//		
//		
//		System.out.print("실수 입력 :");
//		double number2 = sc.nextDouble();
//		System.out.println("입력된 실수 값 :" + number2);
//		
//		
//		
//		System.out.print("문자열 입력 :");
//		String str1 = sc.next();					//문자열입력받기기능함수, 띄어쓰기는 포함하지 않는다.
//		System.out.println("입력된 문자열 :" + str1);
//		
//		
//		
//		
//		System.out.println("입력 : ");
//		String s1 = sc.next();
//		String s2 = sc.next();
//		String s3 = sc.next();
//		System.out.printf("문자열 : %s %s %s\n", s1, s2, s3);
//		System.out.println();
		
		
		
		System.out.println("--------------- Scanner 버퍼 비우기 예제 ---------------");
		System.out.printf("수 입력 : ");
		int num = sc.nextInt();
		
		sc.nextLine();		//버퍼공간에 남아있는 데이터값을 초기화
		
		
		System.out.print("문자열 입력(띄워쓰기포함 문자열) : ");
		String str2 = sc.nextLine();				//문자열입력받기기능함수, 띄어쓰기도 포함한다.
		
		
		System.out.println("입력된 문자열 :" + str2);
		
		
		
		// 참고)
//		nextLine() 메서드는 개행 문자(\n) 이전의 모든 문자를 읽어오는데, 개행 문자 자체는 읽지 않음. 
//		따라서 이전에 사용된 next(), nextInt() 등의 메서드로 입력을 받은 후에 nextLine()을 사용할 때 문제가 발생할 수 있음.
		
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();  // 숫자를 입력 받음
//		sc.nextLine();  // 버퍼를 비워줌, 엔터를 받아줌.
//		String text = sc.nextLine();  
		
//		위의 코드에서 nextInt()를 사용하면서 엔터 키 이전까지의 입력이 num에 저장되고, 그 뒤에 nextLine()을 사용하여 개행 문자까지의 입력을 text에 저장. 
//		그런데 nextLine()은 개행 문자를 만날 때까지의 입력을 읽기 때문에 개행 문자만을 읽게 됨.
//
//		이를 방지하기 위해 nextLine()을 호출하기 전에 nextLine()으로 개행문자의 개입을 없애는게 좋음.
//		이를 통해 다음 nextLine()이 개행 문자를 만날 때까지의 입력을 제대로 읽어올 수 있음.
		
		
		
		
//		## 입출력 실습 예제 ##
//		System.out.println("--------------- Scanner 문제 01 ---------------");
//		문제 01)
		// 직사각형의 가로와 세로 값을 사용자로부터 입력받고 
		// 직사각형의 둘레와 넓이를 구하는 프로그램을 구현해보세요
		// 직사각형의 둘레 = (가로길이 + 세로길이) * 2
		// 직사각형의 넓이 = 가로길이 * 세로길이
		
		
//		System.out.println("가로 길이를 입력하세요 >>> ");
//		int square_width = sc.nextInt();
//		
//		System.out.println("세로 길이를 입력하세요 >>> ");
//		int square_height = sc.nextInt();
		
		
//		int dul = (square_width + square_height) * 2;		// 둘레
//		int size = square_width * square_height;			// 넓이
		
//		System.out.println("직사각형의 둘레 = " + dul);
//		System.out.println("직사각형의 넓이 = " + size);
//		System.out.println("직사각형의 둘레 = " + (square_width + square_height) * 2);
//		System.out.println("직사각형의 넓이 = " + (square_width * square_height));
//		System.out.println();
		
//		============================== 실행 결과 ===================================
//		가로 길이를 입력하세요 >>> 
//		3
//		세로 길이를 입력하세요 >>> 
//		5
//		직사각형의 둘레 = 16
//		직사각형의 넓이 = 15		
		
		
		
//		문제 02)
//		System.out.println("--------------- Scanner 문제 02 ---------------");
		//이름을 입력하세요? 홍길동
		//홍길동 님의 나이를 입력하세요? 24
		//홍길동 님의 주소를 입력하세요? 대구광역시 반월 센트럴 타워
		// 홍길동 님의 나이는 24세 주소는 대구광역시 반월 센트럴 타워 입니다
		
		
		
		System.out.print("이름을 입력하세요?");
		String name = sc.nextLine();
		
		System.out.printf("%s 님의 나이를 입력하세요?",name);
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.printf("%s 님의 주소를 입력하세요?",name);	
		String addr = sc.nextLine();
		
		
		System.out.printf("%s 님의 나이는 %d세, 주소는 %s 입니다",name,age,addr);
		System.out.println();
		
		
		
		
		
		
		

	}

}
