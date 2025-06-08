package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("value1 = " + data.value1); // 초기화 안되있음 == 0
        System.out.println("value2 = " + data.value2);
    }
}
