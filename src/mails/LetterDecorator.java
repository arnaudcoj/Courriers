/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails;

/**
 * Class defining the LetterDecorator
 */
public abstract class LetterDecorator extends Letter<Letter<?>> {

	protected Letter<?> letter;
	
	/**
	 * Constructor for the LetterDecorator class
	 * @param sender
	 * @param receiver
	 * @param content
	 */
	public LetterDecorator(Inhabitant sender, Inhabitant receiver, Letter<?> content, Letter<?> letter) {
		super(sender, receiver, content);
		this.letter = letter;
	}
}
