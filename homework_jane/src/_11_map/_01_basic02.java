package _11_map;

import java.util.HashMap;
import java.util.Map;

public class _01_basic02 {
	
	//	2. 이름과 전화번호를 쌍으로 하는 주소록을 HashMap으로 구현하고, 특정 이름의 전화번호를
	//	조회하는 기능을 구현하세요.
	
	Map<String, String> adrr = new HashMap<String,String>();
	//private Map<String, String> contacts; // 이름과 전화번호를 저장하는 HashMap 

    
    // 주소록에 이름과 전화번호 추가하는 메서드
    public void addContact(String name, String phoneNumber) {
        adrr.put(name, phoneNumber); // 이름과 전화번호를 Map에 추가
    }

    // 특정 이름의 전화번호 조회하는 메서드
    public String getPhoneNumber(String name) {
        return adrr.get(name); // 이름을 키로 사용하여 전화번호 조회
    }


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 adrr addressBook = new AddressBook(); // 주소록 객체 생성

	        // 주소록에 이름과 전화번호 추가
	        addressBook.addContact("John", "123-456-7890");
	        addressBook.addContact("Jane", "987-654-3210");
	        addressBook.addContact("Alice", "555-123-4567");

	        // 이름으로 전화번호 조회
	        String johnPhoneNumber = addressBook.getPhoneNumber("John");
	        String alicePhoneNumber = addressBook.getPhoneNumber("Alice");

	        // 조회 결과 출력
	        System.out.println("John's phone number: " + johnPhoneNumber);
	        System.out.println("Alice's phone number: " + alicePhoneNumber);
	    }
		
//
//		Map<String, String> adrr = new HashMap<String,String>();
//		
//		Set<Entry<String,String>> entrySet = adrr.entrySet();
//		
//		Iterator<Entry<String, String>> iterator = entrySet.iterator();
//		
//		
//		Scanner sc = new Scanner(System.in);
//		String userInput = sc.nextLine();
//		
//		if(iterator.hasNext()) {
//			
//			
//			
//			Entry<String, String> entry = iterator.next();
//			boolean equals(Object obj) : 동일한 Entry인지 비교
//			if(entry.getValue() == userInput ) {
//				System.out.print(entry.getKey() + ", ");
//			
			

			
		
		
}
		

	


