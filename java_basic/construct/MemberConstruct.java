package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 2. 생성자 추가 (기본 생성자 X)
    MemberConstruct(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
//        3. 변경
        this(name, age, 50); // 인스턴스 자신이 참조하는 생성자를 호출
        // this() 규칙
        // this() 는 "생성자 코드의 첫줄에만 작성"할 수 있다.
    }

    // 1. 생성자 (클래스와 이름 동일, 반환 타입 없음)
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ", age=" + age + ", grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
