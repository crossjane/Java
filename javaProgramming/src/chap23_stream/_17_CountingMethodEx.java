package chap23_stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import chap23_stream.car.HyundaiCar;

public class _17_CountingMethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<HyundaiCar> 생성하고 
		//아반떼 , 3000
		//아반떼 , 3500
		//아반떼 , 2500
		//소나타 , 4000
		//그랜저 , 5000
		//제네시스 ,6000
		
		//스트림처리를 통해서 가격이 최대값인 객체하나와 
		//가격이 최소값이 객체 하나를 찾아서 출력하세요. carInfo()메소드 이용
		
		List<HyundaiCar> hyundaiCarList = new ArrayList<HyundaiCar>();
		
		hyundaiCarList.add(new HyundaiCar("아반떼" , 3000));
		hyundaiCarList.add(new HyundaiCar("아반떼" , 3500));
		hyundaiCarList.add(new HyundaiCar("아반떼" , 2500));
		hyundaiCarList.add(new HyundaiCar("소나타" , 4000));
		hyundaiCarList.add(new HyundaiCar("그랜저" , 5000));
		hyundaiCarList.add(new HyundaiCar("제니시스" , 6000));
		
		
		HyundaiCar maxCar = hyundaiCarList.stream()
										.max(Comparator.comparing(hyundaiCar -> hyundaiCar.getPrice()))
										.orElseThrow();
	
		maxCar.carInfo();				
											

		
//		Stream<HyundaiCar> hyundaiCarStream = hyundaiCarList.stream();
//		
//		hyundaiCarStream.max(Comparator.comparing(num-> num.gddjhjfdhj)
//						 
								
		
		 
//		.max(Comparator.comparing(num -> num))
		
		//1. mapToInt() : Stream<제네릭> 타입의 스트림을 기본타입 스트림인 IntStream 으로 변환 
		//변환 할 때는 람다식에서 리턴되는 결과 값으로 스트림을 구성한다.
//		IntStream intStream = intList.stream()
//									.mapToInt(num -> num * 2);
//		
		
		
		
		
		

//		int max1 = intList.stream()
//						.mapToInt(num -> num)
//						.max()
//						.getAsInt();
//		
//		
//		int min1 = intList.stream()
//				.mapToInt(num -> num)
//				.min()
//				.getAsInt();
//		
		

	}

}
