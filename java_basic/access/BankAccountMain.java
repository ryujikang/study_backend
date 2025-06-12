package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // BankAccount를 사용하는 입장 => 입금/출금/잔고 3가지 메서드만 알면 됨 == public 사용
        account.deposit(10000); // 입금
        account.withdraw(3000); // 출금
        System.out.println("balance = " + account.getBalance()); // 잔고
    }
}
