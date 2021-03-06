/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails;

/**
 * Class defining the Content of a Letter
 */
public interface Content {

	@Override
	/**
	 * Returns a String defining the Content
	 * @return a String defining the Content
	 */
	public abstract String toString();
}
