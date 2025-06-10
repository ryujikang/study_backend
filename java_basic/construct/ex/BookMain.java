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

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book(); // 기본 생성자 호출
        // 호출 순서: Book() -> Book(title, author, page)
        book1.displayInfo();

        Book book2 = new Book("Hello Java", "Seo"); // title, author만 매개변수로 받는 생성자 호출
        // 호출 순서: Book(title, author) -> Book(title, author, page)
        book2.displayInfo();

        Book book3 = new Book("JPA 프로그래밍", "kim", 700); // title, author, page를 매개변수로 받는 생성자
        // 호출 순서: Book(title, author, page)
        book3.displayInfo();
    }
}
