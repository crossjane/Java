package chap19_generic;

import java.util.HashMap;
import java.util.Map;

import chap19_generic.box.Box;

public class _01_GenericClassRamyun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Box 객체를 생성할 때 타입매개변수 타입을 지정한다. 
		
		//Box클래스 에 있던 T 가 String타입 으로 바꿔서 들어옴. 
		
		//지정한 타입매개변수의 타입에 따라서 객체의 형태가 바뀌게 된다.
		
		Box<String> strBox = new Box<>("Java", "17");
		Box<Integer> intBox = new Box<>(1000, 2000);
		Box<Map<String, String>> mapBox = 
				new Box<>(new HashMap<String, String>(),new HashMap<String, String>());
	
		strBox.add();
		intBox.add();
		mapBox.add();
		

	}

}
