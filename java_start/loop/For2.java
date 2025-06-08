package loop;

public class For2 {
    public static void main(String[] args) {
        int sum = 0, endNum = 3;

        for (int i = 1; i <= endNum; i++) {
            sum += i;
            System.out.println("i=" + i + " sum=" + sum);
        }
    }
}
