package _16_stream;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class _01_Basic03 {


//3. 사용자가 입력한 문자열 10개를 저장하는 List<String> strList를 만들고 스트림을 이용해서 문자열에
	//영문자가 포함된 문자열만 뽑아서 스트림을 만들고 출력하세요.

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		List<String> strList = new ArrayList<>();
			
		Scanner sc = new Scanner(System.in);

			for(int i = 0 ; i < 10; i++) {
				System.out.println("문자열을 입력하세요.");
				strList.add(sc.nextLine());
	
				}
			
	
	strList.stream()
			.filter(str -> str.matches(".*[a-zA-Z].*"))
			.forEach(str -> System.out.println(str));
	
	//forEach 메서드는 void를 반환하기떄문에 . 스트림 파이프라인의 마지막 작업으로 사용할 수 있지만, 스트림을 반환하지 않는다.
	// 따라서 engStream 변수를 사용할 필요가 없다,
	// .forEach(System.out::println);


    
	
	
	// 정규표현식.
	//	.은 임의의 문자(줄바꿈 문자를 제외한 모든 문자)를 의미.(어떤 문자든 대체.)
	//	*은 0번 이상 반복을 의미  a-zA-Z 가 한번이상 반복된 모든 문자를 뜻함. 


	//engStream.forEach(System.out::println);
		
	}
		
}


