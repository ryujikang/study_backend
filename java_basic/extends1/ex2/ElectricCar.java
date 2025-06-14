package extends1.ex2;

/*
용어 정리
- 부모 클래스 (슈퍼 클래스): 상속을 통해 자신의 필드와 메서드를 다른 클래스에 제공하는 클래스
- 자식 클래스 (서브 클래스): 부모 클래스로부터 필드와 메서드를 상속받는 클래스
*/

public class ElectricCar extends Car {

    // Car 클래스 상속 받음(extends)
    // move() 포함되어 있음
    
    public void charge() {
        System.out.println("충전");
    }
}
