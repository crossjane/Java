package _11_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class _01_basic01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. Map<String, Integer>을 하나 생성하여 key는 알파벳(대소문자 구분) value는 해당 알파벳의
//		유니코드 값을 Integer형태로 저장하세요.
//
//		2. 이름과 전화번호를 쌍으로 하는 주소록을 HashMap으로 구현하고, 특정 이름의 전화번호를
//		조회하는 기능을 구현하세요.

		Map<String , Integer> alpha = new HashMap<String, Integer>();
		
		char[] chaArr = new char[25];
		
		 for (char ch = 'A'; ch <= 'Z'; ch++) {
	            alpha.put(Character.toString(ch), (int)ch);
	        }
		 
		 for (char ch = 'a'; ch <= 'z'; ch++) {
	            alpha.put(Character.toString(ch),(int) ch);
	        }
		 
//		 for (Map.Entry<String, Integer> entry : alphabetUnicodeMap.entrySet()) {
//	            System.out.println(entry.getKey() + ": " + entry.getValue());
//	        }
//	    }
		 
		 
		 Set<Entry<String, Integer>> entry = alpha.entrySet();
			
		 System.out.println(entry);
	

		 
//			boolean equals(Object obj) : 동일한 Entry인지 비교
//			Object getKey() : Entry의 key 리턴
//			Object getValue() : Entry의 value 리턴
//			Object setValue(Object obj) : Entry의 value를 매개변수로 받은 obj로 변경
		
			}
			
}
	}

}
