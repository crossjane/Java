package _15_lambda;

import java.util.Scanner;

public class _02_middle01 {
//	1. 두 개의 StringBuilder 값을 매개변수로 받아 두 개의 값을 합친 후
	//역순으로 바꿔서 리턴하는 combineStrBuilder를 람다식으로 구현하세요.
	
	//2. 2번 문제에서 StringBuilder 두 개를 합치는 메소드 appendSb와 역순으로
	//변경하는 메소드 reverseSb를 각각 선언하고 StringBuilder의 메소드를 참조하여 combineStrBuilder
	//각각 구현하세요.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder strb1 = new StringBuilder();
		strb1.append("안녕");
		
		StringBuilder strb2 = new StringBuilder();
		strb2.append("바보야");
		
		
		StringBuilder result = Printcombine(strb1, strb2,(sn1, sn2) -> {
			
			return strb1.append(strb2).reverse();
			
		 
			
		});

		
	}
	
	public static StringBuilder Printcombine(StringBuilder strb1, StringBuilder strb2, StringBuilderUtils stringBuilderUtils) {
		
		
		
		
		
		return stringBuilderUtils.combineStrBuilder(strb1, strb2);
		
	}
		
	
}


