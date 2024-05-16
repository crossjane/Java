package _13_thread.thread;

public class syncThread02 extends Thread {
	
	
	
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
		num.numPrint2(20);

	}
}
