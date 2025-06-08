package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

//        intValue = doubleValue; // double -> int (오류)
        intValue = (int) doubleValue; // 명시적 형변환
        System.out.println("intValue = " + intValue); // 1.5 -> 1
    }
}
