package chap06_method.calc;

public class _01_AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//같은 패키지 안에 선언된 클래스는 import 구문이 필요없다.
		AccessModifierCalculator ac = new AccessModifierCalculator();
		
		//같은 패키지 안의 클래스에서는 public, protected, default 접근제어자로
		//선언된 메소드를 사용할 수 있다.
		ac.add();
		ac.sub();
		ac.mul();
		//ac.div();  //사용불가 private 메소드 

	}

}
