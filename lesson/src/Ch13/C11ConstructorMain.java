package Ch13;



class C11Simple {
	//속성
	int x;
	int y;
	//디폴트 생성자
	public C11Simple() {
		System.out.println("디폴트 생성자 호출!!");
		this.x=100;
		this.y=100;
	}
	
}


public class C11ConstructorMain {

	public static void main(String[] args) {
		
		C11Simple obj = new C11Simple(); //C11Simple() == 생성자 함수
		System.out.printf("x = %d y = %d\n", obj.x, obj.y); 
		
		

	}

}

