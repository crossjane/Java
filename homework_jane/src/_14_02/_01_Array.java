package _14_02;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Array {
	
//	--------------------배열--------------------
//	1. 1부터 10까지의 정수를 배열에 저장하고 배열의 모든 요소를 출력하세요.
//
//	2. 사용자가 q를 입력하기 전까지 정수를 입력받아 배열에 저장하고 배열의 모든 요소를 출력하세요.
//
//	3. 사용자가 입력한 10개의 정수를 배열에 저장하고 평균을 계산하여 출력하세요.
//
//	4. 1부터 100까지의 숫자 중에서 짝수만 배열에 저장하고 배열의 합을 계산하여 출력하세요.
//
//	5. 사용자가 입력한 10개의 정수를 배열에 저장하고 최소값과 최대값을 찾아서 출력하세요.
//
//	6. 사용자가 입력한 5개의 문자열을 배열에 저장하고 길이가 가장 긴 문자열과 길이가 가장 작은 문자열을 출력하세요.
//
//	7. 두 개의 정수형 배열을 만들고 1 ~ 100까지의 랜덤한 값으로 첫 번째 배열은 4개 두 번째 배열은 3개를 저장하고 두 배열을 합친 새로운 배열을 생성하세요.
//
//	8. 사용자가 문자열을 입력하는데 문자열 사이사이에 -을 넣어 구분자로 만들어준다. -기준으로 잘라진 문자열 배열을 생성하고 잘라진 문자열 중에
//	    가장 길이가 긴 문자열의 인덱스와 그 문자열을 출력하세요.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 1부터 10까지의 정수를 배열에 저장하고 배열의 모든 요소를 출력하세요.
		
//		
//		int[] numArr = new int[10];
//		
//		for(int i = 0; i < 10; i++) {
//			numArr[i] = i+1;
//		}
//		//Arrays.toString() 메서드 
//		System.out.println(Arrays.toString(numArr));
		
//		2. 사용자가 q를 입력하기 전까지 정수를 입력받아 배열에 저장하고 배열의 모든 요소를 출력하세요.
		
//		String[] numArr1 = new String[1000];
//		
		Scanner sc = new Scanner(System.in);
//		String inputValue = sc.nextLine();
//		
//		for(int i = 0; i <  ; i++ ) {
//			if(inputValue.equals("q")) {
//				break;
//			}else{
//				numArr1[i] = inputValue;
//			}
//			
//			System.out.println(Arrays.toString(numArr1));
//		
//			
//		}
//		3. 사용자가 입력한 10개의 정수를 배열에 저장하고 평균을 계산하여 출력하세요.
		
//		int[] numArr2 = new int[10];
//
//		
//		for(int i = 0; i < 10; i++) {
//			System.out.println("정수를 입력하세요.");
//			numArr2[i] = sc.nextInt();			
//		}
//		
//		int sum = 0; 
//		double avg = 0;
//		
//		for(int a : numArr2) {
//			sum += a;
//			avg = sum / 10;			
//		}
//		
//		System.out.println(avg);
		
//		4. 1부터 100까지의 숫자 중에서 짝수만 배열에 저장하고 배열의 합을 계산하여 출력하세요.
//		
//		int[] numArr3 = new int[50];
//		
//		int index = 0;
//		
//		for(int i = 1 ; i <= 100; i++) {
//		 if(i%2 == 0) {
//			 numArr3[index++] = i;
//		 }
//		}
//		 
//		 int sum = 0;
//		 
//			for(int a : numArr3) {
//				sum += a;
//			}
//			
//			System.out.println(Arrays.toString(numArr3));
//		
		
//		5. 사용자가 입력한 10개의 정수를 배열에 저장하고 최소값과 최대값을 찾아서 출력하세요.
		
		
//		int[] intArr3 = new int[10];
//		
//		for(int i = 0; i < 10; i++) {
//			System.out.println("정수를 입력하세요.");
//			intArr3[i] = sc.nextInt();
//		}
//		
//		int max = 0 ; 
//		int min = 1; 
//		
//		
//		for(int a : intArr3) {
//			if( a > max) {
//				max = a; 	
//			} else if( a < min ) {
//				min = a;
//			}
//		}
//		
//		System.out.println(max + "는 최대값" + min+"은 최소값");
//		
//		6. 사용자가 입력한 5개의 문자열을 배열에 저장하고 길이가 가장 긴 문자열과 길이가 가장 작은 문자열을 출력하세요.
		
//		String[] strArr = new String[5];
//		
//		
//
//		for(int i = 0; i < 5; i++) {
//			System.out.println("문자열을 입력하세요.");
//			strArr[i] = sc.nextLine();
//			
//		}
//		
//		//변수초기화는 문자열 입력받은 다음에 해야함. 안그럼null값을 가리킴.
//		String max = strArr[0];
//		String min = strArr[0];  
//
//		
//		for(String str : strArr) {
//			 if (str.length() > max.length()) {
//	                max = str;
//	            }
//	            if (str.length() < min.length()) {
//	                min = str;
//	            }
//	        }
//		
//		System.out.println("가장 짧은 문자열 : " + min + "   가장 긴 문자열 : "+ max);
		
//		7. 두 개의 정수형 배열을 만들고 1 ~ 100까지의 랜덤한 값으로 첫 번째 배열은 4개 두 번째 배열은 3개를 저장하고 두 배열을 합친 새로운 배열을 생성하세요.
//		
//		int[] intArr1 = new int[4];
//		int[] intArr2 = new int[3];
//		
//		
//		for(int i = 0; i < 4; i++) {
//			intArr1[i] = (int)(Math.random()*100)+1;
//		}
//		
//		
//		for(int i = 0; i < 3; i++) {
//			intArr2[i] = (int)(Math.random()*100)+1;
//		}
//		
//		//Arrays.copyOf(원본배열, 복사할길이) 깊은복사 해서 붙이기.
//		//두 배열을 합친 새로운 배열 생성( 크기 : 7)
//		int[] intArr3 = Arrays.copyOf(intArr1, intArr1.length + intArr2.length);
//		//두번째 배열의 요소를 합친 배열에 복사 
//		System.arraycopy(원본배열, 원본 배열의 복사 시작 지점, 복사를 받을 배열, 대상 배열에서 복사를 시작할 인덱스.(여기서는 intArr1부터시작) , 복사할 요소의 개수)
//		System.arraycopy(intArr2, 0, intArr3, intArr1.length, intArr2.length);
//		
//		System.out.println(" 배열1 : " + Arrays.toString(intArr1));
//		System.out.println(" 배열2 : " + Arrays.toString(intArr2));
//		System.out.println("합친 배열 : " + Arrays.toString(intArr3));
		
//		8. 사용자가 문자열을 입력하는데 문자열 사이사이에 -을 넣어 구분자로 만들어준다. -기준으로 잘라진 문자열 배열을 생성하고 잘라진 문자열 중에
//	    가장 길이가 긴 문자열의 인덱스와 그 문자열을 출력하세요.
		
		System.out.println("문자열을입력해주세요.");
		String inputStr = sc.nextLine();

		
		// 입력받은 문자열을 '-' 기준으로 분리하여 배열 생성
        String[] splitStrings = inputStr.split("-");
 
        int maxLengthIndex = 0;
        String maxLengthString = splitStrings[0];

        for(int i = 0; i < splitStrings.length; i++) {
        	
        	if(splitStrings[i].length() > maxLengthString.length()) {
        		maxLengthString = splitStrings[i];
        		maxLengthIndex = i;
        	}
        	
        }
        System.out.println("가장 길이가 긴 문자열의 인덱스 : " + maxLengthIndex);
        System.out.println("가장 길이가 긴 문자열 : " + maxLengthString);


	}

}
