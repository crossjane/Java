package _11_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _02_middle01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. 학생이름을 key로 시험점수를 value로 가지는 Map<String, Integer>를 생성하고
//		  4명의 학생 데이터를 입력한 후 4명 중 최고 점을 맞은 학생의 이름과 점수을 출력하세요.(이름 : 90)
//
//		2. 매개변수로 Map<Integer, Integer>이 주어졌을 때 key, value의 곱이 가장 
		//큰 Entry를 리턴하는 메소드 getMaxMul을 구현하세요.
//
//		3. Map<Integer, Integer>을 매개변수로 받아서 key는 정순 출력, 
		//value는 역순 출력하는 printKVDesc라는 메소드를 구현하세요. 
//		{1: 3, 2: 4, 3: 5}
//		1 : 5
//		2 : 4
//		3 : 3

		Map<String, Integer> stdScore = new HashMap<String, Integer>();
		
//		Scanner sc = new Scanner(System.in);
//		int inputScr = sc.nextInt();

		stdScore.put("김화영",20);
		stdScore.put("김나라",10);
		stdScore.put("박광수",80);
		stdScore.put("진지희",75);
		
		// 최고 점을 맞은 학생의 이름과 점수 찾기
		Entry<String, Integer> topStd = null;
       // String topStudent = null;
        int highestScore = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : stdScore.entrySet()) {
            if (entry.getValue() > highestScore) {
            	
            	
                topStudent = entry.getKey();
                highestScore = entry.getValue();
                topStd = 
                
              //  higestStd.entrySet().put. ?? 최고점. 세트로 뽑을 수 있는지?
            }		
        }
        System.out.println(stdScore.entrySet());
	}
}
