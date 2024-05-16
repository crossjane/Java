package _14_01;

import java.util.Scanner;

public class _05_07 {
	
	//7. 사용자가 입력한 두 정수의 최소공배수와 최대공약수를 출력하세요.
	
	// 최대 공약수(GCD)를 구하는 메서드
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // 최소 공배수(LCM)를 구하는 메서드
    static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수를 입력하세요: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		scanner.close();

		// 최소공배수 출력
		int lcmResult = lcm(num1, num2);
		 System.out.println("최소공배수: " + lcmResult);

		 // 최대공약수 출력
		int gcdResult = gcd(num1, num2);
		System.out.println("최대공약수: " + gcdResult);
			 }

}
