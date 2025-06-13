package static2.ex;

/*
문제1: 구매한 자동차 수
다음 코드를 참고해서 생성한 차량 수를 출력하는 프로그램을 작성하자.

Car 클래스를 작성하자.

실행 결과
차량 구입, 이름: K3
차량 구입, 이름: G80
차량 구입, 이름: Model Y
구매한 차량 수: 3
*/

public class Car {
    private String name;
    private static int cnt;

    public Car(String name) {
        this.name = name;
        System.out.println("차량 구입, 이름: " + name);
        cnt++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + cnt);
    }
}
