package _01_basic;

public class _07_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//7. 1 ~ 100까지 합을 do ~ while문으로 출력
		
		int i = 1;
		int sum = 0;
		
		do {sum += i; 
			i++;
			
		}while(i <= 100);
		
		System.out.println("1~100까지의 합: "+ sum);
	}

}
