package chap10_polymorphism.tv;

public class LgTv extends Tv {
	@Override 
	public void powerOn() {
		System.out.println("QLED");
		//super 키워드로 생성자를 호출할때는 항상 최상단에서 사용해야 하지만
		//인스턴스 메소드를 사용할 때 위치는 중요하지 않다.
		super.powerOn();
	}
	
	@Override 
	public void powerOff() {
		System.out.println("QLED");
		super.powerOff();
	}
	
	@Override   	//상속받을때는 public으로 받을 수 있다 부모클래스는 default여도 . 
					//범위가 넓은 걸로만 확장됨. protected도 가능.
	public void operate(int channel) {
		System.out.println("QLED");
		super.operate(channel);
	}
	
	public void testTv() {
		//부모클래스에 public으로 선언된 메소드
		super.powerOn();
		
		//부모클래스에 protected로 선언된 메소드 
		super.powerOff();
		
		//부모클래스에 default로 선언된 메소드 
		super.operate(11);
		
		//부모클래스에 private로 선언된 메소드
		//오류. 불가능
		//super.channelUp();
		
	}
	
}
