package chap21_multithread;

import chap21_multithread.threads.SafeExitThread;

public class _10_SafeExitBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SafeExitThread st = new SafeExitThread();
		
		st.start();
		
		try {
			//메인스레드를 일시정지시킴. 8초 이후에. 
			
			Thread.sleep(8000);
		}	catch (InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
		//SafeExitThread의 run 메소드의 내용을 종료시킨다.
		st.setStop(true);
	}

}
