/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails;

/**
 * Class defining the SimpleLetter
 */
public class SimpleLetter extends Letter<Text> {

	public static final int SIMPLELETTERCOST = 1;
	
	/**
	 * Constructor for the SimpleLetter class
	 * @param sender
	 * @param receiver
	 * @param content
	 */
	public SimpleLetter(Inhabitant sender, Inhabitant receiver, Text content) {
		super(sender, receiver, content);
	}

	/* (non-Javadoc)
	 * @see mails.Letter#action()
	 */
	@Override
	public void action() {
		System.out.println("content : " + this.content.getText());
	}

	/* (non-Javadoc)
	 * @see mails.Letter#getCost()
	 */
	@Override
	public int getCost() {
		return SimpleLetter.SIMPLELETTERCOST;
	}

	
	
}
