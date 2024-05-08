package chap07_class;

import chap07_class.car.Car;

public class _01_Instance {

	public static void main(String[] args) {
		
		//1. 정의한 클래스는 항상 변수로 선언해서 사용한다.(static 클래스 제외)
		//그래서 클래스는 사용자가 직접 정의하는 자료형 이라고도 한다.
		
		Car car;			//무조건 Object를 상속받음(자바의 최상위클래스)
		
		int a = 0;
		
		
		//2. 정의한 클래스 타입의 값을 만들어주는 작업을 인스턴스화라고 한다. 
		//인스턴스화를 진행하게 되면 클래스내의 선언된 변수들과 메소드들이 메모리에 올라가고 
		//그 변수들과 메소드를 사용할 수 있는 클래스타입의 값이 객체로 하나만들어지게 된다.
		//인스턴스화 방식 : new 생성자(); 
		car = new Car(); //만든 변수(car)(heap 에저장됨. 참조형 변수기때문에)에 new Car(붕어빵틀)를사용할 수 
		//있는 객체를 리턴받게됨. 생성자(생성자메소드)생성되는 객체를 메모리에 저장하고 , 객체의변수들을 초기화가됨. 
		//클래스명()  <<생성자
		
		
		//println 메소드에 매개변수로 객체를 전달하게 되면 toString 메소드가 실행된다.
		System.out.println(car); 		//자바의 toString 메소드가 동작 
		
		
		//3. 생성된 객체(슈크림붕어빵)(car)의 변수에 값 저장
		car.company = "현대";
		car.model = "제네시스";
		car.color = "검정";
		car.price = 5000;
		
		System.out.println(car.company);
		System.out.println(car.model);
		System.out.println(car.color);
		System.out.println(car.price);
		
		//4. 생성된 객체(car)의 메소드 사용. 
		
		car.turnOn();
		car.speedUp();
		car.speedDown();
		car.turnOff();
		car.printCarInfo();
		
		
		//인스턴스(객체)를 생성해서 새로운 메모리 공간에 할당받기 때문에 
		//car 와 car2는 서로 영향을 주지 않는다.
		Car car2 = new Car();
		
		System.out.println(car);			//주소값
		System.out.println(car == car2);
		System.out.println(car2.company);
		
		
		
		
		Car car3 = generateCar(car);
		car3.printCarInfo();
	
	}
	//클래스는 타입의 역할도 하기 때문에 메소드의 리턴타입이나 매개변수로도 사용할 수 있다.
	public static Car generateCar(Car car) {
		Car returnCar = new Car(); 					//Car(); 생성자 메소드. 여기선 클래스이름
		returnCar.company = car.company; 
		returnCar.color = car.color;
		returnCar.model = car.model;
		returnCar.price = car.price;
		
		return returnCar;
		
	}
	
	
}
