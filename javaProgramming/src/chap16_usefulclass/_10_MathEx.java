package chap16_usefulclass;

import java.util.Scanner;

public class _10_MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자가 5개의 정수를 입력하고 배열에 저장 
		// 배열에 저장된 정수 5개 중 최대값과 최소값을 구하세요. 
		// Math.max와 Math.min 메소드를 이용하세요.
		
		
		Scanner sc = new Scanner(System.in);
		int[] numArr = new int[5];
		
		for(int i = 0; i<5; i++) {
			System.out.println("숫자를 입력하세요");
			numArr[i] = sc.nextInt();
			}
		
		for(int a : numArr) {
			System.out.println(a);
		}
		System.out.println("------------");
		
		int max = numArr[0];		//**
		int min = numArr[0];		//**
		
		
		for(int i = 1; i<numArr.length; i++) {
			 max = Math.max(numArr[i],max);				//**
			 min = Math.min(numArr[i],min);				//**
			}
		System.out.println("최대값 : " + max );
		System.out.println("최소값 : " + min );
		
		sc.close();
	}

}
