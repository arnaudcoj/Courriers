/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails;

/**
 * Class defining the Inhabitant
 */
public class Inhabitant {

	//Attributes
	protected String name;
	protected City city;
	protected BankAccount bankAccount; 
	
	//Methods
	
	/**
	 * Constructor for the Inhabitant class
	 * @param city
	 * @param bankAccount
	 */
	public Inhabitant(City city, String name, BankAccount bankAccount) {
		super();
		this.city = city;
		this.name = name;
		this.bankAccount = bankAccount;
	}

	/**
	 * returns the city
	 * @return the city
	 */
	public City getCity() {
		return city;
	}

	/**
	 * returns the bankAccount
	 * @return the bankAccount
	 */
	public BankAccount getBankAccount() {
		return bankAccount;
	}

	/**
	 * Receive the letter (execute the method action() of the letter)
	 * @param letter
	 */
	public void receiveLetter(Letter<?> letter) {
		System.out.println("<- " + this.name + " receives an " + letter);
		letter.action();		
	}

	/**
	 * Sends a letter (execute the method action() of the letter)
	 * @param letter
	 */
	public void sendLetter(Letter<?> letter) {
		System.out.println("-> " + this.name + " mails an " + letter);
		this.city.sendLetter(letter);		
	}

	
	
}
