package _11_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class _02_middle02 {
	
	
		

	//2. 매개변수로 Map<Integer, Integer>이 주어졌을 때 key, value의 곱이 가장 
			//큰 Entry를 리턴하는 메소드 getMaxMul을 구현하세요.
	
	
		//Map<Integer, Integer> num = new HashMap<Integer, Integer>();
		
		public static Entry<Integer, Integer> getMaxMul(Map<Integer, Integer> num) {
			
		//Entry max값으로 받기 위한 초기화
		Entry<Integer, Integer> maxEntry = null;
		//max 값을 가장 작은 값으로 설정 초기화
		int maxMul = 0;
		
		for(Entry<Integer, Integer> entry : num.entrySet()) {
			int mul = (entry.getValue() * entry.getKey());
			
			 if(maxMul < mul) {
				 maxMul = mul; 
				 maxEntry = entry;
				 
				 
			 } 
		}return maxEntry;
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Map<Integer, Integer> num = new HashMap<Integer, Integer>();// 선언을 해야함.
			Entry<Integer, Integer> maxMulEntry = getMaxMul(num);
			
			// 결과 출력
			if (maxMulEntry != null) {
				System.out.println("가장 큰 곱을 가진 Entry: " + maxMulEntry.getKey() + ", " + maxMulEntry.getValue());
			} else {
				System.out.println("빈 맵이거나 유효한 Entry가 없습니다.");

			}
		}
			
	
		
		
		
	}


