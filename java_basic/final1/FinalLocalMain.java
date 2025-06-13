package final1;

// final 키워드가 붙으면 더는 값을 변경할 수 없음 (class , method 를 포함한 여러 곳에 붙을 수 있음)
public class FinalLocalMain {

    public static void main(String[] args) {
        // final 지역 변수 1
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
//        data1 = 20; // 컴파일 오류
        
        // final 지역 변수 2
        final int data2 = 10;
//        data2 = 20; // 컴파일 오류

        method(10);
    }

    // final 매개변수
    static void method(final int parameter) {
//        parameter = 20; // 컴파일 오류
    }
}
