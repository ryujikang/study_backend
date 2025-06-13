package static2.ex;

/*
문제2: 수학 유틸리티 클래스

다음 기능을 제공하는 배열용 수학 유틸리티 클래스( MathArrayUtils )를 만드세요.
- sum(int[] array) : 배열의 모든 요소를 더하여 합계를 반환합니다.
- average(int[] array) : 배열의 모든 요소의 평균값을 계산합니다.
- min(int[] array) : 배열에서 최소값을 찾습니다.
- max(int[] array) : 배열에서 최대값을 찾습니다.

요구사항
- MathArrayUtils 은 객체를 생성하지 않고 사용해야 합니다. 누군가 실수로 MathArrayUtils 의 인스턴스 를 생성하지 못하게 막으세요.
- 실행 코드에 static import 를 사용해도 됩니다.

실행 결과
sum=15
average=3.0
min=1
max=5
*/

public class MathArrayUtils {
    
    // 기본 생성자 -> private => 인트선스 생성 막음
    private MathArrayUtils() {
        
    }

    public static int sum(int[] values) {
        int sum = 0;
        for (int i=0; i<values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int min = values[0];
        for (int i=0; i<values.length; i++) {
            if (values[i] < min) min = values[i];
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[0];
        for (int i=0; i<values.length; i++) {
            if (values[i] > max) max = values[i];
        }
        return max;
    }

}
