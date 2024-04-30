package chap06_method;

import java.util.Scanner;

import chap06_method.score.Score;

public class _05_Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score aaa = new Score();						//이거는 무슨역할??? aaa.getAvgScore(scores)//aaa 변수에 담가있는 메서드를 가져옴
											//Score 클래스 타입. 받고 aaa라는 변수를 만들어서 score클래스에 있는 메서드를 가져오는것. 
		
		//String a =" aaaa"; 
		
		
		
		int studentCnt; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 수를 입력하세요.");
		studentCnt = sc.nextInt();
		
		int[] scores = new int[studentCnt];
		
		for(int i = 0; i < studentCnt; i++) {
			System.out.println("점수를 입력하세요.");
			scores[i] = sc.nextInt();	
		}
		
		System.out.println("점수의 총합은: " + aaa.getTotalScore(scores));
		System.out.println("점수의 평균은: " + aaa.getAvgScore(scores));
		
		sc.close();
		
	}

}
