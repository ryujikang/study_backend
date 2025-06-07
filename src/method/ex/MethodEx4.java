package method.ex;

/*
* 은행 계좌 입출금
*
* 입/출금 반복수행 프로그램
* */

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money = 0; // 초기 금액 0원

        while (true) {
            menuPrint(); // 메뉴판 출력
            money = menuRun(sc, money); // 메뉴 실행
        }
    }

    public static void menuPrint() {
        System.out.println("---------------------------------");
        System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
        System.out.println("---------------------------------");
    }

    public static int menuRun(Scanner sc, int money) {
        System.out.print("선택: ");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                return menu1(sc, money); // 입금
            case 2:
                return menu2(sc, money); // 출금
            case 3:
                System.out.println("현재 잔액: " + money + "원");
                break;
            case 4:
                System.out.println("시스템을 종료합니다.");
                System.exit(0);
                break;
            default:
                System.out.println("메뉴를 다시 선택해주세요.");
        }
        return money;
    }

    public static int menu1(Scanner sc, int money) {
        System.out.print("입금액을 입력하세요: ");
        int temp = sc.nextInt();
        money += temp;
        System.out.println(temp + "원을 입금하였습니다. 현재 잔액: " + money);
        return money;
    }

    public static int menu2(Scanner sc, int money) {
        System.out.print("출금액을 입력하세요: ");
        int temp = sc.nextInt();

        if (money >= temp) {
            money -= temp;
            System.out.println(temp + "원을 출금하였습니다. 현재 잔액: " + money);
        } else System.out.println(temp + "원을 출금하려 했으나 잔액이 부족합니다.");
        return money;
    }
}
