package Assignement3.Abstract;

public class CheckingAccount extends Account{
	public CheckingAccount(int accountNumber, double balance) {
		super(accountNumber,balance);
	}
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		if(amount <= balance) {
			balance -= amount;
			
		}
		else {
			System.out.println("Overdraft not allowed");
		}
	}
	public double getBalance() {
		return balance;
	}
	

}
