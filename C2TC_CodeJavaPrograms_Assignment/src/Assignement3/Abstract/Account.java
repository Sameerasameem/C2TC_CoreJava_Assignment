 package Assignement3.Abstract;

import Assignement3.Static.Bank;

public abstract class Account {
    protected int accountNumber;
    protected double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        Bank.incrementAccounts(); // static method call
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();
}
