package oop.ex;

/*
문제2 - 객체 지향 계좌
은행 계좌를 객체로 설계해야 한다.

Account 클래스를 만들어라.
    int balance 잔액
    deposit(int amount) : 입금 메서드
    입금시 잔액이 증가한다.
    withdraw(int amount) : 출금 메서드
    출금시 잔액이 감소한다.
    만약 잔액이 부족하면 잔액 부족을 출력해야 한다.

AccountMain 클래스를 만들고 main() 메서드를 통해 프로그램을 시작해라.
계좌에 10000원을 입금해라.
계좌에서 9000원을 출금해라.
계좌에서 2000원을 출금 시도해라. 잔액 부족 출력을 확인해라.
잔고를 출력해라. 잔고: 1000

실행 결과
잔액 부족
잔고: 1000
*/

public class Account {
    int balance = 0; // 잔액

    void deposit(int amount) {
//        입금 메서드
//        입금시 잔액이 증가한다.
        balance += amount;
    };

    void withdraw(int amount) {
//        출금 메서드
//        출금시 잔액이 감소한다.
//        만약 잔액이 부족하면 잔액 부족을 출력해야 한다.
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("잔액 부족");
        }
    };

    void showBalance() {
        System.out.println("잔고: " + balance);
    }
}
