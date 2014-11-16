/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails.letter;

import mails.Inhabitant;
import mails.content.Text;

/**
 * Class defining the ThanksLetter
 */
public class ThanksLetter extends SimpleLetter {

	/**
	 * Constructor for the ThanksLetter class
	 * @param sender
	 * @param receiver
	 * @param letter
	 */
	public ThanksLetter(Inhabitant sender, Inhabitant receiver, Text content) {
		super(sender, receiver, content);
	}

	/* (non-Javadoc)
	 * @see mails.Letter#action()
	 */
	@Override
	public void action() {
	}

	/* (non-Javadoc)
	 * @see mails.Letter#toString()
	 */
	@Override
	public String toString() {
		return "a thanks letter which is " + super.toString(); 
	}

}
