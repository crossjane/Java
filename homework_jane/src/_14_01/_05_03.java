package _14_01;

import java.util.Scanner;

public class _05_03 {
	
	//3. 사용자가 입력한 정수까지의 모든 소수를 출력하세요.
	
	
	// 주어진 수가 소수인지를 판별하는 함수
	public static boolean isPrime(int num) {
		 // 1과 1보다 작은 수는 소수가 아님
		if (num <= 1) {
			return false;
		}
		 // 2부터 해당 수의 제곱근까지 모든 수로 나누어 보며 소수인지를 판별
        // (해당 수의 제곱근까지만 확인하는 이유는 효율성을 위함)
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				//나누어 떨어지는 경우 소수가 아님
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("값: ");
		int num = sc.nextInt();
		
		// 2부터 사용자가 입력한 정수까지의 모든 수를 탐색하면서 소수인지를 확인
		for (int i = 2; i <= num; i++) {
			if (isPrime(i))
				// 소수인 경우 출력
				System.out.print(i + " ");
		}
		sc.close();
	}

}
