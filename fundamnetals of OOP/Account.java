public class Account {
	private int accountNumber;
	private String password;
	private float balance;

	//A new bank account should be defined with a given account number, password and balance
    Account (int number, String password, float balance) {
        this.accountNumber = number;
        this.password = password;
        this.balance = balance;
	}

    public int getNumber() {
    //This method should return the account number of this account
        return accountNumber;
    }

    public boolean checkPassword(String password) {
    //This method should check if a given password is equal to the password for this account
        System.out.println("Please enter your password");
        if (password.equals(this.password)) {
            return true;
        }
        else {
            return false;
        }

        }



    public float getBalance() {
    //This method should return the balance of this account
        return balance;
    }

    public void setBalance(float newBalance) {
    //This method should change the balance of this account to a specified new value
         balance = newBalance;
    }
}