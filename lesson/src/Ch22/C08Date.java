package Ch22;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C08Date {
	public static void main(String[] args) throws ParseException{
		Scanner sc = new Scanner(System.in);
		System.out.println("YYYY/MM/DD 입력 : ");
		
		String str = sc.nextLine();
		
		// Format
		SimpleDateFormat fmtin = new SimpleDateFormat("yyyy/MM/dd");
		
		// 대소문자 구분함
		// M : 월, m : 분
		
		
		// 출력시 fmtout을 사용
		SimpleDateFormat fmtout = new  SimpleDateFormat("yyyy-MM-dd");
		
		
		Date tmp = fmtin.parse(str);		// parse : fmtin이 가지고 있는 형식으로 해석해서 날짜 정보를 가지는 객체를 생성해서 연결
		System.out.println(tmp);
		
		
		// Format 설정 후 출력
		System.out.println(fmtout.format(tmp));		// format : fmtout이 가지고 있는 형식(yyyy-MM-dd)으로 날짜 형태를 지정함.
		
		
		
		
		
		
		
		
	}

}
