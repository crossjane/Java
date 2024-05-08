package chap16_usefulclass;

public class _08_Math01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num = 1234.5678;
		
		//1. ceil : 소수점 첫째 자리에서 올림 . double 타입으로 리턴
		System.out.println(Math.ceil(num));
		
		//2. 소수점 셋째자리 까지 올림
		System.out.println(Math.ceil(num * 1000) /1000);
		
		//3. round : 소수점 첫째자리에서 반올림. long 타입으로 리턴
		System.out.println(Math.round(num));
		
		//4. 소수점 둘 째자리까지 반올림 
		System.out.println((double)Math.round(num * 100)/ 100); // 원하는 값얻으려면 double로 형변환 해야함.
		
		//5. floor : 소수점 첫째자리에서 버림. double 타입으로 리턴
		System.out.println(Math.floor(num));
		
		//6. 소수점 첫 째자리까지 버림 
		System.out.println(Math.floor(num * 10) / 10);

	}

}
