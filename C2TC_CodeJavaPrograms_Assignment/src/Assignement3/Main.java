package Assignement3;

import Assignement3.Abstract.CheckingAccount;
import Assignement3.Abstract.SavingsAccount;
import Assignement3.Final.Transaction;
import Assignement3.Static.Bank;

public class Main {
	public static void main(String [] args) {
		SavingsAccount sa = new SavingsAccount(123,5000);
		CheckingAccount ca = new CheckingAccount(123, 6000);
		Transaction t = new Transaction();
		t.performTransaction(ca, 0, false);
		t.performTransaction(sa, 0, false);
		System.out.println("Total Accounts: " + Bank.getTotalAccount());
		
		
	}

}
