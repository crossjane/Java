package chap05_array;

import java.util.Random;

public class _08_Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 정수 7개를 저장할 수 있는 배열 생성 
		
		//2. 1~45까지의 숫자 중 랜덤한 숫자 7개 배열에 저장(중복제거)
		
		//3. 로또번호 출력 
		// 0~5까지의 인덱스는 실제 당첨번호
		// 6번 인덱스는 보너스 번호로 출력
		// 출력양식
		// 이번주 로또 번호는 1, 2, 3, 4, 5, 6, 보너스 번호 : 7
		
		
		
		
		
		
		
		
		
		
		Random random = new Random();
		int[] lotto = new int[7];
		

		for(int i =0; i < lotto.length; i++ ) {			//인덱스 번호
				lotto[i] = random.nextInt(45)+1;
				//중복제거 
				if(i > 0) {
					for(int j = 0; j < i; j++) {			//중복됐을 때   i는 랜덤한 숫자, 여기서 j가 무엇을 의미하는?? 
						if(lotto[i] == lotto[j]) {			//중복된 값이 저장된 인덱스에 다시 값을 저장하기위해 
							i--;							//i--를 해준다.
															//외부 for문의i++증감식을 만나서 다시 현재 인덱스에 값을 저장할 수 있게된다.
							break;								
						}
					}
				
				}
			
			}
		System.out.print("이번주 로또 번호는");
		for(int i = 0; i < lotto.length; i++) {
			if(i == lotto.length -1) {
				System.out.println("보너스 번호 : " + lotto[i]);
			} else {
				System.out.print(lotto[i] + ", ");
				
			}
		}
	}
}
		
		




