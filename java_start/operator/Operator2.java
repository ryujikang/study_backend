package operator;

public class Operator2 {
    public static void main(String[] args) {

        // 문자열과 문자열 더하기1
        String res1 = "hello " + "world";
        System.out.println(res1);

        // 문자열과 문자열 더하기2
        String s1 = "string1";
        String s2 = "string2";
        String res2 = s1 + s2;
        System.out.println(res2);


        // 문자열과 숫자 더하기1
        String res3 = "a + b = " + 10; // "문자열" + 10 ???
        System.out.println(res3); // 뒤에 나오는 10을 문자열 취급

        // 문자열과 숫자 더하기2
        int num = 20;
        String str = "a + b = ";
        String res4 = str + num; // "문자열" + 20
        System.out.println(res4); // 뒤에 나오는 num(20)을 문자열 취급

        // 문자열에 더하면 전부 문자열이 됨
    }
}
