package chap23_stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _06_ArraysToStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArr = new int[10];
		
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = (int)(Math.random()*10) + 1;
			
		}
		
		
		//1. 배열로 Stream 생성하기 
		//Arrays.stream()를 사용하거나 
		//Stream.of() 메소드를 사용
		//기본타입 배열들은 Stream<제네릭>형태로 만들 수 없기 때문에 
		//기본타입에 매핑되어있는 IntStream, DoubleStream, LongStream,....
		//을 이용한다. of()메소드도 IntStream, DoubleStream, LongStream의 of()메소드 사용.
		
		//Stream<Integer>
		IntStream intStream1 = Arrays.stream(intArr);
		IntStream intStream2 = Arrays.stream(intArr);
		
		String[] strArr = new String[10];
		
		for(int i = 0; i < 10; i++) {
			strArr[i] = String.valueOf(i);
		}
		
		//String은 클래스이자 참조타입이기 때문에 Stream<String> 형태로 변환한다.
		Stream<String> strStream1 = Arrays.stream(strArr);
		Stream<String> strStream2 = Arrays.stream(strArr);
		
		
		//IntStream도 Stream이기 때문에 
		//Stream 클래스의 모든 메소드를 사용할 수 있다. (forEach, map, filter, reduce)
		//intStream1에서 5이상 되는 값만 추출하고 
		//추출된 값들에서 4를 곱한 요소로 구성된 새로운 Stream을 만들고 
		//요소들을 하나씩 출력하세요.
		//배열을 스트림으로 변환해도 파이프라인 구성가능하다.
		
		
		intStream1.filter( num -> num >= 5)
				.map(num -> num * 4)
				.forEach(num -> System.out.println(num));
//		
//		forEach(type의 값을 주입할 변수명(원하는대로 정한다.) -> 실행코드) : 
		//Stream에 담겨있는 의 요소를 순회하면서(하나씩 접근) 실행코드를 요소의 개수만큼 반복실행. 
		//리턴타입이 void라 리턴할 수 없다.
//		map(type의 값을 주입할 변수명(원하는대로 정한다.) -> 새로운 스트림을 만들어줄 실행코드) : 
		//Stream에 담겨있는 의 요소를 순회하면서(하나씩 접근) 실행코드에서 나온 결과값으로 새로운 
		//스트림을 생성해서 리턴
//		filter(type의 값을 주입할 변수명(원하는대로 정한다.) -> 조건코드) : 
		//변수명 담긴 요소를 조건코드로 검사한다. true가 나오는 요소들만 다시 스트림으로 묶어서 리턴.
//		reduce((결과값의 타입 변수명, type의 변수명) -> 어떻게 결과 값을 만들지) :
		//스트림을 하나의 결과값으로 만들어주는 메소드
//		
		
//		intStream1.map(num -> 
//				{if(num >= 5) {
//					return num;
//					}	
//				})
//				.forEach(num-> {num * 4)
//		

	}

}
