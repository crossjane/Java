package _09_usefulclass;

import java.util.Scanner;

public class _03_Advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		
//		1. 사용자 입력한 문자열에서 연속된 동일한 문자를 찾고
//	     연속된 동일한 문자를 발견했을 때 하나빼고 다 제거하여
//	     출력하세요. (단, 대소문자 구분함. StringBuilder를 사용하세요.)
//	     ex) aabbcdeffaaaaynguuuuuu -> abcdefayngu

		
			Scanner sc  = new Scanner(System.in);
			
			StringBuilder str = new StringBuilder(sc.nextLine());
			System.out.println("문자열을 입력하세요.");
			String inputStr = sc.nextLine();
			
			
			
			
				for(int i = 1; i < inputStr.length(); i++) {
					char ch1 = inputStr.charAt(i);
					char ch2 = inputStr.charAt(i-1);
						if(ch1 == ch2) {
						str.append(ch1);
						}
					}
				
				
				System.out.println(str);
				
				
				}

	}


