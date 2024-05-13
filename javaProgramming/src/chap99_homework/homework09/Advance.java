package chap99_homework.homework09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 사용자가 입력한 문자열에서 가장 많이 등장하는 문자와 그 개수를 출력하세요.
//	    (Map<Character, Integer> 형태의 Map과 Entry 사용)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		String input = sc.nextLine();
		
		Map<Character, Integer> chMap = 
				new HashMap<Character, Integer>();
		
		// 문자열을 순회하며 각 문자의 등장 횟수를 카운트
		for(int i = 0; i < input.length(); i++) {
			 // 첫 번째 문자일 경우, Map에 새로운 문자와 1을 저장
			if(i == 0) {
				
				chMap.put(input.charAt(i), 1);
			} else {
				 // 이미 등장한 문자인지 확인하기 위해 Map의 Entry 집합과 Iterator 사용
				Set<Entry<Character, Integer>> entrySet = chMap.entrySet();
				Iterator<Entry<Character, Integer>> it = entrySet.iterator();
				int cnt = 0;
				char key = 0;
				while(it.hasNext()) {
					Entry<Character, Integer> ent = it.next();
					 // 이미 Map에 등록된 문자일 경우, 해당 문자의 등장 횟수를 증가시키고 반복문 종료
					//iterator.next()로 객체를 꺼내와서
					//그 내용을 변경하게 되면 iterator가 인식하지 못하게
					//되어 에러발생
					if(ent.getKey() == input.charAt(i)) {        
						key = ent.getKey();
						cnt = ent.getValue();
						//System.out.println(ent.getKey() + " : " + ent.getValue());
						break;
					} 
				}
				 // 만약 이미 Map에 등록된 key문자일 경우, 등장 횟수를 증가시킴
				if(key != 0 && cnt != 0) {   			//여기는 vaule값도 같은?? 
					chMap.put(key, ++cnt);
				} else {	// 등록되지 않은 문자일 경우, Map에 새로운 문자와 1을 저장
					chMap.put(input.charAt(i), 1);
				}
				
			}
		}
		System.out.println(chMap);

		int maxCnt = 0;
		char maxCh = 0;
		
		for(Entry<Character, Integer> ent : chMap.entrySet()) {
			if(ent.getValue() > maxCnt) {
				maxCnt = ent.getValue();
				maxCh = ent.getKey();
			}
		}
		
		System.out.println(maxCh + ":" + maxCnt);

		sc.close();
	}

}

//

package chap99_homework.homework09;

//필요한 클래스들을 import 합니다.
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Advance {

 public static void main(String[] args) {
     // 사용자로부터 문자열 입력을 받기 위한 Scanner 객체를 생성합니다.
     Scanner sc = new Scanner(System.in);
     
     // 사용자에게 문자열 입력을 요청하는 메시지를 출력합니다.
     System.out.println("문자열을 입력하세요.");
     // 사용자가 입력한 문자열을 저장합니다.
     String input = sc.nextLine();
     
     // 문자와 그 문자가 등장한 횟수를 저장할 HashMap 객체를 생성합니다.
     Map<Character, Integer> chMap = 
             new HashMap<Character, Integer>();
     
     // 입력받은 문자열의 각 문자에 대하여 반복합니다.
     for(int i = 0; i < input.length(); i++) {
         // 첫 번째 문자인 경우, 바로 HashMap에 추가합니다.
         if(i == 0) {
             chMap.put(input.charAt(i), 1);
         } else {
             // HashMap의 entrySet을 가져와서 반복자(Iterator)를 생성합니다.
             Set<Entry<Character, Integer>> entrySet = chMap.entrySet();
             Iterator<Entry<Character, Integer>> it = entrySet.iterator();
             // 현재 문자와 일치하는 key를 찾았을 때 사용할 변수들을 초기화합니다.
             int cnt = 0;
             char key = 0;
             // 반복자를 사용하여 HashMap의 모든 entry를 순회합니다.
             while(it.hasNext()) {
                 Entry<Character, Integer> ent =  it.next();
                 // 현재 순회중인 entry의 key가 현재 문자와 일치하는지 확인합니다.
                 if(ent.getKey() == input.charAt(i)) {
                     // 일치한다면, 해당 key와 그 key의 count를 저장합니다.
                     key = ent.getKey();
                     cnt = ent.getValue();
                     break;
                 } 
             }
             
             // 일치하는 key를 찾았다면 해당 key의 count를 1 증가시키고, 그렇지 않다면 새로운 entry를 추가합니다.
             if(key != 0 && cnt != 0) {
                 chMap.put(key, ++cnt);
             } else {
                 chMap.put(input.charAt(i), 1);
             }
             
         }
     }
     
     // 최종적으로 각 문자의 등장 횟수를 저장한 HashMap을 출력합니다.
     System.out.println(chMap);

     // Scanner 객체를 닫아줍니다.
     sc.close();
 }

}
