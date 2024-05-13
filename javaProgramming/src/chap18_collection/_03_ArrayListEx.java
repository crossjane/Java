package chap18_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03_ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> list = new ArrayList<>();
		
		list = ListString();
		System.out.println(list);
		
		//2. 사용자가 입력한 문자열을 StringBuilder객체에 저장하고 
		//길이를 10씩 잘라서 List<StringBuilder>에 저장하고 출력하세요.
		
		
		Scanner sc = new Scanner(System.in);
		StringBuilder strBuild = new StringBuilder(sc.nextLine());
		
		
		 
		List<StringBuilder> strBuildList = new ArrayList<>();
		
		// 문자열을 10씩 잘라서 List<StringBuilder>에 저장
		for(int i = 0 ; i < strBuild.length(); i+=10) {
			//문자열의 길이가 10보다 클경우 
			if(i + 10 < strBuild.length()) {
				//새로운 객체를 만들어서 저장 10씩 저장? 
				strBuildList.add(
					new StringBuilder(
							strBuild.substring(i, i+10)
							)
					);
				  // 남은 부분 문자열을 새로운 StringBuilder로 만들어 List에 추가
			} else {
				strBuildList.add(
					new StringBuilder(
							strBuild.substring(i,strBuild.length())
								)
						);
			}
			
		}
				
		for(StringBuilder strBuild2 : strBuildList) {
			System.out.println(strBuild2);
		}
		
		sc.close();
		
		
	}

	//1.사용자가 입력한 5개의 문자열을 List<Stirng>에 저장해서 리턴하는 메소드를 구현하세요.
	
	public static List<String> ListString() {  //static인 이유??
	
	Scanner sc = new Scanner(System.in);
	List<String> strList = new ArrayList<>();
	
	for(int i = 0; i < 5 ; i++) {
		System.out.println("문자열을 입력하 세요.");
		strList.add(sc.nextLine());
	} 
	sc.close();
	return strList;
	}  
}

  //List subList(int startIndex, int endIndex) : startIndex ~ endIndex까지의 데이터를 List형태로 리턴