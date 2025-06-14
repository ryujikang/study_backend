package extends1.ex3;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); // 공통 기능, 상속 받음(사용가능)
        electricCar.charge();
        electricCar.openDoor();

        GasCar gasCar = new GasCar();
        gasCar.move(); // 공통 기능, 상속 받음(사용가능)
        gasCar.fillUp();
        gasCar.openDoor();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move(); // 공통 기능, 상속 받음(사용가능)
        hydrogenCar.fillHydrogen();
        hydrogenCar.openDoor();
    }
}
