/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails;

/**
 * Class defining the UrgentLetter
 */
public class UrgentLetter extends LetterDecorator{

	public static final int COSTFACTOR = 2;
	
	/**
	 * Constructor for the UrgentLetter class
	 * @param sender
	 * @param receiver
	 * @param content
	 * @param letter
	 * @throws IllegalArgumentException if letter is an UrgentLetter
	 */
	public UrgentLetter(Inhabitant sender, Inhabitant receiver,
			Letter<?> content, Letter<?> letter) throws IllegalArgumentException {
		super(sender, receiver, content, letter);
		if(letter instanceof UrgentLetter)
			throw new IllegalArgumentException("letter is an UrgentLetter");
	}

	/* (non-Javadoc)
	 * @see mails.Letter#action()
	 */
	@Override
	public void action() {
		this.letter.action();
	}

	/* (non-Javadoc)
	 * @see mails.Letter#getCost()
	 */
	@Override
	public int getCost() {
		return this.letter.getCost()*UrgentLetter.COSTFACTOR ;
	}

}