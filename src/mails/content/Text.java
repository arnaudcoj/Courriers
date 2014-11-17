/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails.content;

import mails.Content;

/**
 * Class defining the Text
 */
public class Text implements Content {

	//Fields
	protected String text;

	//Methods
	
	/**
	 * Constructor for the Text class
	 * @param text
	 */
	public Text(String text) {
		super();
		this.text = text;
	}
	
	/**
	 * returns the text
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	@Override
	/**
	 * Returns a String defining the Text
	 * @return a String defining the Text
	 */
	public String toString() {
		return "a text content (" + this.getText() + ")";
	}
}
