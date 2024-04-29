package Ch19;
class Employee {
	String name;
	String age;
	String addr;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	
	
	
}
class Parttimer extends Employee	//시간제
{
	int hourpay;
	
	public Parttimer(String name, String age, String addr, int hourpay) {
		super(name, age, addr);
		this.hourpay = hourpay;
	}

	@Override
	public String toString() {
		return "Parttimer [hourpay=" + hourpay + ", name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
	
	
	
}


class Regular extends Employee	//정규직
{
	int salary;
	
	public Regular(String name, String age, String addr, int salary) {
		super(name,age,addr);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Regular [salary=" + salary + ", name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
	
}

// 상속받을 Parttimer, Regular



public class C03Prac {
//	//1 상속관계 만들기 (Employee 직원 클래스 (부모 클래스))
//	//2 적절한 생성자 만들기( super예약어 사용)
//	//3 ShowInfo함수 안에서 Downcasting을 통해서 모든 멤버변수정보 출력하기
	
	
	public static void ShowInfo(Employee employee) {
		//다운캐스팅을 통해서 parttimer or regular를 선별해서
		//모든 정보를 출력해보세요
		
//		System.out.println(employee.toString());
		
//		
		if (employee instanceof Parttimer) {
			Parttimer down = (Parttimer) employee;
			System.out.println("이름 : " + down.name);
			System.out.println("나이 : " + down.age);
			System.out.println("주소 : " + down.addr);
			System.out.println("시급 : " + down.hourpay);
		}
		if (employee instanceof Regular) {
			Regular down1 = (Regular) employee;
			System.out.println("이름 : " + down1.name);
			System.out.println("나이 : " + down1.age);
			System.out.println("주소 : " + down1.addr);
			System.out.println("연봉 : " + down1.salary);
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		Parttimer emp1 = new Parttimer("홍길동", "25", "대구", 20000);
		Regular emp2 = new Regular("서길동", "45", "울산", 50000000);
		ShowInfo(emp1);
		System.out.println("---------------");
		ShowInfo(emp2);
	}

}
