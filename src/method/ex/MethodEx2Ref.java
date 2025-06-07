package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        printMessage("1: Hello, world!", 3);
        printMessage("2: Hello, world!", 5);
        printMessage("3: Hello, world!", 7);
    }
    public static void printMessage(String str, int n) {
        for (int i=0; i<n; i++)
            System.out.println(str);
    }
}
