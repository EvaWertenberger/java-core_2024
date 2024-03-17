package lr2.Task7;

public class BankAccount implements BankAccountOperations{
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }
    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }
    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Недостаточно средств");
        }
        this.balance -= amount;
    }
    @Override
    public double getBalance() {
        return balance;
    }
}
