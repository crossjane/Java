package Ch13;

class Computer {
	String SerialNo;
	String CPUSpec;
	String RAMSpec;
	String DISKSpec;
	void PowerON() {
		System.out.println(SerialNo + "의 전원을 켭니다.");
	}
	void PowerOFF() {
		System.out.println(SerialNo + "의 전원을 끕니다.");
	}
	void ShowInfo() {
		System.out.printf("시리얼 번호 : %s\n", SerialNo);
		System.out.printf("CPUSpec : %s\n", CPUSpec);
		System.out.printf("RAMSpec : %s\n", RAMSpec);
		System.out.printf("DISKSpec : %s\n", DISKSpec);
	
	}
}

//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	//문제
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

	//1. Computer 클래스를 완성하세요
	//2. SerialNo, CPUSpec, RAMSpec, DISKSpec 네가지 속성을 정의해주세요!
	//3. powerON() 메서드를 통해 전원을 킨다는 정보를 출력하는 메서드를 만들어주세요
	//4. ShowInfo() 메서드를 통해 컴퓨터 정보를 출력하는 메서드를 만들어주세요
	//5. powerOFF() 메서드를 통해 전원을 끈다는 정보를 출력하는 메서드를 만들어주세요


public class C06ComputerMain {

	public static void main(String[] args) {

		Computer LGGram1010 = new Computer();
		LGGram1010.SerialNo = "1010";
		LGGram1010.CPUSpec = "I7";
		LGGram1010.RAMSpec = "16G";
		LGGram1010.DISKSpec = "2TB";
		LGGram1010.PowerON();
		System.out.println();
		
		LGGram1010.ShowInfo();
		System.out.println();
		
		LGGram1010.PowerOFF();

	}

}
