/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails.letter;

import mails.Inhabitant;
import mails.Letter;
import mails.content.Text;

/**
 * Class defining the RegiteredLetter
 */
public class RegisteredLetter extends LetterDecorator {

	public static final int OVERCOST = 15;
	
	/**
	 * Constructor for the RegiteredLetter class
	 * @param sender
	 * @param receiver
	 * @param content
	 * @param letter
	 */
	public RegisteredLetter(Inhabitant sender, Inhabitant receiver,
			Letter<?> content, Letter<?> letter) {
		super(sender, receiver, letter);
	}

	/* (non-Javadoc)
	 * @see mails.Letter#action()
	 */
	@Override
	public void action() {
		this.content.action();
		Text text = new Text("Acknowledgment of receipt for " + this);
		AcknowledgmentOfReceipt ackOfRec = new AcknowledgmentOfReceipt(this.receiver, this.sender, text);
		this.receiver.getCity().sendLetter(ackOfRec);
	}

	/* (non-Javadoc)
	 * @see mails.Letter#getCost()
	 */
	@Override
	public int getCost() {
		return this.content.getCost() + RegisteredLetter.OVERCOST;
	}

	public String toString() {
		return "a registered letter whose content is " + this.content;
	}
}
