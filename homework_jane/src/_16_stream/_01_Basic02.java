package _16_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_Basic02 {

//
//2. 사용자가 입력한 문자열 10개를 저장한 문자열 리스트를 이용하여 문자열의 길이가 5이상인 문자열만 출력하세요.
//
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		List<String> strList = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		
		
		for(int i = 0 ; i < 10; i++) {
			System.out.println("문자열을 입력하세요.");
			strList.add(sc.nextLine());

			}
		
	
	 List<String> strList2 = strList.stream()
										.filter(num -> num.length() >= 5)
										.collect(Collectors.toList());
	 
	}			
}
	 //strList2.forEach(System.out::println);
									
	 									
	 

	 
//	 Stream flatMap(Function<T, R>, DoubleFunction, IntFunction, LongFunction) : 
	 //스트림의 요소를 하나 이상의 새로운 스트림으로 만들어서 모든 스트림을 하나의 스트림으로 연결하는 기능.
//	 스트림의 요소들이 다른 스트림을 가지고 있을 때 하나의 스트림으로 통합해서 사용할 수 있게 해준다.
	 
	 
	


