package chap02_variables;

public class _01_OneOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.부호연산자
		int num1 = 10;
		
		System.out.println(+num1);
		System.out.println(-num1);
		
		System.out.println("----------------");
		
		//2.증감연산자
		//2-1. 전위 증감연산자
		int num2 =20; 
		
		if(++num2 > 20) {
			System.out.println("num2는 20보다 큽니다.");
		}
		System.out.println(--num2);
		System.out.println("--------------------");
		
		//2-2. 후위 증감연산자
		int num3 = 20;
		if(num3++ >20) {
			System.out.println("num3는 20보다 큽니다.");// 20을 넣고 ++은 >20과 비교후에 증가되기때문에 21인채로 나옴. 
		}
		System.out.println(num3--); //** 출력 21 값은 20 식이 프린트 된다음에 마이너스가 되기 때문에.
		System.out.println("--------------------");
		
		//3. 전위, 후위 증감연산자의 혼합 
		int num4 = 10; 
		
		//출력 :11 , num4:11
		System.out.println(++num4); 
		//출력 :12, num4:12
		System.out.println(++num4); 
		//출력 :12, num4:11
		System.out.println(num4--); 
		//출력 :10 , num4:10
		System.out.println(--num4); 
		//출력 :10 , num4:9
		System.out.println(num4--);
		//출력 : 8, num4:8
		System.out.println(--num4);
		
		
		
		
		
		
		
		
		
	}

}
