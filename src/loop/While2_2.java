package loop;

public class While2_2 {
    public static void main(String[] args) {
        // i부터 하나씩 증가하는 수를 3번 더해라
        int sum = 0, i = 1;

        System.out.println("i=" + i + " sum=" + (sum+=i++));
        System.out.println("i=" + i + " sum=" + (sum+=i++));
        System.out.println("i=" + i + " sum=" + (sum+=i));

        sum = 0;
        i = 10;
        // i를 10으로 변경하면, 10+11+12
        System.out.println("i=" + i + " sum=" + (sum+=i++));
        System.out.println("i=" + i + " sum=" + (sum+=i++));
        System.out.println("i=" + i + " sum=" + (sum+=i));
    }
}
