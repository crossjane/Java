package chap99_homework.homework04;

import java.util.Scanner;

public class UseOfEmplyee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//{new Employee() , new Employee(), new Employee() ,....} 
		// Employee클래스가 abstract 클래스 이기때문에 { new Regular Employee(), new TemporaryEmployee(), new Employee()...}도 가능
		Employee[] empArr = new Employee[100];
		
		Scanner sc = new Scanner(System.in);
		
		int eno;
		String name;
		int pay;
		int bonus;
		int hireYear;
		int workDay;
		int index = 0;

		while(true) {
		
			System.out.println("****메뉴선택****");
			System.out.println("1.정규직 저장");
			System.out.println("2.임시직 저장");
			System.out.println("3.계약직 저장");
			System.out.println("4.전체 사원정보 출력");
			System.out.println("5.월급 계산 출력");
			System.out.println("6.프로그램 종료");
			
			int menuSelect = sc.nextInt();
	
			switch(menuSelect) {
			case 1:

				empArr[index++] =  generateEmployee(sc,menuSelect);
				
//				System.out.println("사번을 입력하세요.");
//				eno = sc.nextInt();
//				sc.nextLine();											//왜 여기 nextline 쓰지?
//				System.out.println("이름을 입력하세요.");
//				name = sc.nextLine();
//				System.out.println("급여를 입력하세요.");
//				pay = sc.nextInt();
//				System.out.println("보너스를 입력하세요");
//				bonus = sc.nextInt();
			
//				Employee emp = new RegularEmployee(eno, name, pay, 1, bonus);  //1 뭐임?
//				empArr[index++] = emp;							//index++ << 추가.
				
				// 같은것임.
			
				//empArr[index++] =  new RegularEmployee(eno, name, pay, 1, bonus);
				
				break;
				
			case 2:
				System.out.println("사번을 입력하세요.");
				eno=sc.nextInt();
				sc.nextLine();
				System.out.println("이름을 입력하세요.");
				name =sc.nextLine();
				System.out.println("급여를 입력하세요.");
				pay =sc.nextInt();
				sc.nextLine();
				System.out.println("근무년수를 입력하세요");
				hireYear = sc.nextInt();
				sc.nextLine();
				
				empArr[index++] =  new TempEmployee(eno, name, pay, 2, hireYear);
				//empArr[index] = {eno, name, pay, hireYear}; 내가푼것 
				break;
				
			case 3:
				System.out.println("사번을 입력하세요.");
				eno=sc.nextInt();
				sc.nextLine();
				System.out.println("이름을 입력하세요.");
				name =sc.nextLine();
				System.out.println("급여를 입력하세요.");
				pay =sc.nextInt();
				System.out.println("근무일수를 입력하세요");
				workDay = sc.nextInt();
				
				empArr[index++] =  new ContractEmployee(eno, name, pay, 3, workDay);
				//내가 푼것 empArr = {eno, name, pay , workDay};
				break;
				
			case 4:
//				* 4번 선택 시
//				 * empArr에 저장되어 있는 모든 사원의 정보출력
//				 * showEmployeeInfo() 메소드 사용
				
				//다른풀이
//				for(int i=0; i < empArr.length; i++) {
//					if(empArr[i] != null)
//					System.out.println(i+"번째 사원 정보를 출력합니다.");
//					empArr[i].showEmployeeInfo();
//				}
				

				for(int i=0; i < index; i++) { 			//index를 쓰면 저장된 데까지만 출력함.
					System.out.println(i+"번째 사원 정보를 출력합니다.");
					empArr[i].showEmployeeInfo();
				}
				break;
				
			case 5:
//				 * 5번 선택 시
//				 * 검색할 사원의 사번을 입력하세요.
//				 * 1
//				 * 입력한 사번에 해당하는 사원의 정보 출력(showEmployeeInfo() 메소드 사용)
				System.out.println("검색할 사원의 사번을 입력하세요");
				eno=sc.nextInt();
				
				//중복체크 할 필요가 없다. 유니크 값을 뽑기 때문에 
//				for(int i =0; i < empArr.length; i++) {	
//					for(int j = 0; j < i ; j++ ) {
//						if(i == j) {
//						empArr[eno].showEmployeeInfo();
//					} else {
//						System.out.println("해당사원이 없습니다. 사원번호를 다시 입력해주세요.");
//						continue;
//					}
//				}
//			}
				
				
				for(int i =0; i < index; i++) {	
					if(empArr[i].getEno() == eno) {			//private이라서 get메서드를 사용해서 가져와야한다. 	
						empArr[eno].showEmployeeInfo();
					}
			}
				
					break;
					
			case 6: 
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				System.exit(0);
				break;
			
			default: 	
				System.out.println("잘못입력하셨습니다");
				continue;
				
		}
		
	//중복되는 것 메서드로 만들어서 대입. 
		public static Employee generateEmployee(Scanner sc, int menuSelect) {
			
			System.out.println("사번을 입력하세요.");
			int eno = sc.nextInt();
			sc.nextLine();											
			System.out.println("이름을 입력하세요.");
			String name = sc.nextLine();
			System.out.println("급여를 입력하세요.");
			int pay = sc.nextInt();
			
			if(menuSelect == 1) {
				System.out.println("보너스를 입력하세요");
				int bonus = sc.nextInt();		
				
				return new RegularEmployee(eno, name, pay, menuSelect, bonus);
			} else if(menuSelect == 2) {
				System.out.println("근무년수를 입력하세요");
				int hireYear = sc.nextInt();		
				
				return new TempEmployee(eno, name, pay, menuSelect, hireYear);
			} else {
				System.out.println("근무일수를 입력하세요");
				int workDay = sc.nextInt();	
				
				return new ContractEmployee(eno, name, pay, menuSelect, workDay);
			}
			
			
			
			// case 1: case 2: case 3:
			//empArr[index++] =  generateEmployee(sc,menuSelect);
			//break; 
			//이런식으로 중복되는 코드 정리할 수 있다.
		
		
		
		
		/*
		 * *** 메뉴 선택 ***
		 * 1. 정규직 저장
		 * 2. 임시직 저장
		 * 3. 계약직 저장
		 * 4. 전체 사원 정보 출력
		 * 5. 월급 계산 출력
		 * 6. 프로그램 종료
		 * 
		 * 1번 선택 시
		 * 사번을 입력하세요.
		 * 1
		 * 이름을 입력하세요.
		 * 홍길동
		 * 급여를 입력하세요.
		 * 3000
		 * 보너스를 입력하세요.
		 * 300
		 * 입력한 내용을 empArr에 저장
		 * 
		 * 2번 선택 시
		 * 사번을 입력하세요.
		 * 2
		 * 이름을 입력하세요.
		 * 임꺽정
		 * 급여를 입력하세요.
		 * 3000
		 * 근무년수를 입력하세요.
		 * 7
		 * 입력한 내용을 empArr에 저장
		 * 
		 * 3번 선택 시
		 * 사번을 입력하세요.
		 * 2
		 * 이름을 입력하세요.
		 * 임꺽정
		 * 급여를 입력하세요.
		 * 20
		 * 근무일수를 입력하세요.
		 * 20
		 * 입력한 내용을 empArr에 저장
		 * 
		 * 4번 선택 시
		 * empArr에 저장되어 있는 모든 사원의 정보출력
		 * showEmployeeInfo() 메소드 사용
		 * 
		 * 5번 선택 시
		 * 검색할 사원의 사번을 입력하세요.
		 * 1
		 * 입력한 사번에 해당하는 사원의 정보 출력(showEmployeeInfo() 메소드 사용)
		 * 
		 * 6번 선택 시 
		 * 프로그램 종료
		 * 
		 * 다른 번호가 입력되면 
		 * 잘못 입력하셨습니다. 출력하고 다시 입력할 수 있도록 메뉴 표출
		 * */
	}

}
