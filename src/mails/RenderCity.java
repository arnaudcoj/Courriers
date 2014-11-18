/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails;


/**
 * Class defining the RenderCity
 */
public class RenderCity extends City{
	
	protected StringBuilder builder;

	/**
	 * Constructor for the City class
	 * 
	 * @param name
	 *            name of the City
	 */
	public RenderCity(String name, StringBuilder builder) {
		super(name);
		this.builder = builder;
	}
	
	/**
	 * Adds a letter in the postBox
	 * 
	 * @param letter
	 *            the letter to add
	 */
	public void sendLetter(Letter<?> letter) {
		super.sendLetter(letter);
		this.builder.addString("-> " + letter.getSender() + " mails " + letter + " to "
				+ letter.getReceiver() + " for a cost of " + letter.getCost()
				+ " euros\n");
	}

}
