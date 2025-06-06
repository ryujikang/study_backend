package scanner;

// System.in을 통해 입력 받기 위해, Scanner 클래스를 불러옴
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String str = sc.nextLine(); // .nextLine(); 한 줄을 입력받아 String으로 가져옴
        System.out.println("입력한 문자열: " + str);

        System.out.print("정수를 입력하세요: ");
        int intValue = sc.nextInt(); // .nextInt(); 정수를 입력받아 int로 가져옴
        System.out.println("입력한 정수: " + intValue);

        System.out.print("실수를 입력하세요: ");
        double doubleValue = sc.nextDouble(); // .nextDouble(); 실수를 입력받아 double로 가져옴
        System.out.println("입력한 실수: " + doubleValue);
    }
}
