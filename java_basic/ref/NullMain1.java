package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null; // null로 초기화 == 참조하지 않는다
        System.out.println("1. data = " + data);

        data = new Data(); // 인스턴스 할당 == 참조한다
        System.out.println("2. data = " + data);

        data = null; // null로 초기화 == 참조하지 않는다
        System.out.println("3. data = " + data);
    }
}
