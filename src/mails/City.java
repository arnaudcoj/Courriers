/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails;

import java.util.LinkedList;
import java.util.List;

/**
 * Class defining the City
 */
public class City {

	// Attributes
	protected String name;
	protected LinkedList<Letter<?>> postBox;

	// Methods

	/**
	 * Constructor for the City class
	 * 
	 * @param name
	 *            name of the City
	 */
	public City(String name) {
		this.name = name;
		this.postBox = new LinkedList<Letter<?>>();
	}

	/**
	 * Adds a letter in the postBox
	 * 
	 * @param letter
	 *            the letter to add
	 */
	public void sendLetter(Letter<?> letter) {
		this.postBox.add(letter);
		letter.getSender().getBankAccount().debit(letter.getCost());
	}

	public void distributeLetters() {

		while(!this.postBox.isEmpty()) {
			Letter<?> l = this.postBox.pop();
			l.getReceiver().receiveLetter(l);
		}
	}
}