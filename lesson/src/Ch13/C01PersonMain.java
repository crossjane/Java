package Ch13;


//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//문제
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

//1. C01Person 클래스를 작성하세요.
//2. name, age, addr 세가지 속성을 가지도록 클래스를 구성하세요.
//3. hello()라는 기능을 가지도록 클래스를 작성해주세요!


public class C01PersonMain {
	public static void main(String[] args) {
		// 메인메서드 정상적으로 동작되도록 메서드와 클래스를 정의해보세요!!
		C01Person hong = new C01Person();
		hong.name = "홍길동";
		hong.age = 35;
		hong.address = "대구광역시 반월당 파출소";
		hong.hello();
		System.out.printf("%s님의 나이는 %d이고 주소는 %s입니다", hong.name, hong.age, hong.address);
		
	}

}
