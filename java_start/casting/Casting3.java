package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고값
        long maxIntOver = 2147483648L; // int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; // long -> int 형 변환
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int) maxIntOver; // long -> int 형 변환, but int 범위를 넘어감
        System.out.println("maxIntOver caseting = " + intValue); // 형 변환 오버플로우
    }
}
