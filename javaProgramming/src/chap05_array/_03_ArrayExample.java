package chap05_array;

public class _03_ArrayExample {
	
	public static void main(String[] args) {
		
		//3. chArr의 요소 중 소문자는 대문자로, 대문자는 소문자로 변환하여 convertArr에 저장하세요. 
		char[] chArr = {'b', 'I', 't', 'C'};
		//{'B', 'i', 'T', 'c'}
		char[] convertArr = new char[4];
		
		
		//내가푼것
//		for(chArr[i] = 0; i<=4; i++) {
//		 if(chArr[i] >= 65 && chArr[i] <= 90) {
//		  convertArr[i] = i + 32;
//		 } else if(chArr[i] >= 97 && chArr[i] <= 122) {
//			 convertArr[i] = i - 32;
//		 }
			 
			 
		 
		 for(int i = 0; i < chArr.length; i++) {    				//chArr.legth<< 길이 쓰는것 주의.
			 if(chArr[i] >= 'A' && chArr[i] <= 'Z') {
			  convertArr[i] = (char)(chArr[i] + 32);
			 } else {
				 convertArr[i] = (char)(chArr[i] - 32);
			 }
			 
			 System.out.println(convertArr[i]);
			 
		 }
		
		 
		 //메서드 사용해서 간단하게 하기. 
		 for(int i = 0; i < chArr.length; i++) {    				//chArr.legth<< 길이 쓰는것 주의.
			 if(chArr[i] >= 'A' && chArr[i] <= 'Z') {
			  convertArr[i] = Character.toLowerCase(chArr[i]);
			 } else {
				 convertArr[i] = Character.toUpperCase(chArr[i]);
			 }
			 
			 System.out.println(convertArr[i]);
			 
		 }
		
		
	}

}
