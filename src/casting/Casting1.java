package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long (자동 형변환 O)
        // longValue = (long) intValue;
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; // int -> double (자동 형변환 O)
        // doubleValue = (double) intValue;
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; // long -> double (자동 형변환 O)
        // doubleValue = (double) 20L;
        System.out.println("doubleValue2 = " + doubleValue);
    }
}
