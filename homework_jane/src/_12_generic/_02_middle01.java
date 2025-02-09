package _12_generic;

import java.util.Map;
import java.util.Map.Entry;

public class _02_middle01 {
	
	public static void main(String[] args) {
		
	}
	
//	1. key와 value 모두 Number를 상속받은 클래스만 받고 매개변수로 Map이 주어졌을 때 key, value의 곱이 가장 큰 Entry를 리턴하는 메소드 getMaxMul을 구현하세요.
//
//	2.  Number 클래스를 상속받은 클래스만 지정가능한 제네릭 클래스를 만들고 T 배열을 매개변수로 받아서
	//합, 차, 곱셈, 나눗셈을 연산해주는 메소드를 구현하세요. 각 메소드는 double로 리턴하고 add, sub, mul, div로 메소드명을 갖습니다.
	//(Math.round()로 소수점 두자리까지만 표출)
//
//	3. 커피 메뉴를 갖는 enum을 생성하고 AMERICANO, LATTE, MOCHA, COLDBREW 4개로 지정한다. 
	//가격이 값이 되고 순서대로 2000, 3000, 4000, 4500으로 지정한다. 메뉴의 총 가격을 계산하는 추상 메소드를 정의하고
	//각각의 상수에서 구현하는데 아메리카노(아이스 300 추가), 라떼(아이스 500 추가), 모카(휘핑 1000 추가), 콜드브루(시럽 200 추가)
	//모든 메뉴 옵션 없는 주문은 지정한 가격대로 진행된다. totalPrice(int optionOrder, int normalOrder) 옵션 추가 잔수와 일반
	//메뉴 잔수를 받아서 각 메뉴의 가격을 계산하는 추상 메소드 구현한다. 아아 2잔 뜨아 1잔 아라 1잔 휘핑 모카 2잔 콜드브루 2잔일 때의 가격을 출력하세요.
//
//	4. Map<Integer, Integer>을 매개변수로 받아서 List<Entry<K, V>>를 리턴하는 메소드 getOverHundr를 구현하세요. 매개변수 Map에는 key는
	//50~60까지 value는 15~25까지 넣어주고 키와 밸류의 곱셈의 결과가 1000을 넘는 Entry만 List에 저장합니다.
//
//	5. 제네릭 타입의 리스트를 멤버 변수로 갖는 TList라는 제네릭 클래스를 만들고 splitList라는 메소드를 만들고 멤버변수인 List를
	//반반씩 두개의 리스트로 나누는 기능을구현하세요.(리스트의 요소 개수가 짝수면 반반 동일한 개수로, 홀수면 첫 번째 리스트의 요소가 한 개씩 많게)

	//public static <K extends Number, V extends Number> Map.Entry<K, V> getMaxMul(Map<K, V> map) {
	
	public static <K extends Number,V extends Number> Entry<K,V> getMaxMul(Map<K, V> map) {
		
		
		Map.Entry<K, V> maxEntry = null;
		double maxMul = 0;
		
		for(Map.Entry<K, V> entry : map.entrySet()) {
			double mul = (entry.getKey().doubleValue())*(entry.getValue().doubleValue());		
				if (mul > maxMul) {
					maxMul = mul;
					maxEntry = entry;
			} 
	    }
	    return maxEntry;
		
		
	 //   4. Map<Integer, Integer>을 매개변수로 받아서 List<Entry<K, V>>를 리턴하는 메소드 getOverHundr를 구현하세요. 매개변수 Map에는 key는
	//50~60까지 value는 15~25까지 넣어주고 키와 밸류의 곱셈의 결과가 1000을 넘는 Entry만 List에 저장합니다.

	public static List<Entry<K, V>> getOverHundr(Map<Integer,Integer> map){

		Map.Entry<K, V> entryList = null;
		
		
		
			int mul = 0;

			for(Map.Entry<K, V> entry : map.entrySet()) {
				if(entry.getKey() <= 60 && entry.getKey() >= 50) {
					if(entry.getValue() >= 15 && entry.getValue() <= 25) {
						mul = entry.getKey()*entry.getValue();
					}
				}
				
				if(mul > 1000) {
					entryList = entry;
						
				}
			}
			
		
			return entryList;
		}
	    
	    
	}
	
	
	
}
