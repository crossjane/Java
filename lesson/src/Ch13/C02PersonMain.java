package Ch13;

class C02Person {
	String name;
	int age;
	String addr;
	
	
	
}



//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//문제
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

//1. C02Person 클래스를 작성하세요.
//2. name, age, addr 세가지 속성을 가지도록 클래스를 구성하세요.

public class C02PersonMain {
	public static void main(String[] args) {
		C02Person hong = new C02Person();
		hong.name = "홍길동";
		hong.age = 55;
		hong.addr = "대구대구대구";
		
		System.out.printf("%s %d %s\n", hong.name, hong.age, hong.addr);
	}
	
	
	
	
	

}
