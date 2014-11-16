/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails;

/**
 * Abstract Class defining the Letters
 */
public abstract class Letter<T extends Content> implements Content {

	//Attributes
	protected Inhabitant sender;
	protected Inhabitant receiver;
	protected T content;
	
	//Methods
	
	/**
	 * Constructor for the Letter class
	 * @param sender
	 * @param receiver
	 * @param content
	 */
	public Letter(Inhabitant sender, Inhabitant receiver, T content) {
		super();
		this.sender = sender;
		this.receiver = receiver;
		this.content = content;
	}
	
	/**
	 * Returns the sender of the letter
	 * @return the sender
	 */
	public Inhabitant getSender() {
		return sender;
	}
	
	/**
	 * Returns the receiver of the letter
	 * @return the receiver
	 */
	public Inhabitant getReceiver() {
		return receiver;
	}
	/**
	 * Returns the content of the letter
	 * @return the content
	 */
	public T getContent() {
		return content;
	}
	
	/**
	 * Action executed when the letter is opened
	 */
	public abstract void action();
	
	/**
	 * Returns the cost to send the letter
	 * @return the cost to send the letter
	 */
	public abstract int getCost();

	/**
	 * Returns a String defining the letter
	 * @return a String defining the letter
	 */
	public abstract String toString();
}