package extends1.super2;

public class Super2Main {

    public static void main(String[] args) {
        ClassC classC = new ClassC();
        // 생성자 실행 순서 : 부모 먼저 (생정자 첫 줄의 super()가 부모를 호출하기 때문)
        // (부모) ClassA -> ClassB -> ClassC (자식)

        ClassB classB = new ClassB(100);
        // this(...)를 사용했어도, 맨 처음에는 super(...)로 호출해야함
    }
}
