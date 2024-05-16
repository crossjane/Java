package _13_thread.thread;

public class NumberPrinter  {

	
	//1. 메인스레드는 1~20까지 3과 4의 공배수를 출력하는 작업을 하고
	//1~20까지의 숫자중 30의 약수를 출력하는 서브 스레드를 하나 갖는다. 각각의 스레드를 실행하십시오.

	//2. 1번 문제에서 join()메소드를 이용해서 서브 스레드가 먼저 실행돼서 끝난 후에 메인 스레드가 실행되도록 구현하세요.

	//	3. 공유객체로 사용될 클래스 NumberPrinter를 만들고 멤버변수로 int num을 가지고 정수형 매개변수를 받아 매개변수로 받아온 값은 num에 저장하고 
	//num~50까지중 3의 배수를 출력하는 메소드 numPrint1(int num)과 num~100까지 숫자 중 5와 7의 공배수를 출력하는 메소드 numPrint2(int num)를 구현하세요.
	//그리고 공유객체를 사용하며 numPrint1을 호출하는 스레드 클래스 1개와 numPrint2를 호출하는 스레드 클래스 1개를 구현하고 메인스레드에서 두 개의 스레드를 실행하세요.
//
//	4. 3번 문제에서 첫 스레드의 공유객체 점유가 끝날때까지 두 번째 스레드를 실행하지 못하도록 잠금 상태로 만드세요.
//
//	5. 3, 4번 문제에서 wait와 notify를 이용하여 스레드 두개가 각각 한 번씩 출력하도록 수정하세요.
	
		private int num;
		
		//원래 세터는 값을 받아서 우리가 가진 값을 변경하는거고, 게터는 값을 돌려주는
		public int getNum() {
			return num;
		}


		//SETTER
		public void setNum(int num) {
			this.num = num;
		}
			
	
		//잠금상태로 만들기
		public synchronized void numPrint1(int num) {
				this.setNum(num);
			
				for(int i = this.num; i <= 50; i++) {
					if(i>0) {
					if(i % 3 == 0) {
						
					
						System.out.println("1-" + i);
						//다른 스레드를 실행 대기 상태로 만듦
					   notify();
						
						try {
							syncThread02 syncThread02 = new syncThread02();
							syncThread02.join();
						
						//자신의 스레드를 대기 상태로 만듦.
						wait();
						} catch(InterruptedException ie) {
							System.out.println(ie.getMessage());
						}
					}
				}
				}
				
			}
		//강사님이 써주신건 세트로 한 스레드에서 동작할 경우에 그렇게 돌아감
		public synchronized void numPrint2(int num) {
					this.setNum(num);
			
			
				//값이 35, 70이 나오고 더이상 반대쪽의 스레드를 꺠우지못해서
					//1까지 실행되고 2는 못일어남
				for(int i = this.num; i <= 100; i++) {
					if(i>0) {
					if(i % 5 == 0 && i % 7 ==0) {
						
						System.out.println("2-" + i);
						notify();
						
						try {
							
							wait();
						}catch(InterruptedException ie) {
							System.out.println(ie.getMessage());
						}
					}
					}
				}
				}
				
			}

	
	