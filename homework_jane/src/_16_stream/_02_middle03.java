package _16_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_middle03 {
	

	//3. 사용자가 입력한 영문자 10개를 저장하는 List<Character> charList를 만들고 스트림을 이용해서
	//영문자가 소문자면 대문자로 대문자면 소문자로 바꾼 스트림을 만들어서 출력하세요.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Character> charList = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.println("영문자를 입력하세요.");
			charList.add(sc.nextLine().charAt(0));
			
		}
		
//		 List<Character> changedList =
		//왜 전체가 다 안나오지 ?? 앞글자만 나옴. 
	
	 charList.stream()
					 .map(ch -> {
						 if(Character.isUpperCase(ch)) {
							return Character.toLowerCase(ch);
							 
						 } else {
							 return Character.toUpperCase(ch);
						 }	 
					 })
					 .collect(
							 Collectors.toList()
							 )
					 .forEach(ch -> System.out.println(ch));

//		  List<Character> changedList = new ArrayList<>();
//		    for (Character ch : charList) {
//		        if (Character.isUpperCase(ch)) {
//		            changedList.add(Character.toLowerCase(ch));
//		        } else {
//		            changedList.add(Character.toUpperCase(ch));
//		        }
//		    }
//
//		    changedList.forEach(System.out::println);
//		}
		 
		 
		
	}

}
