package Ch22;

import java.util.Calendar;
import java.util.Date;

//### Date Class ###
//JAVA에서 날짜와 시간을 나타내기 위한 클래스임.
//JAVA 8부터는 새로운 날짜 및 시간 API인 "java.time" 패키지의 LocalDate, LocalTime, LocalDateTime 등으로 대체됨.

//### Calendar Class ###
//날짜와 시간을 다루기 위한 추상 클래스
//날짜 계산 및 조작을 위해서 자바에서 제공되는 클래스
//JAVA 8부터는 "java.time" 패키지의 날짜 및 시간 API로 대체됨.

//==> 하지만 Date 클래스는 여전히 많이 사용되고 있음.
public class C07Date {
	public static void main(String[] args) {
		
		Date d1 = new Date();		// 현재 날짜와 시간으로 Date 객체를 생성
		System.out.println(d1);
		
		// 현재 연도에서 1900년을 뺀 값을 반환
		System.out.println(d1.getYear() + 1900 + "년");
		// 0에서 11까지의 값을 반환하기 때문에 1을 더해서 현재 달의 수를 구한다.
		// 현재는 4월이니깐 3의 값을 반환
		// 거기다가 +1해서 ==> 4월
		System.out.println(d1.getMonth() + 1 + "월");
		
		
		// 요일
		// 0 : 일요일
		// 1 : 월요일
		// 2 : 화요일
		// 3 : 수요일
		// 4 : 목요일
		// 5 : 금요일
		// 6 : 토요일
		System.out.println(d1.getDay());
		
		System.out.println(d1.getHours() + "시"); // 24시 기준임
		System.out.println(d1.getMinutes() + "분"); 
		System.out.println(d1.getSeconds() + "초");
		System.out.println();
		
		
		// 보통 getInstance() ==> 날짜 정보를 받을 떄 사용
		Calendar cal = Calendar.getInstance();	
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.AM_PM)); // 오전 : 0, 오후 : 1
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND) );
		
		String strWeek = null;
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("요일 값 : " + week);		// 1 ~ 7 (일월화수목금토)
		
		System.out.println(Calendar.SATURDAY);
		
		switch(week) {
			case Calendar.MONDAY:
				strWeek = "월";
				break;
			case Calendar.TUESDAY:
				strWeek = "화";
				break;
			case Calendar.WEDNESDAY:
				strWeek = "수";
				break;
			case Calendar.THURSDAY:
				strWeek = "목";
				break;
			case Calendar.FRIDAY:
				strWeek = "금";
				break;
			case Calendar.SATURDAY:
				strWeek = "토";
				break;
			default:
				strWeek = "일";
			
		}
		
		System.out.println(strWeek);
		
		
		
						
	
		
		
		
		
		
	}

}
