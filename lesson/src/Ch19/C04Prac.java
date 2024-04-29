package Ch19;

// 아래 main을 만족하는 Moonbanggu 클래스와 이를 상속받는 Sharpen 클래스와 Pencil 클래스를 완성해주세요!!
// Moonbanggu 클래스에서는 샤프개수와 연필개수를 100개씩 가지고 있다.
// sharpen과 pencil의 객체를 생성할 때마다 샤프와 연필 개수를 1개씩 감소시켜 주세요 ㅠㅡㅜㅡㅜㅡㅜㅠㅠㅠ..
// 아래의 C04Prac의 Writing메서드를 만족하는 write()를 구현해야하는데, 이는 추상 메서드로써 Moonbanggu 클래스가 가지고 있다.





public class C04Prac {
	public static void Writing(Moonbanggu item) {
		item.write();
	}
	
	
	
	
	public static void main(String[] args) {
		Sharpen item1 = new Sharpen();
		Pencil item2 = new Pencil();
		Writing(item1);	//"샤프로 씁니다" 가 출력
		Writing(item2); //"연필로 씁니다" 가 출력 
		ShowInfo();		// 샤프 재고량 : 99 
						// 연필 재고량 : 99
	}

}
