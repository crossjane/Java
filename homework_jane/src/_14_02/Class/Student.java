package _14_02.Class;


//1. 학생의 이름, 학번, 학과를 속성으로 가지고 학생의 정보를 저장하는 메소드와 학생의 정보를 출력하는 메소드를 갖는 학생 클래스를 생성하세요.
public class Student {
	
	String name; 
	int id; 
	String major;
	
	 public void setStudentInfo(String name, int id, String major) {
		 this.name  = name;
		 this.id = id;
		 this.major = major;
		 
		 
	 }
	

	 public void showStudentInfo(String name, int id, String major) {
		 System.out.println("이름 :" + name );
		 System.out.println("학번 :" + id );
		 System.out.println("전공 :" + major );
	 }

}
