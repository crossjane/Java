package _15_lambda;

public class IntArrUtils {
	
	//3. 매개변수로 받아온 정수 배열에서 최대값, 최소값, 중간값을 구하는 static 메소드
	//getMax, getMin, getMid를
	//갖는 클래스 IntArrUtils를 구현하고 maxOrMinOrMid라는
	//메소드를 갖는 함수형 인터페이스 MaxMinMid를 만들고 람다식으로 IntArrUtils의 메소드를
	//참조하여 구현하세요.
	
	
	public static void main(String[] args) {
		
		        int[] arr = {3, 5, 1, 4, 2};

		        MaxMinMid maxFunc = IntArrUtils::getMax;
		        MaxMinMid minFunc = IntArrUtils::getMin;
		        MaxMinMid midFunc = IntArrUtils::getMid;

		        System.out.println("최대값: " + maxFunc.maxOrMinOrMid(arr));
		        System.out.println("최소값: " + minFunc.maxOrMinOrMid(arr));
		        System.out.println("중간값: " + midFunc.maxOrMinOrMid(arr));
		    }
		
	
		

//		    }
	}
	
	public static int getMax(int[] numArr) {
		return Arrays.stream(numArr).max().orElse;
//		 public static int getMax(int[] arr) {
//		  return Arrays.stream(arr).max().orElseThrow(IllegalArgumentException::new);
	}

	public static int getMin() {
		
	}
	
	public static int getMid() {
		
	}
	
	
	
	

	
		
		
		
		
		
		

	}


