package _14_02.Class;


//2. 도서의 제목, 저자, 출판사, 가격을 속성으로 가지고 정보를 저장하는 메소드와 정보를 출력하는 메소드를 갖는 도서 클래스를 생성하세요.
public class Book {

	String title;
	String author; 
	String publish;
	int price;
	
	public void setBookInfo(String title ,String author, String publish, int price) {
		this.title = title;
		this.author =author;
		this.publish = publish; 
		this.price = price;
		
	}
	
	public void showBookInfo(String title ,String author, String publish, int price) {
		 System.out.println("제목 :" + title );
		 System.out.println("저자 :" + author );
		 System.out.println("출판사 :" + publish );
		 System.out.println("가격 :" + price );
		
		
	}
	
	
}
