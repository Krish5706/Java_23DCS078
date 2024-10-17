import java.util.ArrayList;
import java.util.List;

// Define the Account interface
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    double getBalance();
}

// Define the SavingsAccount class that implements Account
class SavingsAccount implements Account {
    private double balance;
    private double interestRate;

    // Constructor
    public SavingsAccount(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    // Implement the deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Savings Account. New Balance: " + balance);
    }

    // Implement the withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings Account. New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance in Savings Account.");
        }
    }

    // Implement the calculateInterest method
    public double calculateInterest() {
        return balance * interestRate / 100;
    }

    // Implement the getBalance method
    public double getBalance() {
        return balance;
    }
}

// Define the CurrentAccount class that implements Account
class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit;

    // Constructor
    public CurrentAccount(double initialBalance, double overdraftLimit) {
        this.balance = initialBalance;
        this.overdraftLimit = overdraftLimit;
    }

    // Implement the deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Current Account. New Balance: " + balance);
    }

    // Implement the withdraw method
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Current Account. New Balance: " + balance);
        } else {
            System.out.println("Overdraft limit exceeded in Current Account.");
        }
    }

    // Implement the calculateInterest method (no interest for CurrentAccount)
    public double calculateInterest() {
        return 0;
    }

    // Implement the getBalance method
    public double getBalance() {
        return balance;
    }

    // Unique method for CurrentAccount
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
        System.out.println("New overdraft limit set to " + overdraftLimit);
    }
}

// Define the Bank class
class Bank {
    private List<Account> accounts;

    // Constructor
    public Bank() {
        accounts = new ArrayList<>();
    }

    // Method to add an account
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added to the bank.");
    }

    // Method to show all account balances
    public void showAllBalances() {
        for (Account account : accounts) {
            System.out.println("Account Balance: " + account.getBalance());
        }
    }
}

// Main class to test the implementation
public class Sep22 {
    public static void main(String[] args) {
        // Create a Bank object
        Bank bank = new Bank();

        // Create SavingsAccount and CurrentAccount objects
        SavingsAccount savingsAccount = new SavingsAccount(1000, 5);
        CurrentAccount currentAccount = new CurrentAccount(500, 1000);

        // Add accounts to the bank
        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        // Perform operations on accounts
        savingsAccount.deposit(200);
        savingsAccount.withdraw(100);
        System.out.println("Interest on Savings Account: " + savingsAccount.calculateInterest());

        currentAccount.deposit(300);
        currentAccount.withdraw(700);
        currentAccount.setOverdraftLimit(2000);

        // Show all account balances
        bank.showAllBalances();
    }
}
