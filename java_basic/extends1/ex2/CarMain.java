package extends1.ex2;

import extends1.ex1.ElectricCar;
import extends1.ex1.GasCar;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); // 공통 기능, 상속 받음(사용가능)
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move(); // 공통 기능, 상속 받음(사용가능)
        gasCar.fillUp();
    }
}
