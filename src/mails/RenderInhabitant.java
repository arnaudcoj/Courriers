/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails;

/**
 * Class defining the RenderInhabitant
 */
public class RenderInhabitant extends Inhabitant{	

	protected StringBuilder builder;
	
	/**
	 * Constructor for the Inhabitant class
	 * 
	 * @param city
	 * @param bankAccount
	 */
	public RenderInhabitant(City city, String name, BankAccount bankAccount, StringBuilder builder) {
		super(city, name, bankAccount);
		this.builder = builder;
	}
	
	/**
	 * Receive the letter (execute the method action() of the letter)
	 * @param letter
	 */
	public void receiveLetter(Letter<?> letter) {
		super.receiveLetter(letter);
		this.builder.addString("<- " + this.name + " receives " + letter + " from "
				+ letter.getSender()+"\n");
	}


	public void credit(int amount) {
		super.credit(amount);
		this.builder.addString("+ " + this.name + "'s account is credited with "
				+ amount + "; its balance is now " + this.bankAccount+"\n");
	}

	public void debit(int amount) {
		super.debit(amount);
		this.builder.addString("- " + this.name + "'s account is debited of "
				+ amount + "; its balance is now " + this.bankAccount+"\n");
	}
}
