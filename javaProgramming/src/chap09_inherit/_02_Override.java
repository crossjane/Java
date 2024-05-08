package chap09_inherit;

import chap09_inherit.animal.Animal;
import chap09_inherit.animal.Bird;
import chap09_inherit.animal.Tiger;

public class _02_Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Bird();     //부모 클래스(Animal)를 가져와 animal 변수를 설정하고 자식 객체(bird)의 값을 넣음. 
		
		// Bird 클래스의 eat, sleep이 실행.
		animal.eat();
		animal.sleep();
		
		// Tiger클래스의 eat, sleep이 실행
		animal = new Tiger();
		
		animal.eat();
		animal.sleep();	

	}

}
