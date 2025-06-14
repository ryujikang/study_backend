package extends1.ex3;

// 상속 사용 (extends)
public class Car {

    // 공통 기능
    public void move() {
        System.out.println("차 이동");
    }

    /*
    상속과 기능 추가
    이번에는 상속 관계의 장점을 알아보기 위해, 상속 관계에 다음 기능을 추가해보자.
    - 모든 차량에 문열기( openDoor() ) 기능을 추가해야 한다.
    - 새로운 수소차( HydrogenCar )를 추가해야 한다.
        - 수소차는 fillHydrogen() 기능을 통해 수소를 충전할 수 있다
    */

    // 추가
    public void openDoor() {
        System.out.println("문 열기");
    }
}
