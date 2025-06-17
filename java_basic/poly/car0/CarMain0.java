package poly.car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        K3Car k3Car = new K3Car();
        driver.setK3Car(k3Car);
        driver.driver();

        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null);
        driver.setModel3Car(model3Car);
        driver.driver();
    }
}
