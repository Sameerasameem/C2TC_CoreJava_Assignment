package Assignement3.Final;

import Assignement3.Abstract.Account;

public class Transaction {
  private final double Transaction=10.0;
  public final void performTransaction( Account account, double amount, boolean isDeposit) {
      if (isDeposit) {
          account.deposit(amount - Transaction);
      } else {
          account.withdraw(amount + Transaction);
      }
      System.out.println("Transaction complete. New balance: " + account.getBalance());
  }
  
  
  
  
}
