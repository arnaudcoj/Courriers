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
	public AcknowledgmentOfReceipt(Inhabitant sender, Inhabitant receiver) {
		super(sender, receiver, new Text("Your letter have been received."));
	}

}
