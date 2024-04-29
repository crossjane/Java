import java.util.Scanner;

public class Ch10 {

	public static void main(String[] args) {
		// 중첩 while문
		
		
		// 예제
		// 구구단 2단 출력
//		int dan = 2;
//		int i = 1;
//		System.out.println("2단 출력할게요 'ㅡ'");
//		while (i <= 9) {
//			System.out.printf("%d x %d = %d\n", dan, i , dan * i);
//			i++;
//		}
		
		
		// 문제
		// 구구단 N단 출력
//		Scanner sc = new Scanner(System.in);
//		int dan = sc.nextInt();
//		int i = 1;
//		System.out.println(dan + "단 출력할게요 'ㅡ'");
//		while (i <= 9) {
//			System.out.printf("%d x %d = %d\n", dan, i , dan * i);
//			i++;
//		}
		// 2단 역순 출력
//		int dan = 2;
//		int i = 9;
//		System.out.println("2단 출력할게요 'ㅡ'");
//		while (1 <= i) {
//			System.out.printf("%d x %d = %d\n", dan, i , dan * i);
//			i--;
//		}
		
		
		
		
		// 문제
		// 구구단 2단부터 9단까지 출력
//		int dan = 2;
//		int i = 1;
//		
//		
//		while(dan <= 9) {
//			i = 1;				// i를 1로 초기화 
//			while(i <= 9) {
//				System.out.printf("%d x %d = %d", dan, i, dan * i);
//			}
//			dan++;
//		}
		
		
		// N부터 9단까지 전체 출력 
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("단을 입력하세요 >>> ");
//		int dan = sc.nextInt();
//		
//		
//		int num;
//		
//		while (dan <= 9) {
//			num = 1;
//			while(num <= 9) {
//				System.out.printf("%d x %d = %d\n", dan, num, dan * num);
//				num++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		
		
		// 1
		//*****
		//*****
		//*****
		//*****
		
//		int i = 1;
//		while(i <= 4) {
//			int j = 1;
//			while(j <= 5) {
//				System.out.print("*");
//				j++;
//			}
//			i++;
//			System.out.println();
//		}
		
		
		
		
		//높이 : n
		//*****
		//*****
		//*****
		//*****
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("높이 : ");
//		int n = sc.nextInt();
//		
//		int i = 0;
//		int j = 0;
//		while (i < n ) {
//			while( j < n) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			j = 0;
//			i++;
//		}
		
		
		
		//2
		//*
		//**
		//***
		//****
//		
//		int i = 1;
//		while (i <= 4) {
//			// 별찍기
//			int j = 1;
//			while (j <= i) {
//				System.out.print("*");
//				j++;
//			}
//			
//			i++;
//			System.out.println();
//		}
//		
		
		//높이 : 4
		//*
		//**
		//***
		//****
		
		
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		
//		int i = 0;
//		int j = 0;
//		while ( i < n ) {
//			j=0;
//			while( j <= i ) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		
		//3
		//****
		//***
		//**
		//*
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 개행(줄바꿈)					별의 개수
		//	i  						 byul
		//  1						 4
		//  2						 3
		//  3						 2
		//  4						 1
		
		
//		int i = 1;
//		while (i <= 4) {
//			// 1. 4로 변수 초기화
//			// 별의 개수 4에서부터 감산하겠다.
//			
//			// 2. 1로 변수 초기화
//			// 별의 개수 1에서부터 증산하겠다. 
//			int byul = 4;
//			while(byul >= i) {
//				System.out.print("*");
//				byul--;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		
		
		
		
		//4
		//---*
		//--***
		//-*****
		//*******
		// 줄			공백			별
		// i			j			byul
		// 0			3			1
		// 1			2			3
		// 2			1			5
		// 3			0			7
		
		// n			3 - n		2 * n + 1
		
		
		
		
//		int i = 0;
//		
//		while (i <= 3) {
//			int j = 0;				// - 기호
//			while(j <= (2 - i)) {
//				System.out.print(" ");
//				j++;
//			}
//			int byul = 0;
//			
//			while(byul <= 2 * i) {
//				System.out.print("*");
//				byul++;
//			}
//			
//			System.out.println();
//			i++;
//		}
		
		
		
	    
	      //5
	  		//*******
	  		// *****
	  		//  ***
	  		//   *
					
		

	}

}
