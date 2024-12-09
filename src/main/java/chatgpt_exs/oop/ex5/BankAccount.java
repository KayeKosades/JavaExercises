package chatgpt_exs.oop.ex5;

public class BankAccount {

    protected Double balance;

    public BankAccount(Double balance) {
        this.balance = balance;
    }

    public void deposit(Double amount) {
        balance+=amount;
    }

    public void withdraw(Double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Недостаточно средств на счете");
        }
        balance-=amount;
    }
}
