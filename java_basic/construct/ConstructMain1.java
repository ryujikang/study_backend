package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        // new 키워드를 사용해서 객체를 생성할 때 마지막에 괄호 () 도 포함해야 하는 이유가 바로 생성자 때문
        // 객체를 생성하면서 동시에 생성자를 호출한다는 의미
        MemberConstruct m1 = new MemberConstruct("user1", 15, 90); // 인스턴스 생성(new) 후, 즉시 생성자 호출
        MemberConstruct m2 = new MemberConstruct("user2", 16, 80); // 인스턴스 생성(new) 후, 즉시 생성자 호출

        MemberConstruct[] members = {m1, m2};

        for (MemberConstruct s : members) {
            System.out.println("이름: " + s.name + ", 나이: " + s.age + ", 성적: " + s.grade);
        }
    }
}
