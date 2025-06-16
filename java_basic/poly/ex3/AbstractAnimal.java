package poly.ex3;

// 추상화 클래스
public abstract class AbstractAnimal {
    public abstract void sound();

    public void move() {
        System.out.println("동물이 움직임");
    }
}
