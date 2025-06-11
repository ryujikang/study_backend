package pack.a; // pack 하위에 있는 a 패키지

public class User {
    
    // 생성자 -> 접근제어자 public 사용 (다른 패키지에서 접근 가능)
    public User() {
        System.out.println("패키지 pack.a 회원 생성");
    }
}
