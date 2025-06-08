package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 10;

        if (m > 0) {
            int tmp = m * 2;
            System.out.println("temp = " + tmp);
        }

        System.out.println("m = " + m);
    }
}
