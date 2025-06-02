package operator;

public class Logical1 {
    public static void main(String[] args) {
        System.out.println("&& -> AND 연산"); // 모두 true 일 때, true
        System.out.println(true && true);   // true
        System.out.println(true && false);  // false
        System.out.println(false && false); // false

        System.out.println("|| -> OR 연산"); // 하나라도 true 일 때, true
        System.out.println(true || true);   // true
        System.out.println(true || false);  // true
        System.out.println(false || false); // false

        System.out.println("! -> NOT 연산"); // 반대로
        System.out.println(!true);  // false
        System.out.println(!false); // true

        System.out.println("변수 활용");
        boolean a = true, b = false;
        System.out.println(a && b); // false
        System.out.println(a || b); // true
        System.out.println(!a); // false
        System.out.println(!b); // true
    }
}
