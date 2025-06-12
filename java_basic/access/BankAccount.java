package access;

// 캡슐화된 예제
public class BankAccount {
    
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액");
        }
    }

    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액 or 잔액 부족");
        }
    }

    public int getBalance() {
        return balance;
    }

    // private 메서드
    private boolean isAmountValid(int amount) {
        return amount > 0; // 금액이 0보다 크면 true 리턴
    }
}
