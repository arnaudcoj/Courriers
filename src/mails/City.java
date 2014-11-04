/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails;

import java.util.LinkedList;
import java.util.List;

/**
 * Class defining the City
 */
public class City {

	// Attributes
	protected String name;
	protected List<Letter<?>> postBox;
	
	//Methods
	
	/**
	 * Constructor for the City class
	 * @param name name of the City
	 */
	public City(String name) {
		this.name = name;
		this.postBox = new LinkedList<Letter<?>>();
	}
	
	public void sendLetter(Letter<?> letter) {
		//TODO
	}
}