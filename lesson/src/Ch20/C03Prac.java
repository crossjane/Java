package Ch20;

// Moonbanggu 클래스 == 추상 클래스
// write() 메서드를 추상 메서드


public class C03Prac {
	public static void main(String[] args) {
		Sharpen item1 = new Sharpen();		// 문방구가 가지는 SharpenCnt 속성값이 1줄어야함.
		Pencil item2 = new Pencil();		// 문방구가 가지는 PencilCnt 속성값이 1줄어야힘.
		
		Writing(item1);			//"샤프로 씁니다" 가 출력
		Writing(item2);			//"연필로 씁니다" 가 출력 
		ShowInfo();				// 샤프재고량 : 99, 연필재고량 :99
		
	}

}
