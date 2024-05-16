package _13_thread.thread;

public class syncThread01 extends Thread {
	
	
	
	private NumberPrinter num;
	
	public void setNum(NumberPrinter num) {
		this.num = num;
	}
	
	public NumberPrinter getNum() {
		return this.num;
	}
	
	@Override
	public void run() {
		// 동기화 메소드 호출
		num.numPrint1(10);

	}
}
