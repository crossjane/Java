package Ch13;

//문제 2: 학생 클래스 만들기

//1. Student 클래스를 작성하세요.
//2. name과 age라는 두 개의 속성을 가지도록 클래스를 구성하세요.
//3. name과 age 속성에 대한 초기화를 해주세요.

//4. displayInfo() 메소드를 구현하여 학생의 정보를 출력하세요.

class Student {
	String name;
	int age;
	
	public void displayInfo() {
		System.out.println("[SYSTEM] : 학생 정보를 출력합니다.");
		System.out.println("학생 이름 : " + name);
		System.out.println("학생 나이 : " + age);
		
	}
}


public class C03PracStudent {
	public static void main(String[] args) {
		
		Student std = new Student();
		std.name = "이동하";
		std.age = 12;
		std.displayInfo();
		
	}
	

}
