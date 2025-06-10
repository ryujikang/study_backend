package construct.ex;

/*
문제 - Book과 생성자
BookMain 코드가 작동하도록 Book 클래스를 완성하세요.

특히 Book 클래스의 생성자 코드에 중복이 없도록 주의하세요.

실행 결과
제목: , 저자: , 페이지: 0
제목: Hello Java, 저자: Seo, 페이지: 0
제목: JPA 프로그래밍, 저자: kim, 페이지: 700
*/

public class Book {
    // TODO 멤버변수 : 제목(title), 저자(author), 페이지 수(page)
    String title;
    String author;
    int page;

    // TODO 코드를 완성하세요.
    public Book() {
        this("", "", 0);
        System.out.println("1. 기본 생성자 호출");
    }

    public Book(String title, String author) {
        this(title, author, 0);
        System.out.println("2. 생성자 호출");
    }
    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
        System.out.println("3. 생성자 호출");
    }

    void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }
}
