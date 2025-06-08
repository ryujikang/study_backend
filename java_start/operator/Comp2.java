package operator;

public class Comp2 {
    public static void main(String[] args) {
        // 문자열 비교 .equals() 메소드 사용
        String str1 = "문자열1", str2 = "문자열2";

        boolean res1 = "hello".equals("hello"); // 리터럴 비교
        boolean res2 = str1.equals("문자열1"); // 문자열 변수, 리터럴 비교
        boolean res3 = str1.equals(str2); // 문자열 변수 비교

        System.out.println(res1); // true
        System.out.println(res2); // false
        System.out.println(res3); // false
    }
}
