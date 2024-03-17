package lr2.Task7;

public class TestBankAcc {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000.0);
        account1.deposit(500.0);
        account1.withdraw(300.0);
        System.out.println("Баланс счета: " + account1.getBalance());
    }
}
