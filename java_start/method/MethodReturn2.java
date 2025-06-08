package method;

// 18살 미만 : "미성년자 출입 불가"
// 18살 이상 : "입장"
public class MethodReturn2 {
    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);
        checkAge(17);
        checkAge(18);
    }

    public static void checkAge(int age) {
        System.out.println(age + "살, " + ((age < 18) ? "미성년자 출입 불가" : "입장"));
    }

}
