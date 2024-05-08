package chap07_class.student;

public class Student {
	
	public String name;
	public int age; 
	public String major;
	
	public Student() {
		
	}
	
	public Student(String name) {
		this.name = name;

	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	
	}
	
	public Student(String name, int age, String major) {
		this.name = name;
		this.age = age;
		this.major = major;
	
	}
	
	
	
	
	
	public void StudentInfo() {
		//생성자에서 this객체가 생성된 객체를 의미한다면 
		//인스턴스 메소드에서 this객체는 해당 메소드를 소유하고 있는 객체를 의미한다.
		
		//this는 안써도되느닞?? 왜쓰는거"ㄱ
		
		System.out.println("학생 이름 : " + this.name);
		System.out.println("학생 나이 : " + this.age);
		System.out.println("학생 전공 : " + this.major);
		
	
	}

}


