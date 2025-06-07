package method;

public class MethodValue3 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("1. changeNumber 호출 전, num1: "+ num);
        num = changeNumber(num); // 리턴된 값을 저장
        System.out.println("4. changeNumber 호출 후, num1: "+ num);
    }

    public static int changeNumber(int num) {
        System.out.println("2. changeNumber 변경 전, num2: " + num);
        num = num * 2;
        System.out.println("3. changeNumber 변경 후, num2: " + num);
        return num; // 변경한 값을 리턴
    }
}
