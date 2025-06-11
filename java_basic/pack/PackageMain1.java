package pack;

public class PackageMain1 {

    public static void main(String[] args) {
        // 같은 패키지 : 경로 생략
        Data data = new Data(); // Data() 생성자 호출
        // 다른 패키지 : 경로 작성
        pack.a.User user = new pack.a.User(); // User() 생성자 호출
    }
}
