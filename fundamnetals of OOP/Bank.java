import java.util.ArrayList;

public class Bank {
	private ArrayList<Account> accounts;
	private static int latestAccount;

    Bank() { /*A new bank is defined with a list of bank accounts and a value that keeps track of the account number of the 
			 most recently added account*/
        this.accounts = new ArrayList<Account>();
        Bank.latestAccount = -1; 
    }
    
    public int login() {
    /*This method should ask the user to give their account number and password, returning the account number if they match, 
	or returning -1 if not*/
        return 0;
    }
    
    public void deposit(int number) {
    /*This method should ask the user how much money they want to deposit into their account, and correctly update the 
	balance of their account*/
    }
    
    public void withdraw(int number) {
    /*This method should ask the user how much money they want to withdraw from their account, and correctly update 
	the balance of their account*/
    }
    
    public void checkBalance(int number) {
    //This method should display a message telling the user how much money is in their account
    }
    
    public void addAccount() {
    /*This method should create a new account with an account number 1 larger than the account number or the last account 
	created, a password given by the user, and a balance of 0. The account should be added to the bank's list of accounts*/
    }
}