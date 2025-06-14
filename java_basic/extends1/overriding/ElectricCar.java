package extends1.overriding;

public class ElectricCar extends Car {
    
    // '@' : 애노테이션 (주석과 비슷)
    //       프로그램이 읽을 수 있는 특별한 주석
    @Override // 오버라이드 조건을 만족시키지 않으면 컴파일 에러를 발생 (실수 방지)
    public void move() { // Car(부모)의 move() 기능을 그대로 사용하지 않음, 새로 재정의(메소드 오버라이딩)
        System.out.println("전기차 빠르게 이동");
    }
    
    public void charge() {
        System.out.println("충전");
    }
}
