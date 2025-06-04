package loop;

public class While2_1 {
    public static void main(String[] args) {
        // 1부터 하나씩 증가하는 수를 3번 더하기
        int sum = 0;

        // 변경에 용이하지 않음
        System.out.println("i=" + 1 + " sum=" + (sum+=1));
        System.out.println("i=" + 2 + " sum=" + (sum+=2));
        System.out.println("i=" + 3 + " sum=" + (sum+=3));
    }
}
