package _16_stream;

public class Student {
	
	
//	 int sno, String sName, int score, String grade를 갖는 Student 클래스를 만들고
	//List<Student> studentList에 (1, 홍길동, 100), (2, 임꺽정, 75), (3, 장길산, 86), (4, 정도전, 97),
			//(5, 이순신, 95)를 저장하고 Stream으로 변환하여 점수가 95점 이상인 학생만 들어있는 Stream을 만드세요.
	//

	int sno; 
	String Name;
	int score;
	String grade;
	
	
	
	public Student(int sno, String name, int score) {
		
		this.sno = sno;
		Name = name;
		this.score = score;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	

	
	
	
	
	
}
