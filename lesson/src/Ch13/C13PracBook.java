package Ch13;


public class C13PracBook {
    private String title;
    private String author;
    private int year;

    // 디폴트 생성자
    public C13PracBook() {
        this.title = "";
        this.author = "";
        this.year = 0;
    }

    // 매개변수 생성자
    public C13PracBook(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Getter 메서드
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    // toString 메서드
    @Override
    public String toString() {
        return "[Title] : " + title + " [Author] : " + author + " [Year] : " + year;
    }
}
