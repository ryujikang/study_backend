package static2;

// import static static2.DecoData.staticCall;
import static static2.DecoData.*; // 정적 메서드를 자주 호출한다면

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();
        staticCall(); // import static 을 사용해 클래스명 생략 가능

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        // 인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.instanceCall();

        // 클래스를 통한 접근
        DecoData.staticCall();
    }
}
