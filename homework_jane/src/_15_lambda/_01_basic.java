package _15_lambda;

public class _01_basic {
	
//	1. 매개변수로 받아온 정수배열에서 짝수만 찾아서 출력하는 printEvenNum을 람다식으로 구현하세요.
	//	PrintNumber 함수형 인터페이스 생성, printEnvenNum(int[] numArr) 추상 메소드로 선언.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EvenNum(nArr -> {
			for(int i = 0; i < nArr.length ; i++) { 
			if(nArr[i] %2 == 0) {
				System.out.println(nArr[i]);
			}
	
		}return nArr;
		
		});

	}
	
	
	public static int[] EvenNum(PrintNumber printNumber) {
		
		
		
		int[] numArr = {1,2,3,4,5,6,7,8,9,10};

		return numArr;
		
	}

}
