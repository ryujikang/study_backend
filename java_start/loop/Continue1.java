package loop;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            if (i == 3) {
                i++;
                continue; // 바로 조건식으로 이동
            }
            System.out.println(i++);
        }
    }
}
