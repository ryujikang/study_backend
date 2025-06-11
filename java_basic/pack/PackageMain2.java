package pack;
import pack.a.User; // 다른 패키지 경로 작성 (import 사용)
// import pack.a.*;
// *(asterisk) 사용 시 특정 패키지에 포함된 모든 클래스를 포함 가능

public class PackageMain2 {

    public static void main(String[] args) {
        // 같은 패키지 : 경로 생략
        Data data = new Data(); // Data() 생성자 호출
        // 다른 패키지 : 경로 생략 가능 (import)
        User user = new User(); // User() 생성자 호출
    }
}
