package chap21_multithread;

import chap21_multithread.threads.DaemonThread;

public class _12_DaemonThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonThread dt = new DaemonThread();
		
		//1. setDaemon(boolean) 메소드를 통해 
		// 해당 스레드를 보조 스레드로 지정
		
		//setDaemon이 없으면 실행에서 끝나지 않고 계속 지속된다.
		dt.setDaemon(true);
		
		//30초 동안 메인 스레드가 잠재워져있다가 
		dt.start();
		
		try {
			// 30초 후에 실행!되고 >> try구문 밖으로 나감
			Thread.sleep(30000);
		} catch(InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
		
		
		// 주 스레드인 메인스레드가 종료되면 보조 스레드인 dt도 종료된다.
		System.out.println("메인스레드 종료");
	}

}
