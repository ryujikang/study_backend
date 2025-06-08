package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null; // 참조하지 않음
        data.value = 10; // NullPointerException 예외
        // Exception in thread "main" java.lang.NullPointerException: Cannot assign field "value" because "data" is null
        System.out.println("data = " + data.value);
    }
}
