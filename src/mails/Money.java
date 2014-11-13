/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails;

/**
 * Class defining the Money
 */
public class Money implements Content {

	//Fields
	protected int amount;

	/**
	 * Constructor for the Money class
	 * @param amount
	 * @throws {@link IllegalArgumentException} amount must be >= 0
	 */
	public Money(int amount) throws IllegalArgumentException {
		if(amount < 0)
			throw new IllegalArgumentException("amount must be >= 0");
		this.amount = amount;
	}
	
	/**
	 * returns the amount
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}
}
