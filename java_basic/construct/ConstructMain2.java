package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct m1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct m2 = new MemberConstruct("user2", 16); // grade를 받지 않음 -> 매개변수가 같은 생성자를 호출 -> grade = 50

        MemberConstruct[] members = {m1, m2};

        for (MemberConstruct s : members) {
            System.out.println("이름: " + s.name + ", 나이: " + s.age + ", 성적: " + s.grade);
        }
    }
}
