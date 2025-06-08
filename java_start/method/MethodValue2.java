package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("1. changeNumber 호출 전, num1: "+ num);
        changeNumber(num);
        System.out.println("4. changeNumber 호출 후, num1: "+ num);
    }

    public static void changeNumber(int num) {
        // main -> num 과 changeNumber -> num 은 같은 변수가 아님
        System.out.println("2. changeNumber 변경 전, num2: " + num);
        num = num * 2;
        System.out.println("3. changeNumber 변경 후, num2: " + num);
    }
}
