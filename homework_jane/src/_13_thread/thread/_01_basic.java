package _13_thread.thread;

public class _01_basic extends Thread {
	

	
	@Override
	public void run(){
		
	 
		for(int i = 0; i < 20; i++) {
			if( 30%i == 0) {
				System.out.println(i);
			}
		}
		
		try {
			
		} catch(InterruptedException ie) {
			System.out.println(ie.getMessage());
			
		}
		
	};
	
	
	
	

}
