package Ch19;

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}

class ColorTV extends TV {
	int color;

	ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}

	void printProperty() {
		System.out.printf("%d인치 %d컬러", getSize(), color);
	}
}

public class C01Prac {
	
	public static void main(String[] args) {
		//[1번] 다음 main() 메소드와 실행 결과를 참고하여 TV를 상속받은 ColorTV 클래스를 작성하라.
		//속성은 총 int size, int color 
		// ==> size : TV클래스의 속성, color : ColorTV클래스의 속성
		//출력 결과
		//32인치 1024컬러

//		ColorTV myTV = new ColorTV(32, 1024);		// size, color
//		myTV.printProperty(); // //32인치 1024컬러
//		myTV.setSize(120);		// 부모 메서드(Setter)
//		myTV.getSize();			// 부모 메서드(Getter)
	}

}
