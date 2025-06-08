package loop;

public class While1_2 {
    public static void main(String[] args) {
        int cnt = 0;

        while (cnt < 3) {
            System.out.println("현재 숫자는: " + ++cnt);
        }
    }
}
