import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private ArrayList<Account> accounts;
    private static int latestAccount;
    private int amount;

    Bank() { /*A new bank is defined with a list of bank accounts and a value that keeps track of the account number of the 
			 most recently added account*/
        this.accounts = new ArrayList<Account>();
        Bank.latestAccount = -1;
    }

    public int login() {
    /*This method should ask the user to give their account number and password, returning the account number if they match, 
	or returning -1 if not*/
        System.out.println("Enter account number");
        String response = Console.readLine();
        int accountNumber = Integer.parseInt(response);

        Account account = accounts.get(accountNumber);

        System.out.println("Enter password");
        String password = Console.readLine();

        if (account.checkPassword(password) == true) {
            return accountNumber;
        } else {
            return -1;
        }
    }

    public void deposit(int number) {
    /*This method should ask the user how much money they want to deposit into their account, and correctly update the 
	balance of their account*/
        Account account = accounts.get(number);
        float balance = account.getBalance();
        System.out.println("Enter how much money you would like to deposit");
        String response = Console.readLine();
        int Balance = Integer.parseInt(response);
        account.setBalance(balance + amount);

    }

    public void withdraw(int number) {
    /*This method should ask the user how much money they want to withdraw from their account, and correctly update 
	the balance of their account*/
        Account account = accounts.get(number);
        float balance = account.getBalance();

        System.out.println("Enter how much money you would like to withdraw");
        String response = Console.readLine();
        Float Withdraw = Float.parseFloat(response);

        account.setBalance(balance - amount);
    }

    public void checkBalance(int number) {
        //This method should display a message telling the user how much money is in their account
        Account account = accounts.get(number);
        float balance = account.getBalance();
        System.out.println(balance);
        System.out.println("Your balance is " + balance);
    }

    public void addAccount() {
    /*This method should create a new account with an account number 1 larger than the account number or the last account 
	created, a password given by the user, and a balance of 0. The account should be added to the bank's list of accounts*/

        latestAccount++;

        System.out.println("Set a pasword: \n");
        accounts.add(new Account(latestAccount, Console.readLine(), 0));
        System.out.println("Your account number is " + latestAccount);


    }
}