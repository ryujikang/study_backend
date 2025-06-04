package cond;

public class If1 {
    public static void main(String[] args) {
        int age = 20;

        // if 문
        if (age >= 18) { // 조건이 참(true)이면 실행
            System.out.println("성인입니다.");
        }

        if (age < 18) { // 거짓(false)이면 실행 X
            System.out.println("미성년자입니다.");
        }
    }
}
