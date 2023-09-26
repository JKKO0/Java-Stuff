Create a Java program that models a bank account. Implement two classes, BankAccount and SavingsAccount, where SavingsAccount is a subclass of BankAccount.
The BankAccount class should have the following attributes and methods:
accountNumber (a unique integer) balance (a double representing the account balance) BankAccount(int accountNumber, double initialBalance) constructor to initialize the account. deposit(double amount) method to deposit money into the account. 
withdraw(double amount) method to withdraw money from the account. getBalance() method to return the current balance.
The SavingsAccount class should inherit from BankAccount and have the following additional attributes and methods:
interestRate (a double representing the annual interest rate) SavingsAccount(int accountNumber, double initialBalance, double interestRate) constructor to initialize the account. addInterest() method to add interest to the account balance. 
Interest is calculated as (balance * interestRate) / 100.
In the main program: Create an instance of SavingsAccount and demonstrate the use of the deposit, withdraw, and addInterest methods. Use both super and this keywords appropriately in the constructors and methods.
