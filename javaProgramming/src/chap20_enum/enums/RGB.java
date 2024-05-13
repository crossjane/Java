package chap20_enum.enums;

public enum RGB {
	
	// RED, GREEN , BLUE 상수 선언 
	// 값은 4개를 갖는다
	// 첫번째 값은 소문자 색상이름 
	// 두 번째 , 세번째, 네번째 값은 int  
	// 두번쨰 값은 빨간색 농도 (255가 최대값)
	// 세번째 값은 초록생 농도 (255가 최대값)
	// 네번째 값은 파란색 농도 (255가 최대값)
	// enum을 구현하세요. 

	//final 상수 이기 때문에 관례적으로 대문자로 씀. 
	
	RED("red",255,0,0),
	GREEN("green",0,255,0),
	BLUE("blue",0,0,255);
	

	private String colorName;
	private int redValue;
	private int greenValue;
	private int blueValue;
	

	RGB(String colorName, int redValue, int greenValue, int blueValue){
		this.colorName = colorName;
		this.redValue = redValue;
		this.greenValue = greenValue;
		this.blueValue = blueValue;
	}

	//가져다 쓰려면 무조건 getter 메서드 생성해야. 
	public String getColorName() {
		return colorName;
	}


	public int getRedValue() {
		return redValue;
	}


	public int getGreenValue() {
		return greenValue;
	}


	public int getBlueValue() {
		return blueValue;

	}
}

