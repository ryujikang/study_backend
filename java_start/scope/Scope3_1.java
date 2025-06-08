package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int tmp = 0; // 임시 변수 (잠깐 사용하려고 만든 변수)
                    // 좋지 못한 코드 (if 문 안에서 선언하는게 좋음)

        if (m > 0) {
            tmp = m * 2;
            System.out.println("temp = " + tmp);
        }

        System.out.println("m = " + m);
    }
}
