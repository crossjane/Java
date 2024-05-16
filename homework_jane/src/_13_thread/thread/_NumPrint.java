package _13_thread.thread;

public class _NumPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		NumberPrinter num = new NumberPrinter();
		
		syncThread01 st01 = new syncThread01();
		syncThread02 st02 = new syncThread02();
				
		
		st01.setNum(num);
		st02.setNum(num);
		
		st01.start();
		st02.start();
		
		
		
		
	}

}

