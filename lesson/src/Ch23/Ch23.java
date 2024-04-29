package Ch23;

//### 예외 처리 ###
//1. 예외 처리 : 프로그램 실행 중에 예외가 발생할 수 있는 상황에 대비하여 적절한 조치를 취하는 것을 의미
//2. 예외 : 프로그램의 정상적인 흐름을 방해하거나 중단시킬 수 있는 상황을 나타냄.


//try-catch문은 예외 처리를 위한 JAVA의 기본적인 구문임.
//JAVA 프로그램에서 예외가 발생할 수 있는 코드 블록을 try 블록내에 배치하고,
//예외가 발생할 경우에 대한 처리를 catch 블록에서 수행함.

//try 블록			: 예외가 발생할 수 있는 코드를 포함하는 블록임.
//catch 블록			: try 블록에서 발생한 예외를 처리하는 블록임.
//					: 여러 개의 catch 블록을 사용하여 다양한 종류의 예외를 처리할 수 있음.

//finally 블록		: try 블록이나 catch 블록에서 리턴되더라도
//					: 항상 실행되어야 하는 블록임.


//### try - catch 구조 ###

//try {
//	 // 예외가 발생할 수 있는 코드 블록
//} catch ( ExceptionTyep1 e1) {
//	 // ExceptionType1 예외를 처리하는 블록
//} catch ( ExceptionType2 e2) {
//	 // ExceptionType2 예외를 처리하는 블록
//} finally {
//	 // 항상 실행되어야 하는 블록(선택적)
//}



//## 예외 종류 ##

//1. 컴파일 타임 예외 (Checked Exception)		: 발생 시점 -- 컴파일 시에 발생하는 예외로, 프로그램이 컴파일될 때 확인됨.
//										: 처리 여부 -- 반드시 예외를 처리해야 함. 예외를 처리하지 않으면 컴파일이 되지 않음.
//
//IOException				: 입출력 작업 도중 발생하는 예외.

//SQLException				: 데이터베이스와 관련된 예외.

//ClassNotFoundException	: 클래스를 찾을 수 없는 경우 발생하는 예외.

//InterruptedException		: 스레드가 중단될 때 발생하는 예외 등.



//2. 런타임 예외 (Unchecked Exception)		: 발생 시점 -- 런타임 시에 발생하는 예외로, 프로그램 실행 중에 확인됨.
//										: 처리 여부 -- 명시적인 예외 처리가 필요하지 않음. 개발자가 필요하다고 판단하면 예외를 처리할 수 있지만, 강제적으로 처리할 필요는 없음.
//
//NullPointerException					: null 객체에 접근할 때 발생하는 예외.

//ArrayIndexOutOfBoundsException		: 배열의 범위를 벗어난 인덱스에 접근할 때 발생하는 예외.

//ArithmeticException					: 산술 연산 중 발생하는 예외.

//IllegalArgumentException				: 잘못된 인수가 전달될 때 발생하는 예외.

//IllegalStateException					: 객체의 상태가 메소드 호출에 부적절한 경우 발생하는 예외 등.


//## 주의해야 할 점 ##
//런타임 예외(Unchecked Exception)은 컴파일러가 강제적으로 예외 처리를 확인 X, 따라서 개발자가 명시적으로 처리하지 않아도 됨.
//But, 예외 발생 시 프로그램이 비정상적으로 종료될 수 있음, 따라서 적절한 예외 처리를 하는 것이 좋음.




//### try-with-Resource ###

//Java 7부터는 Try-with-Resources 문을 사용하여 자동으로 리소스를 해제할 수 있는 기능이 추가됨.
//Try-with-Resources를 사용하면 close() 메소드를 명시적으로 호출하지 않아도 됨.
//AutoCloseable 인터페이스를 구현하는 객체에 대한 자동 리소스 관리를 위해 만들어짐.
//보통 파일, 네트워크 연결, 데이터베이스 연결 등과 같은 자원을 사용하는 클래스들이 AutoCloseable을 구현

//==> Try-with-Resources를 사용하면 명시적으로 close() 메소드를 호출하지 않아도 자원을 자동으로 해제할 수 있음.


//### 문법 구조 ###
//try (리소스 선언) {
//  // 리소스를 사용하는 코드
//} catch (예외 타입 e) {
//  // 예외 처리 코드
//}
//리소스 선언" 부분에는 AutoCloseable을 구현한 객체를 선언
//이 객체는 try 블록이 끝날 때 자동으로 close() 메소드가 호출됨.



//## Example ##
//try (BufferedReader br = new BufferedReader(new FileReader("파일경로"))) {
//  String line;
//  while ((line = br.readLine()) != null) {
//      System.out.println(line);
//  }
//} catch (IOException e) {
//  // IOException 처리 코드
//}
//BufferedReader는 AutoCloseable을 구현하고 있기 때문에 try-with-resources 문을 사용하여 선언했음.
//try 블록을 벗어나면 BufferedReader의 close() 메소드가 자동으로 호출되어 파일 자원이 안전하게 해제됨.



public class Ch23 {

}
