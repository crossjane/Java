package Ch13;

class C10Person {
	String name;
	int age;
	String address;

	void setPerson(String name) {
		this.name = name;

	}

	void setPerson(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void setPerson(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	 //기능(멤버메서드)
	 void talk() {
		 System.out.println(name + "님이 말합니다.");
	 }
	 void walk() {
		 System.out.println(name + "님이 걷습니다.");
	 }
	 void ShowInfo() {
		 System.out.printf("이름 : %s 나이 : %d 주소 : %s\n", name, age, address);
	 }

}

public class C10PersonMain {

	public static void main(String[] args) {

		C10Person obj = new C10Person();

		obj.setPerson("홍길동"); // 멤버변수 name에 "홍길동" 저장
		obj.ShowInfo(); // 이름 : 홍길동 나이 : 0 주소 : null

		obj.setPerson("서길동", 10); // 멤버변수 name, age에 각각 저장
		obj.ShowInfo(); // 이름 : 서길동 나이 : 10 주소 : null

		obj.setPerson("강호동", 55, "서울"); // 멤버변수 name, age, addr에 각각 저장
		obj.ShowInfo(); // 이름 : 강호동 나이 : 55 주소 : 서울

		obj.talk(); // 홍길동님이 말합니다.
		obj.walk(); // 홍길동님이 걷습니다.

	}

}
