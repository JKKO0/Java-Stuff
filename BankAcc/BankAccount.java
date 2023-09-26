class BankAccount {
    private int accountNumber;
    private double balance;

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(12345, 1000.0, 2.5);
        savingsAccount.deposit(500.0);
        savingsAccount.withdraw(200.0);
        savingsAccount.addInterest();

        double currentBalance = savingsAccount.getBalance();
        System.out.println("Current balance: " + currentBalance);
    }

    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = (getBalance() * interestRate) / 100;
        deposit(interest);
    }
}
