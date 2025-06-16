package poly.ex5;

// 인터페이스 '구현' = implements
public class Cow implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("음메");
    }

    @Override
    public void move() {
        System.out.println("소 이동");
    }
}
