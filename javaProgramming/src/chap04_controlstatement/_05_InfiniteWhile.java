package chap04_controlstatement;

import java.util.Scanner;

public class _05_InfiniteWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner: 사용자 입력 값을 받아 주는 클래스 
		//System : 현재 사용중인 운영체제의 정보를 가져오는 클래스.
		//System.in : 현재 사용중인 운영체제의 입력장치 (키보드, 마우스) 
		Scanner sc = new Scanner(System.in);  //ctrl shift O (import 시키는 단축키) String 은 자바에서 기본적으로 제공되는 클래스 이기 때문에 임포트 없이 사용x
		
		//nextInt()라는  입력값을 받아주는 메서드 ctrl 클릭 후 ctrl f 
		//nextLine() 입력한 String 값을 엔터값을 포함하여 받아옴. 
		
		//무한루프 구문 
		//특정 조건일 때 break구문을 사용해서 while 문을 종료시킨다.
		
		while(true) {
			System.out.println("문자열을 입력하세요.");
			//Scanner.nextInt(): 입력받은 정수값을 리턴해주는 메소드.엔터값 포함되지 않음.
			//Scanner.next():입력받은 문자열을 리턴해주는 메소드. 엔터값 포함하지 않음. 
			//Scanner.nextLine(): 입력받은 문자열을 리턴해주는 메서드. 엔터값을 포함한 문자열을 리턴.
			
			String inputStr = sc.nextLine();
			
			System.out.println("입력한 문자열: " + inputStr);
			
			//입력한 문자열이 q일때 while 문을 종료시키는 if 문을 작성하세요. 
			//String.equalsIgnoreCase(): 대소문자 구분없이 값비교(소문자 비교)**
			
			if (inputStr.equals("q")||inputStr.equals("Q")) {		//문자를 ==연산자로 비교할 수 없다 !!! *** equals 메서드 
				System.out.println("종료합니다.");
			
				break;
				
//				다른 메서드를 쓰는 간단한 방법
//				if (inputStr.equalsIgnoreCase("q")) {		
//					System.out.println("종료합니다.");                 
//				
//					break;
		}
			
		}
		sc.close(); 		//Scanner사용 후 항상 해지. 
		
	
		}
	}


