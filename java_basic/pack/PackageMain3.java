package pack;

import pack.a.User; // 같은 이름의 클래스가 있다? => 하나만 선택 가능, 나머지는 전체 경로를 포함시켜 작성

public class PackageMain3 {

    public static void main(String[] args) {
        // 다른 패키지, 같은 클래스
        User user = new User(); // pack.a 패키지
        pack.b.User userB = new pack.b.User(); // pack.b 패키지
    }
}
