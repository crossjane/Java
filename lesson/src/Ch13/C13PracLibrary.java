package Ch13;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C13PracLibrary {
    private List<C13PracBook> books;

    // 디폴트 생성자
    public C13PracLibrary() {
        this.books = new ArrayList<>();
    }

    // 도서 추가 메서드
    public void addBook(C13PracBook book) {
        books.add(book);
    }

    // 도서 목록 출력 메서드
    public void displayBooks() {
        System.out.println("도서 목록:");
        for (C13PracBook book : books) {
            System.out.println(book);
        }
    }

    // 도서 검색 메서드
    public void searchBook(String title) {
        System.out.println("도서 검색 중: " + title);
        
        for (C13PracBook book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("도서를 찾았습니다:\n" + book);
                return;
            }
        }
        System.out.println("'" + title + "' 제목의 도서를 찾을 수 없습니다.");
    }

    // 도서 삭제 메서드
    public void removeBook(String title) {
        Iterator<C13PracBook> iterator = books.iterator();
        while (iterator.hasNext()) {
            C13PracBook book = iterator.next();
            if (book.getTitle().equalsIgnoreCase(title)) {
                iterator.remove();
                System.out.println("'" + title + "' 제목의 도서를 삭제하였습니다.");
                return;
            }
        }
        System.out.println("'" + title + "' 제목의 도서를 찾을 수 없습니다. 삭제 작업을 수행하지 않습니다.");
        
        
    }

	public static void main(String[] args) {
    	
    	
        // 도서 객체 생성
        C13PracBook book1 = new C13PracBook("위대한 개츠비", "F. Scott Fitzgerald", 1925);
        C13PracBook book2 = new C13PracBook("죽은 캥거루를 위한 모큰버드", "Harper Lee", 1960);
        C13PracBook book3 = new C13PracBook("1984", "George Orwell", 1949);

        // 라이브러리 객체 생성
        C13PracLibrary library = new C13PracLibrary();

        // 도서 추가
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        System.out.println();

        // 도서 목록 출력
        library.displayBooks();
        System.out.println();
        
        // 도서 검색
        library.searchBook("죽은 캥거루를 위한 모큰버드");
        System.out.println();

        // 도서 삭제
        library.removeBook("죽은 캥거루를 위한 모큰버드");
        System.out.println();

        // 도서 목록 다시 출력
        library.displayBooks();
        System.out.println();
    }
}