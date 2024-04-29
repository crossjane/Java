package advance;

import java.util.Scanner;

public class _02_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. 369게임을 작성합니다.
		// 1~99까지의 정수를 입력받고
		// 3,6,9중 하나가 있으면 "박수짝"을 출력하고
		// 2개가 있으면 "박수짝짝"을 출력하세요
		// 예를 들어 13은 "박수짝"
		// 36인 경우는 "박수짝짝"을 출력하면 됩니다.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요");
		int num = sc.nextInt();
		

		if(num >=1 && num <= 99) {
			if() {
				System.out.println("박수짝");
			} else if() {
				System.out.println("박수짝짝");
			}
			
			
		}else { 
			System.out.println("1~99까지의 정수로 다시 입력해주세요.");
		}
		
		
		
	}

}
