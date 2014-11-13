/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails;

/**
 * Class defining the acknowledgmentOfReceipt
 */
public class AcknowledgmentOfReceipt extends SimpleLetter {

	/**
	 * Constructor for the acknowledgmentOfReceipt class
	 * @param sender
	 * @param receiver
	 * @param content
	 */
	public AcknowledgmentOfReceipt(Inhabitant sender, Inhabitant receiver) {
		super(sender, receiver, new Text("Your letter have been received."));
	}

}
