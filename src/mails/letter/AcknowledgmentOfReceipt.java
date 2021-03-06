/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails.letter;

import mails.Inhabitant;
import mails.content.Text;

/**
 * Class defining the Acknowledgment Of Receipt
 */
public class AcknowledgmentOfReceipt extends SimpleLetter {

	/**
	 * Constructor for the AcknowledgmentOfReceipt class
	 * Is sent automatically when an inhabitant receives a RegisteredLetter
	 * @param sender
	 * @param receiver
	 */
	public AcknowledgmentOfReceipt(Inhabitant sender, Inhabitant receiver, Text content) {
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
		return "an aknowledgment of receipt which is " + super.toString();
	}

}
