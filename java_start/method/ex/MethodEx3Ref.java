package method.ex;

public class MethodEx3Ref {
    public static void main(String[] args) {
        int balance = 10000;

        balance = desposit(balance, 1000);
        balance = withdraw(balance, 2000);

        System.out.println("최종 잔액: " + balance + "원");
    }

    public static int desposit(int balance, int plus) {
        balance += plus;
        System.out.println(plus + "원 입금. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int minus) {
        if (balance >= minus) {
            balance -= minus;
            System.out.println(minus + "원 출금. 현재 잔액: " + balance + "원");
        } else System.out.println(minus + "원 출금 불가. 잔액 부족");
        return balance;
    }

}
