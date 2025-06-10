package construct;

public class MemberInit {
    String name;
    int age;
    int grade;
    
    // 추가
    void initMember(String name, int age, int grade) {
        // this 사용
        // "initMember 메서드의 매개변수"가 "MemberInit 클래스의 멤버변수"보다 우선순위가 높음
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
