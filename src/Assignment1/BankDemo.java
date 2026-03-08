package Assignment1;
class BankAccount {

    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void displayBalance() {
        System.out.println("Account: " + accountNumber +
                ", Balance: " + balance);
    }
}

public class BankDemo {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount(12345, 1000);

        acc.deposit(500);
        acc.withdraw(300);
        acc.displayBalance();
    }
}