package Assignement3.Abstract;

public class SavingsAccount extends Account {
	public SavingsAccount(int accountNumber, double balance) {
		super(accountNumber, balance);
	}
      public void deposit(double amount) {
    	  balance += amount;
    	  
      }
      public void withdraw(double amount) {
    	  if(amount < balance) {
    		  balance -= amount;
    	  }
    		  else {
    			  System.out.print("Insuffient funds");
    		  }
      }
    	  public double getBalance() {
    	        return balance;
    	    }
    		  
    	  
      }

