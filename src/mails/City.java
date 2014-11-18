/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails;

import java.util.LinkedList;

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
		letter.getSender().debit(letter.getCost());
		this.postBox.add(letter);
	}

	/**
	 * Distributes the letters of the postBox to the receivers
	 */
	public void distributeLetters() {
		LinkedList<Letter<?>> sac = new LinkedList<Letter<?>>();
		while(!this.postBox.isEmpty()) {
			sac.add(this.postBox.pop());
		}

		this.postBox.clear();
		while(!sac.isEmpty()) {
			Letter<?> l = sac.pop();
			l.getReceiver().receiveLetter(l);
		}
	}
	
	/**
	 * Return true if and only if the postBox is empty
	 * @return true if and only if the postBox is empty
	 */
	public boolean isEmpty(){
		return this.postBox.isEmpty();
	}
	
	public String toString() {
		return this.name + " city";
	}
}