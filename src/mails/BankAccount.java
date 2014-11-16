/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails;

/**
 * Class defining the BankAccount
 */
public class BankAccount {

	//Fields
	protected int balance;

	//Methods
	/**
	 * Constructor for the BankAccount class
	 * @param balance
	 */
	public BankAccount(int balance) {
		super();
		this.balance = balance;
	}

	/**
	 * credit the bank account
	 * @param cash amount of money to credit to the bank account
	 * @throws {@link IllegalArgumentException} cash must be >= 0
	 */
	public void credit(int cash) throws IllegalArgumentException {
		if(cash < 0)
			throw new IllegalArgumentException("cash must be >= 0");
		this.balance += cash;
	}

	/**
	 * debit the bank account
	 * @param cash amount of money to debit from the bank account
	 * @throws {@link IllegalArgumentException} cash must be >= 0
	 */
	public void debit(int cash) {
		if(cash < 0)
			throw new IllegalArgumentException("cash must be >= 0");
		this.balance -= cash;
	}
	
	/**
	 * returns the balance
	 * @return the balance
	 */
	public int getBalance() {
		return balance;
	}

	public String toString() {
		return "" + this.balance + " euros";
	}
}
