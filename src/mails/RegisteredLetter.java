/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails;

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
		super(sender, receiver, content, letter);
	}

	/* (non-Javadoc)
	 * @see mails.Letter#action()
	 */
	@Override
	public void action() {
		this.letter.action();
		this.sender.getCity().sendLetter(new AcknowledgmentOfReceipt(this.receiver, this.sender));
	}

	/* (non-Javadoc)
	 * @see mails.Letter#getCost()
	 */
	@Override
	public int getCost() {
		return this.letter.getCost() + RegisteredLetter.OVERCOST;
	}

}
